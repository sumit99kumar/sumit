package com.app;

public class Test {
	
	void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args){
	
		Test t = new Test();
		t.m1();
		Test.m2();
	}

}
