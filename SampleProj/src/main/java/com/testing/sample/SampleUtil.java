package com.testing.sample;

public class SampleUtil {

	
	public static Integer add(Integer a,Integer b) {
		System.out.println("SampleUtil.add()");
		if(a==null) {
			return null;
		}
		if(b==null) {
			return null;
		}
		return a+b;
	}
}
