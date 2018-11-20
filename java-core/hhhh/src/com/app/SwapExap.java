package com.app;

public class SwapExap {
	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("enter first no"+a);
		System.out.println("enter second no"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swap no"+a );
		System.out.println("Swap no"+b);
	}

}
