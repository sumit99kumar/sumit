package com.app;

public class StringStringBufferExp {
	public static void main(String[] args) {
		String s=new String("durga");
		s.concat("Software");
		System.out.println(s);

	StringBuffer sb=new StringBuffer("durga");
	//sb.concat("Software");
	sb.append("software");
	System.out.println(sb);
	String s1=new String("durga"); 
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	}

}
