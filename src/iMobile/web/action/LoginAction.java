
package iMobile.web.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginAction
{
	
	/**
	 * ��֤��ͼƬ�Ŀ�ȡ�
	 */
	private int		width			= 60;
	
	/**
	 * ��֤��ͼƬ�ĸ߶ȡ�
	 */
	private int		height			= 28;
	
	/**
	 * ��֤���ַ����
	 */
	private int		codeCount		= 4;
	
	/**
	 * xx
	 */
	private int		xx				= 0;
	
	/**
	 * ����߶�
	 */
	private int		fontHeight;
	
	/**
	 * codeY
	 */
	private int		codeY;
	
	/**
	 * codeSequence
	 */
	private char[]	codeSequence	= { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String toLogin(Model model, HttpServletRequest request, HttpServletResponse response)
	{
		Object loginMessage = request.getSession().getAttribute("loginMessage");
		model.addAttribute("loginMessage", loginMessage);
		return "user/login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String doLogin(Model model, HttpServletRequest request, HttpServletResponse response)
	{
		Object loginMessage = request.getSession().getAttribute("loginMessage");
		model.addAttribute("loginMessage", loginMessage);
		return "user/index";
	}
	
	@RequestMapping(value = "/verifyCode.do")
	public void verifyCode(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException
	{
		xx = width / (codeCount + 1);
		fontHeight = height - 4;
		codeY = height - 4;
		
		BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D gd = buffImg.createGraphics();
		
		Random random = new Random();
		
		gd.setColor(Color.decode("#fcf9f9"));
		gd.fillRect(0, 0, width, height);
		
		Font font = new Font("Courier New", Font.PLAIN, fontHeight);
		gd.setFont(font);
		
		gd.setColor(Color.decode("#cacecd"));
		gd.drawRect(0, 0, width - 1, height - 1);
		
		// gd.setColor(Color.BLACK);
		// for (int i = 0; i < 160; i++)
		// {
		// int x = random.nextInt(width);
		// int y = random.nextInt(height);
		// int xl = random.nextInt(12);
		// int yl = random.nextInt(12);
		// gd.drawLine(x, y, x + xl, y + yl);
		// }
		
		StringBuffer randomCode = new StringBuffer();
		int red = 0, green = 0, blue = 0;
		
		for (int i = 0; i < codeCount; i++)
		{
			String strRand = String.valueOf(codeSequence[random.nextInt(26)]);
			red = random.nextInt(255);
			green = random.nextInt(255);
			blue = random.nextInt(255);
			
			gd.setColor(new Color(red, green, blue));
			gd.drawString(strRand, i * xx + 5, codeY);
			
			randomCode.append(strRand);
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("validateCode", randomCode.toString());
		
		resp.setHeader("Pragma", "no-cache");
		resp.setHeader("Cache-Control", "no-cache");
		resp.setDateHeader("Expires", 0);
		
		resp.setContentType("image/gif");
		
		ServletOutputStream sos = resp.getOutputStream();
		ImageIO.write(buffImg, "gif", sos);
		sos.close();
	}
}
