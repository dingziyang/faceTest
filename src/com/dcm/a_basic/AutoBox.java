package com.dcm.a_basic;

/**
 * 自动拆装箱
 * @author xusanduo
 *
 */
public class AutoBox {
	
	public static void main(String[] args) {
		
		Integer a = 1; // Integer.valueOf(1)
        a ++; // int x = a.intValue()拿到int值，然后x++，再然后Integer.valueOf(x)
        System.out.println(a);
	}
}
