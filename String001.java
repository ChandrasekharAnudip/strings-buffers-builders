package com.strings.demo;

public class String001 {

	public static void main(String[] args) {
		String s = "Hello";
		
		System.out.println(s);
		System.out.println(s.hashCode());
		
		String str = s;
		
		System.out.println(str);
		System.out.println(str.hashCode());
		
		/*
		final int n = 10;
		
		System.out.println(n);
		
		n=20;
		*/
		
		s = s + " world";
		
		System.out.println(s);
		System.out.println(s.hashCode());

	}

}
