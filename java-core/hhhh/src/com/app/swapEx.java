package com.app;

public class swapEx {

	public static void main(String[] args) {

		int a=40;
		int b=60;
		//int c=0;
		System.out.println("enter a no"+a);
		System.out.println("enter b no"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("-------------------------------");
		System.out.println("swap a no"+a);
		System.out.println("swap b no"+b);
	}

}
