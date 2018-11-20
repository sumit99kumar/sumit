package com.app;

import java.util.Comparator;
import java.util.TreeSet;

public class IntegerNoSortWEx {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new Mycomprator());
		t.add(9);
		t.add(0);
		t.add(56);
		t.add(4);
		t.add(99);
		t.add(3);
		t.add(9);
		t.add(10);
		t.add(19);
		t.add(110);
		System.out.println(t);
	}

}
class Mycomptaror implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
       Integer i=(Integer)o1;
       Integer i2=(Integer)o2;
       
       if(i<i2)
       {
    	   return -1;
       }
       
       else if(i>i2) {
    	   return +1;
		
	}
       else
		return 0;
	}
	
}
