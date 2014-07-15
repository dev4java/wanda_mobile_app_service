
package iMobile.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang.StringUtils;

public class DateUtil
{
	private static Calendar	c	= Calendar.getInstance();
	
	public static void main(String[] args)
	{
		String date1 = "2008-11-21 00:00:00";
		String date2 = "2009-05-05 00:00:00";
		System.out.println(date1.startsWith("2008-11"));
		System.out.println(date1.startsWith("2008-11", 7));
		// for (int i = 0; i < 100; i++)
		// {
		// System.out.println("nowTime 1=" + getRandomDateByDate1AndDate2(date1,
		// date2));
		// }
		System.out.println(getLastDayOfMonthStr(formatStringToDate(date1)));
		System.out.println(getLastDayOfMonthStr(formatStringToDate(date2)));
		String strDate = "2009��06��11��";
		Date d1 = DateUtil.formatCnDateToDate(strDate);
		Date d2 = new Date();
		System.out.println(DateUtil.formatDateToString(d1));
		System.out.println(DateUtil.formatDateToString(d2));
		// System.out.println(DateUtil.getRandomDateByDate1AndDate2("2008-12-01", "2008-12-31"));
		System.out.println(formatCnDateToDate2("2009��06��28�� 09ʱ15��"));
		System.out.println(formatDate(getDateBeforeDays(getToday0(), 1), "yyyy_MM_dd"));
	}
	
	/**
	 * @date Jun 3, 2010
	 * @author ��˧
	 * @see ��������:���ص���ʣ�������
	 * @see ��������:
	 * @return
	 */
	public static int getResidualSeconds()
	{
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int afiuSeconds = 60 * 60 * hour + 60 * minute + second;
		int residualSeconds = 86400 - afiuSeconds;
		return residualSeconds;
	}
	
	/**
	 * @date Sep 29, 2010
	 * @author ��˧
	 * @see ��������:��ȡ����ʱ���
	 * @see ��������:
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static String getDateDiff(Date d1, Date d2)
	{
		String diffStr = "";
		if (null == d1)
			d1 = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		long second1 = c1.getTimeInMillis() / 1000;
		long second2 = c2.getTimeInMillis() / 1000;
		long secondDiff = second1 - second2;
		if (secondDiff < 60)
		{
			diffStr = secondDiff + "����ǰ";
		}
		else if (secondDiff > 60 && secondDiff < 60 * 60)
		{
			diffStr = secondDiff / 60 + "����ǰ";
		}
		else if (secondDiff > 60 * 60 && secondDiff < 60 * 60 * 24)
		{
			diffStr = secondDiff / 60 / 60 + "Сʱǰ";
		}
		else if (secondDiff > 60 * 60 * 24 && secondDiff < 60 * 60 * 24 * 31)
		{
			diffStr = secondDiff / 60 / 60 / 24 + "��ǰ";
		}
		else if (secondDiff > 60 * 60 * 24 * 31 && secondDiff < 60 * 60 * 24 * 31 * 12)
		{
			diffStr = secondDiff / 60 / 60 / 24 / 31 + "����ǰ";
		}
		else
		{
			diffStr = formatDate(d2, "yyyy-MM-dd HH:mm");
		}
		// int second1 = c1.get(Calendar.SECOND);
		// int second2 = c2.get(Calendar.SECOND);
		// int secondDiff = second1 - second2;
		// if (secondDiff > 0 && secondDiff < 60)
		// diffStr = secondDiff + "����ǰ";
		// else
		// {
		// int minute1 = c1.get(Calendar.MINUTE);
		// int minute2 = c2.get(Calendar.MINUTE);
		// int minuteDiff = minute1 - minute2;
		// if (minuteDiff > 0 && minuteDiff < 60)
		// diffStr = minuteDiff + "����ǰ";
		// else
		// {
		// int hour1 = c1.get(Calendar.HOUR_OF_DAY);
		// int hour2 = c2.get(Calendar.HOUR_OF_DAY);
		// int hourDiff = hour1 - hour2;
		// if (hourDiff > 0 && hourDiff < 24)
		// diffStr = hourDiff + "Сʱǰ";
		// else
		// {
		// int day1 = c1.get(Calendar.DAY_OF_MONTH);
		// int day2 = c2.get(Calendar.DAY_OF_MONTH);
		// int dayDiff = day1 - day2;
		// if (dayDiff > 0 && dayDiff < 31)
		// diffStr = dayDiff + "��ǰ";
		// else
		// {
		// int month1 = c1.get(Calendar.MONTH) + 1;
		// int month2 = c2.get(Calendar.MONTH) + 1;
		// int monthDiff = month1 - month2;
		// if (monthDiff > 0 && monthDiff < 12)
		// diffStr = monthDiff + "��ǰ";
		// else
		// {
		// int year1 = c1.get(Calendar.YEAR);
		// int year2 = c2.get(Calendar.YEAR);
		// if (year1 - year2 > 0)
		// diffStr = formatDate(d2, "yyyy-MM-dd");
		// }
		// }
		// }
		// }
		// }
		// int year1 = c1.get(Calendar.YEAR);
		// int year2 = c2.get(Calendar.YEAR);
		// if (year1 - year2 > 0)
		// diffStr = year1 - year2 + "��";
		// else
		// {
		// int month1 = c1.get(Calendar.MONTH) + 1;
		// int month2 = c2.get(Calendar.MONTH) + 1;
		// if (month1 - month2 > 0)
		// diffStr = month1 - month2 + "��";
		// else
		// {
		// int day1 = c1.get(Calendar.DAY_OF_MONTH);
		// int day2 = c2.get(Calendar.DAY_OF_MONTH);
		// if (day1 - day2 > 0)
		// diffStr = day1 - day2 + "��";
		// else
		// {
		// int hour1 = c1.get(Calendar.HOUR_OF_DAY);
		// int hour2 = c2.get(Calendar.HOUR_OF_DAY);
		// if (hour1 - hour2 > 0)
		// diffStr = hour1 - hour2 + "Сʱ";
		// else
		// {
		// int minute1 = c1.get(Calendar.MINUTE);
		// int minute2 = c2.get(Calendar.MINUTE);
		// if (minute1 - minute2 > 0)
		// diffStr = minute1 - minute2 + "����";
		// else
		// {
		// int second1 = c1.get(Calendar.SECOND);
		// int second2 = c2.get(Calendar.SECOND);
		// if (second1 - second2 > 0)
		// diffStr = second1 - second2 + "����";
		// }
		// }
		// }
		// }
		// }
		return diffStr;
	}
	
	/**
	 * @date 2008-11-9����09:19:23
	 * @author ��˧
	 * @see ��������:��ʼ�͵�ǰʱ��֮��������һ��ʱ�䣬�������ʼ��С�Ļ�������Ĭ����ʼʱ�俪ʼ
	 * @see ��������
	 * @param startDate
	 *        ��ʼʱ�䣬������"yyyy-MM-dd HH:mm:ss"����ĸ�ʽ
	 * @return
	 */
	public static String getRandomDateAfterAndBeforeCurrentDate(String startDate)
	{
		String latestQing6Date = "2009-01-01 00:00:00";
		if (startDate != null && DateUtil.isDateBefore(startDate, latestQing6Date) == false)
		{
			latestQing6Date = startDate;
		}
		Date d1 = formatStringToDate(latestQing6Date);
		Date d2 = new Date();
		long time1 = d1.getTime();
		long time2 = d2.getTime();
		long dif = Math.abs(time1 - time2);
		long rnd = Math.round(Math.random() * dif);
		long randomTime = Math.min(time1, time2) + rnd;
		Date randomDate = new Date(randomTime);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �涨���ڸ�ʽ
		String today = formatter.format(randomDate); // ��Dateת��Ϊ��ϸ�ʽ��String
		return today;
	}
	
	/**
	 * @date 2008-11-9����09:19:23
	 * @author ��˧
	 * @see ��������:��date1 ��date2������������ȡһ��ʱ�䣬������
	 * @see ��������
	 * @param date1
	 *        ������"yyyy-MM-dd HH:mm:ss"����ĸ�ʽ
	 * @param date2
	 *        ������"yyyy-MM-dd HH:mm:ss"����ĸ�ʽ
	 * @return
	 */
	public static String getRandomDateByDate1AndDate2(String date1, String date2)
	{
		Date d1 = formatStringToDate(date1);
		Date d2 = formatStringToDate(date2);
		long time1 = d1.getTime();
		long time2 = d2.getTime();
		long dif = Math.abs(time1 - time2);
		long rnd = Math.round(Math.random() * dif);
		long randomTime = Math.min(time1, time2) + rnd;
		Date randomDate = new Date(randomTime);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �涨���ڸ�ʽ
		String today = formatter.format(randomDate); // ��Dateת��Ϊ��ϸ�ʽ��String
		return today;
	}
	
	/**
	 * @date 2009-6-24
	 * @author Administrator
	 * @see ��������:yyyy��MM��dd��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatCnDateToDate(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd��");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-30
	 * @author ��˧
	 * @see ��������: ����yyyy��MM��dd�� HH:mm:ss ��ʽת����ʱ������
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatCnDateToDate1(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-30
	 * @author ��˧
	 * @see ��������: ����ch��ʽת����ʱ������
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatStringToDateByFormat(String strDate, String format)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-30
	 * @author ��˧
	 * @see ��������:2009��06��28�� 09ʱ15��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatCnDateToDate2(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-29
	 * @author ��˧
	 * @see ��������: yyyy/MM/dd ת��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatNumDateToDate(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-29
	 * @author ��˧
	 * @see ��������: yyyy-MM-dd ת��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatDateToDate(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-7-6
	 * @author ��˧
	 * @see ��������:yyyy-M-d ת��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatStringDateToDate(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-24
	 * @author Administrator
	 * @see ��������:yyyy-MM-dd HH:mm:ss
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatStringToDate(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-30
	 * @author ��˧
	 * @see ��������: ��yyyy-M-dd H:mm:ss��ʽ����ת��Ϊdate��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatStringToDate2(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd H:mm:ss");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @date 2009-6-30
	 * @author ��˧
	 * @see ��������: ��yyyy-MM-dd HH:mm��ʽ����ת��Ϊdate��
	 * @see ��������:
	 * @param strDate
	 * @return
	 */
	public static Date formatStringToDate3(String strDate)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date _formatStringToDate(String strDate) throws ParseException
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.parse(strDate);
	}
	
	public static Date formatStringToDate(String strDate, String format)
	{
		if (null == strDate)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;
		try
		{
			date = formatter.parse(strDate);
		}
		catch (Exception e)
		{
			System.err.println("Format string to date error!");
			e.printStackTrace();
		}
		return date;
	}
	
	public static String formatStringDateToString(String date, String format)
	{
		if (null == date)
			return null;
		Date newDate = formatStringToDate(date, format);
		if (newDate == null)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String strDate = formatter.format(newDate);
		return strDate;
	}
	
	/**
	 * @date Jun 11, 2010
	 * @author ��˧
	 * @see ��������:
	 * @see ��������:
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDateToString(Date date, String format)
	{
		if (null == date || StringUtils.isBlank(format))
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		try
		{
			String strDate = formatter.format(date);
			return strDate;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	
	public static String formatStringToString(String strDate, String format)
	{
		if (StringUtils.isBlank(strDate) || StringUtils.isBlank(format))
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		try
		{
			Date date = formatter.parse(strDate);
			return formatter.format(date);
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	
	public static String formatDateToString(Date date)
	{
		if (null == date)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(date);
		return strDate;
	}
	
	public static String formatDateToString1(Date date)
	{
		if (null == date)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(date);
		return strDate;
	}
	
	public static Date formatStringToDate(Date date) throws ParseException
	{
		if (null == date)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(date);
		return formatter.parse(strDate);
	}
	
	public static Date formatStringToDate1(String date) throws ParseException
	{
		if (null == date)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(date);
		return formatter.parse(strDate);
	}
	
	/**
	 * �õ���currDate��ǰ��hoursСʱ������,ע�ⲻ�ܼ��㳬��20*24Сʱ�����ڣ� ��Ҫ����������֮ǰ�����ڣ����ú����getDateBeforeDays()������
	 * 
	 * @param currDate
	 * @param hours
	 * @return
	 * @author ��˧ 2006-11-9
	 */
	public static Date getDateBeforeHours(Date currDate, int hours)
	{
		if (null == currDate)
			return null;
		long longCurr = currDate.getTime();
		long longPre = longCurr - hours * 3600000;
		Date preDate = new Date(longPre);
		return preDate;
	}
	
	public static String getDateBeforeHours(String currDate, int hours)
	{
		if (null == currDate)
			return null;
		Date dateCurr = formatStringToDate(currDate);
		Date datePre = getDateBeforeHours(dateCurr, hours);
		return formatDateToString(datePre);
	}
	
	/**
	 * �õ���currDate��ǰ��days������ڡ�
	 * 
	 * @param currDate
	 * @param days
	 * @return
	 * @author ��˧ 2006-11-15
	 */
	public static Date getDateBeforeDays(Date currDate, int days)
	{
		if (null == currDate)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(currDate);
		working.add(Calendar.DAY_OF_MONTH, -days);
		Date newDate = working.getTime();
		return newDate;
	}
	
	public static String getDateBeforeDays(String currDate, int days)
	{
		if (null == currDate)
			return null;
		Date dateCurr = formatStringToDate(currDate);
		Date datePre = getDateBeforeDays(dateCurr, days);
		return formatDateToString(datePre);
	}
	
	public static String getDateBeforeDaysStr(Date currDate, int days)
	{
		if (null == currDate)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(currDate);
		working.add(Calendar.DAY_OF_MONTH, -days);
		Date newDate = working.getTime();
		return formatDateToString1(newDate);
	}
	
	/**
	 * ��ݵ�ǰ����currDateȡÿ�ܵĵڼ�������ڣ�nΪCalendar��ľ�̬��������Calendar.SUNDAY��Calendar.SATURDAY�� ���紫���currDate=2007-01-24 09:43:26������������dayΪCalendar.SUNDAY����ô�� ���ص�������Ϊ2007-01-21 09:43:26��
	 * 
	 * @param currDate
	 * @param day
	 * @return
	 * @author ��˧ 2007-1-24
	 */
	public static Date getDateOfWeek(Date currDate, int day)
	{
		if (null == currDate || day < 1 || day > 7)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(currDate);
		working.set(Calendar.DAY_OF_WEEK, day);
		Date newDate = working.getTime();
		return newDate;
	}
	
	// �ж�2��ʱ��� �Ƿ��� ����
	public static boolean isDateExceededMinutes(Date date1, Date date2, int minutes)
	{
		if (null == date1 || null == date2 || minutes <= 0)
			return false;
		long longDate1 = date1.getTime();
		long longDate2 = date2.getTime();
		long threshold = minutes * 60 * 1000;
		if ((longDate1 - longDate2) > threshold)
			return true;
		else
			return false;
	}
	
	// ��2��ʱ��� ����3λС��
	public static String distanceMinutes(Date date1, Date date2)
	{
		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.000");
		double longDate1 = date1.getTime();
		double longDate2 = date2.getTime();
		double resultLong = (longDate1 - longDate2) / 1000 / 60;
		return df.format(resultLong);
	}
	
	public static String getDateOfWeek(String currDate, int day)
	{
		if (null == currDate || day < 1 || day > 7)
			return null;
		Date dateCurr = formatStringToDate(currDate);
		Date dateTarget = getDateOfWeek(dateCurr, day);
		return formatDateToString(dateTarget);
	}
	
	/**
	 * ��ݵ�ǰ����currDate�õ���ǰ��weeks����֮������ڣ���������currDate=2007-01-24 09:43:26,weeks=2, �򷵻�����Ϊ2007-01-10 09:43:26��
	 * 
	 * @param currDate
	 * @param weeks
	 * @return
	 * @author ��˧ 2007-1-24
	 */
	public static Date getDateBeforeWeeks(Date currDate, int weeks)
	{
		if (null == currDate)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(currDate);
		working.add(Calendar.WEEK_OF_YEAR, -weeks);
		Date newDate = working.getTime();
		return newDate;
	}
	
	public static String getDateBeforeWeeks(String currDate, int weeks)
	{
		if (null == currDate)
			return null;
		Date dateCurr = formatStringToDate(currDate);
		Date dateTarget = getDateBeforeWeeks(dateCurr, weeks);
		return formatDateToString(dateTarget);
	}
	
	/**
	 * ��ݵ�ǰ����currDate�õ���ǰ��weeks����֮������ڣ�Ȼ���ٸ��day��ȡ����һ�����ڼ������ڣ� ��������currDate=2007-01-24 09:43:26,weeks=2,day=Calendar.SUNDAY�����ȵõ�����֮ǰ������2007-01-10 09:43:26�� Ȼ���ٵõ����յ�����2007-01-07 09:43:26��
	 * 
	 * @param currDate
	 * @param weeks
	 * @param day
	 * @return
	 * @author ��˧ 2007-1-24
	 */
	public static Date getDateBeforeWeeksDay(Date currDate, int weeks, int day)
	{
		if (null == currDate || day < 1 || day > 7)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(currDate);
		working.add(Calendar.WEEK_OF_YEAR, -weeks);
		working.set(Calendar.DAY_OF_WEEK, day);
		Date newDate = working.getTime();
		return newDate;
	}
	
	/**
	 * @date Oct 15, 2009
	 * @author yuyz
	 * @see ��������: ��ȡ��ǰ���������ڼ�
	 * @see ��������:
	 * @param dt
	 * @return ��ǰ���������ڼ�
	 */
	public static String getWeekOfDate(Date dt)
	{
		String[] weekDays = { "������", "����һ", "���ڶ�", "������", "������", "������", "������" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}
	
	public static String getDateBeforeWeeksDay(String currDate, int weeks, int day)
	{
		if (null == currDate || day < 1 || day > 7)
			return null;
		Date dateCurr = formatStringToDate(currDate);
		Date dateTarget = getDateBeforeWeeksDay(dateCurr, weeks, day);
		return formatDateToString(dateTarget);
	}
	
	/**
	 * �õ�������date������ʼ����һʱ�̣������date=2006-03-14 15:29:20, �򷵻�2006-03-01 00:00:00.
	 * 
	 * @param date
	 * @return
	 * @author ��˧ 2006-11-16
	 */
	public static Date getBeginTimeOfTheMonth(Date date)
	{
		if (null == date)
			return null;
		Calendar working = (Calendar) c.clone();
		working.setTime(date);
		working.set(Calendar.DAY_OF_MONTH, 1);
		working.set(Calendar.HOUR_OF_DAY, 0);
		working.set(Calendar.MINUTE, 0);
		working.set(Calendar.SECOND, 0);
		Date newDate = working.getTime();
		return newDate;
	}
	
	public static String getBeginTimeOfTheMonth(String date)
	{
		if (null == date || "".equals(date))
			return null;
		Date dateCurr = formatStringToDate(date);
		Date dateNew = getBeginTimeOfTheMonth(dateCurr);
		return formatDateToString(dateNew);
	}
	
	/**
	 * @date 2009-6-1
	 * @author ��˧
	 * @see ��������:��ô�������ڵĵ�ǰ�µ����һ��
	 * @see ��������:
	 * @param sDate1
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static Date getLastDayOfMonth(Date date)
	{
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(date);
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(lastDay);
		return lastDate;
	}
	
	@SuppressWarnings("deprecation")
	public static Date getLastDayOfMonth(String strDate)
	{
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(formatStringToDate(strDate));
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(lastDay);
		return lastDate;
	}
	
	@SuppressWarnings("deprecation")
	public static String getLastDayOfMonthStr(Date date)
	{
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(date);
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(lastDay);
		return formatDateToString(lastDate);
	}
	
	@SuppressWarnings("deprecation")
	public static String getLastDayOfMonthStr(String strDate)
	{
		Calendar cDay1 = Calendar.getInstance();
		cDay1.setTime(formatStringToDate(strDate));
		final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date lastDate = cDay1.getTime();
		lastDate.setDate(lastDay);
		return formatDateToString(lastDate);
	}
	
	/**
	 * �ж���������֮��ľ����Ƿ񳬹���ָ����Сʱ��hours
	 * 
	 * @param date1
	 * @param date2
	 * @param hours
	 * @return
	 */
	public static boolean isDateExceeded(Date date1, Date date2, int hours)
	{
		if (null == date1 || null == date2 || hours <= 0)
			return false;
		long longDate1 = date1.getTime();
		long longDate2 = date2.getTime();
		long threshold = new Long(hours) * 3600000;
		if (Math.abs(longDate1 - longDate2) > threshold)
			return true;
		else
			return false;
	}
	
	/**
	 * �ж���������֮��ľ����Ƿ񳬹���ָ���ķ���minutes
	 * 
	 * @param date1
	 * @param date2
	 * @param hours
	 * @return
	 */
	public static boolean isDateExceededForMinutes(Date date1, Date date2, int minutes)
	{
		if (null == date1 || null == date2 || minutes <= 0)
			return false;
		long longDate1 = date1.getTime();
		long longDate2 = date2.getTime();
		long threshold = new Long(minutes) * 60000;
		if (Math.abs(longDate1 - longDate2) > threshold)
			return true;
		else
			return false;
	}
	
	/**
	 * @date 2009-5-26
	 * @author �����
	 * @see ��������:��ȡ��������ʱ��͵�ǰʱ���ʱ����������ٷ���
	 * @see ��������:
	 * @param date2
	 * @param minutes
	 * @return
	 */
	public static String getMinutesBetwenNow(Date date2, int minutes)
	{
		Date date1 = getToday0();
		if (null == date1 || null == date2 || minutes <= 0)
			return "";
		long longDate1 = date1.getTime();
		long longDate2 = date2.getTime();
		long threshold = new Long(minutes) * 60000;
		if (Math.abs(longDate1 - longDate2) > threshold)
			return "";
		else
			return String.valueOf(Math.abs(longDate1 - longDate2) / 60000);
	}
	
	public static boolean isDateExceeded(String strDate1, String strDate2, int hours)
	{
		if (null == strDate1 || null == strDate1 || hours <= 0)
			return false;
		Date date1 = formatStringToDate(strDate1);
		Date date2 = formatStringToDate(strDate2);
		return isDateExceeded(date1, date2, hours);
	}
	
	public static boolean isDateExceeded(long time1, long time2, int hours)
	{
		long threshold = new Long(hours) * 3600000;
		if (Math.abs(time1 - time2) > threshold)
			return true;
		else
			return false;
	}
	
	/**
	 * @date 2009-6-12
	 * @author ��˧
	 * @see ��������: ���ĳ��ʱ�� month���º��ʱ��
	 * @see ��������:
	 * @param date
	 *        ʱ���ʽ 2007-8-13 15:06:01
	 * @param month
	 *        Ҫ�õ��ļ����µĸ���
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static Date getDateAfterMonth(Date date, int month)
	{
		if (date == null || null == date)
			return null;
		else
		{
			date.setMonth(date.getMonth() + month);
			return date;
		}
	}
	
	@SuppressWarnings("deprecation")
	public static Date getDateAfterMonth(String date, int month)
	{
		if (date == null || null == date)
			return null;
		else
		{
			Date returnDate = formatStringToDate(date);
			returnDate.setMonth(returnDate.getMonth() + month);
			return returnDate;
		}
	}
	
	/**
	 * �ҳ���������dates�����ϵ�һ�����ڡ�
	 * 
	 * @param dates
	 * @return
	 * @author ��˧ 2006-11-16
	 */
	public static String findOldestDate(String[] dates)
	{
		if (null == dates || dates.length < 1)
			return null;
		int len = dates.length;
		String oldestDate = dates[0];
		for (int i = 0; i < len; i++)
			for (int j = i + 1; j < len; j++)
				if (dates[j].compareTo(dates[i]) < 0)
					oldestDate = dates[j];
		return oldestDate;
	}
	
	/**
	 * ȡ����������ʱ��֮���ʱ���
	 * 
	 * @param date1
	 * @param date2
	 * @param hours
	 * @return
	 */
	public static String getDiffDate(Date date1, Date date2)
	{
		if (null == date1 || null == date2)
			return "�޷��Ƚ�";
		long longDate1 = date1.getTime();// ��λ����
		long longDate2 = date2.getTime();// ��λ����
		long diff = Math.abs(longDate1 - longDate2) / 1000;// ��λΪ��
		long day = diff / 86400;
		long hour = (diff - day * 86400) / 3600;
		long minute = (diff - day * 86400 - hour * 3600) / 60;
		long second = (diff - day * 86400 - hour * 3600) - minute * 60;
		return String.valueOf(day) + "��" + String.valueOf(hour) + "ʱ" + String.valueOf(minute) + "��" + String.valueOf(second) + "��";
	}
	
	/**
	 * @����:��˧ ʱ�䣺2007-8-13
	 * @�����������ж�ʱ��date1�Ƿ���ʱ��date2֮ǰ
	 * @����������ʱ���ʽ 2007-8-13 15:06:01
	 * @return boolean
	 */
	public static boolean isDateBefore(String date1, String date2)
	{
		try
		{
			DateFormat df = DateFormat.getDateTimeInstance();
			return df.parse(date1).before(df.parse(date2));
		}
		catch (ParseException e)
		{
			System.out.print("[SYS] " + e.getMessage());
			return false;
		}
	}
	
	/**
	 * @����:��˧ ʱ�䣺2007-8-13
	 * @�����������ж�ʱ��date1�Ƿ���ʱ��date2֮ǰ
	 * @����������ʱ���ʽ 2007-8-13 15:06:01
	 * @return boolean
	 */
	public static boolean isDateBefore(Date date1, Date date2)
	{
		return date1.before(date2);
	}
	
	/**
	 * @������������YYYY-MM-DD HH:MM:SS��ʽ���ؽ��������.
	 * @����������
	 * @return
	 */
	public static String getToday()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @date 2010-6-26
	 * @author cxx
	 * @see ��������:��yyyy-M-d���ص�ǰʱ��
	 * @see ��������:
	 * @return
	 */
	public static String getToday4()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @date 2010-6-26
	 * @author cxx
	 * @see ��������:��yyyy-MM-dd��ʽ���ص�ǰʱ��
	 * @see ��������:
	 * @return
	 */
	public static String getToday5()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	public static Date getToday0()
	{
		return formatStringToDate(getToday());
	}
	
	/**
	 * @������������YYYY-MM-DD HH:MM:SS��ʽ�������������.
	 * @����������
	 * @return
	 */
	public static String getYesterday()
	{
		long nowTime = System.currentTimeMillis();
		long yesterday = nowTime - 86400000;// ��һ��
		Date date = new Date(yesterday);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �涨���ڸ�ʽ
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		return today;
	}
	
	/**
	 * @date 2010-6-26
	 * @author cxx
	 * @see ��������:��yyyy-M-d��ʽ��������
	 * @see ��������:
	 * @return
	 */
	public static String getYesterday1()
	{
		long nowTime = System.currentTimeMillis();
		long yesterday = nowTime - 86400000;// ��һ��
		Date date = new Date(yesterday);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d"); // �涨���ڸ�ʽ
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		return today;
	}
	
	/**
	 * @������������YYYY-MM-DD HH:MM:SS��ʽ����ǰ�������.
	 * @����������
	 * @return
	 */
	public static String getTheDayBeforeYesterday()
	{
		long nowTime = System.currentTimeMillis();
		long yesterday = nowTime - 86400000 * 2;// ��һ��
		Date date = new Date(yesterday);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �涨���ڸ�ʽ
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @������������yyyy-MM-dd��ʽ���ؽ��������.
	 * @����������
	 * @return
	 */
	public static String getToday1()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @������������yyyy��MM��dd��HHʱmm��ss���ʽ���ؽ��������.
	 * @����������
	 * @return
	 */
	public static String getToday2()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @������������yyyyMMddHHmmss��ʽ���ؽ��������.
	 * @����������
	 * @return
	 */
	public static String getToday3()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @�������������ؽ�������.
	 * @����������
	 * @return
	 */
	public static String getYear()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @�������������ؽ�����·�.
	 * @����������
	 * @return
	 */
	public static String getMonth()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("MM"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @�������������ؽ����������.
	 * @����������
	 * @return
	 */
	public static String getDay()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @�������������ؽ���ĵ�ǰ��Сʱ
	 * @����������
	 * @return
	 */
	public static String getHours()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("HH"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @�������������ؽ���ĵ�ǰ�ķ�
	 * @����������
	 * @return
	 */
	public static String getMin()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("mm"); // �涨���ڸ�ʽ
		Date date = new Date(); // ����ϸ�ʽ��Stringת��ΪDate
		String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
		// System.out.print(today);
		return today;
	}
	
	/**
	 * @date Jul 24, 2009
	 * @author ��˧
	 * @see ��������:�Զ����ʽ��ʱ��
	 * @see ��������:
	 * @param date
	 * @param formatStr
	 * @return
	 */
	public static String formatDate(Date date, String formatStr)
	{
		if (date == null || StringUtils.isBlank(formatStr))
			return "";
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat(formatStr); // �涨���ڸ�ʽ
			formatter.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
			String today = formatter.format(date); // ��Dateת��Ϊ��ϸ�ʽ��String
			return today;
		}
		catch (Exception e)
		{
			return "";
		}
	}
	
	/**
	 * @date 2010-8-12
	 * @author cxx
	 * @see ��������:������ת����ISO-8601��ʽ
	 * @see ��������:
	 * @param date
	 * @return
	 */
	public static String formatDateToISO8601(Date date)
	{
		if (date == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.ssZ"); // �涨���ڸ�ʽ
		formatter.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		String sDate = formatter.format(date);
		return sDate = sDate.substring(0, sDate.length() - 2) + ":" + sDate.substring(sDate.length() - 2);
	}
	
	/**
	 * @date 2010-6-26
	 * @author cxx
	 * @see ��������:��yyyyMMddHH���ص�ǰʱ��
	 * @see ��������:
	 * @param date
	 * @return
	 */
	public static String getToday6(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHH"); // �涨���ڸ�ʽ
		return formatter.format(date);
	}
	
	public static String getHotHalfHourFormat(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd"); // �涨���ڸ�ʽ
		String min = getMin();
		String hours = getHours();
		String nowMin = "";
		String reDate = "";
		if (!StringUtils.isBlank(min))
		{
			if (Integer.parseInt(min) >= 30)
			{
				nowMin = "00";
				reDate = getToday6(date);
				return reDate + nowMin;
			}
			else
			{
				nowMin = "30";
				hours = (Integer.parseInt(hours) - 1) + "";
				return formatter.format(date) + hours + nowMin;
			}
		}
		else
		{
			nowMin = "00";
			reDate = getToday6(date);
			return reDate + nowMin;
		}
	}
	
	public static String getBarHotDateFormat(Date date)
	{
		String min = getMin();
		String nowMin = "";
		if (!StringUtils.isBlank(min))
		{
			if (Integer.parseInt(min) >= 30)
				nowMin = "30";
			else
				nowMin = "00";
		}
		return getToday6(date) + nowMin;
	}
	
	/**
	 * @date 2010-4-29
	 * @author cxx
	 * @see ��������:��ȡ�������Ǳ��ܵĵڼ��죨���գ�1����һ��2...��
	 * @see ��������:
	 * @param date
	 * @return
	 */
	public static int getWeekOfDay(Date date)
	{
		if (date == null)
			return 0;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int w = c.get(Calendar.DAY_OF_WEEK);
		return w;
	}
	
	public static String getCurrDateBeforeDays(int days)
	{
		Date beforeDate = getDateBeforeDays(new Date(), days);
		if (beforeDate == null)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd"); // �涨���ڸ�ʽ
		return formatter.format(beforeDate) + "0000";
	}
}
