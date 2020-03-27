package com.bobo.common.utils;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: charles
 * @date: 2020年3月27日 上午8:56:01
 */
public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate 和endDate 的随机日期
	 * @param startDate
	 * @param endDate
	 * @return 1970 .1.1 日
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		
		long t1 = startDate.getTime();//从1970到startDate 的毫秒数
		long t2 = endDate.getTime();//从1970到endDate 的毫秒数
		if(t2<t1)
		throw new RuntimeException("开始日期不能大于结束日期");
		
		//随机产生一个在t1 和t2 之间的毫秒数
		long t =(long) ((Math.random()* (t2-t1)) + t1);
		
		return new Date(t);
		
	}

}
