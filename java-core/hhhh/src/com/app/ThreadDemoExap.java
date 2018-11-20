package com.app;
class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child ");
		}
	}
	
}

public class ThreadDemoExap {
	public static void main(String[] args) {
		Mythread t=new Mythread();
		 
		t.start();
		{
			for(int i=0; i<=5;i++)
			{
				System.out.println("main");
			}
		}
		
	}

}
