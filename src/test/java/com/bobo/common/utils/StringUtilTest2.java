package com.bobo.common.utils;

import org.junit.Test;

public class StringUtilTest2 {

	
	
	@Test
	public void testIsEmail() {
		
	//	String str ="11154444@.qqcom";//邮箱
		String str ="11154444@.qqcom";//不是邮箱
		boolean b = StringUtil.isEmail(str);
		System.out.println(b);
		
	}

	@Test
	public void testIsPhoneNumber() {
		//String str ="13456789100";//是手机
		String str ="123456789100";//否
		boolean b = StringUtil.isPhoneNumber(str);
		System.out.println(b);
	}

	@Test
	public void testIsNumber() {
		//String str ="3.1415926";//是
		String str ="3.1415926a";//否
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}

}
