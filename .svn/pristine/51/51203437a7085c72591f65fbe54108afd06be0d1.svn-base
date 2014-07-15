
package iMobile.utils;

import java.util.Date;

/**
 * @author 王帅 本类里面的时间记录，采用logger.info(logTime.begin()); logger.info(logTime.end());方式调用
 */
public class LogTime
{
	Date	startDate;
	
	Date	lastDate;
	
	public LogTime()
	{
		startDate = new Date();
		lastDate = startDate;
	}
	
	public String begin()
	{
		startDate = new Date();
		lastDate = startDate;
		return "------------开始记录时间----------------------";
	}
	
	/**
	 * @date 2009-9-16
	 * @author 王帅
	 * @see 方法描述:记录从上一次打出时间到当前的时间差以及总执行时间
	 * @see 参数描述:
	 */
	public String end()
	{
		Date nowDate = new Date();
		String str = "-----区间时间=" + this.getDiffMilliSeconds(lastDate, nowDate) + "毫秒-----花费总时间=" + this.getDiffMilliSeconds(startDate, nowDate) + "毫秒";
		lastDate = nowDate;
		return str;
	}
	
	/**
	 * @date 2009-9-16
	 * @author 王帅
	 * @see 方法描述:指定序号,记录从上一次打出时间到当前的时间差以及总执行时间
	 * @see 参数描述:
	 */
	public String end(int xuHao)
	{
		Date nowDate = new Date();
		String str = "----" + xuHao + "----区间时间=" + this.getDiffMilliSeconds(lastDate, nowDate) + "毫秒-----花费总时间=" + this.getDiffMilliSeconds(startDate, nowDate) + "毫秒";
		lastDate = nowDate;
		return str;
	}
	
	public long getDiffMilliSeconds(Date date1, Date date2)
	{
		if (null == date1 || null == date2)
			return 0;
		long diff = Math.abs(date2.getTime() - date1.getTime());
		return diff;
	}
	
	/**
	 * @date 2009-1-14
	 * @author 王帅
	 * @see 方法描述:返回该类开始计时到当前时间的时间差，毫秒为单位
	 * @return
	 */
	public long getDiffMilliSeconds()
	{
		lastDate = new Date();
		long diff = Math.abs(lastDate.getTime() - startDate.getTime());
		return diff;
	}
	
	/**
	 * @date 2009-12-10
	 * @author 王帅
	 * @see 方法描述: 计算搜索用时 返回秒为单位
	 * @see 参数描述:
	 * @return
	 */
	public String searchEndTime()
	{
		Date nowDate = new Date();
		String str = this.getDiffSeconds(startDate, nowDate) + "秒";
		lastDate = nowDate;
		return str;
	}
	
	public double getDiffSeconds(Date date1, Date date2)
	{
		if (null == date1 || null == date2)
			return 0;
		double diff = ((double) (date2.getTime() - date1.getTime()) / 10000);
		return diff;
	}
}
