package com.app;

import java.util.Comparator;
import java.util.TreeSet;

import javax.print.attribute.standard.RequestingUserName;

import org.omg.CORBA.OMGVMCID;

public class IntegerNoCustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new Mycomprator());
		
		t.add(10);
		t.add(0);
		t.add(30);
         t.add(5);
         t.add(7);
         t.add(13);
         t.add(54);
         t.add(3);
         System.out.println(t);
         
	}

}
class Mycomprator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//Integer i1=(Integer)o1;
		//Integer i2=(Integer)o2;
		/*if(i1<i2)
		return +1;
	 else if(i1>i2)
		 
		return -1;
	
	else
	return 0;*/
		//return i1.compareTo(i2);
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		//return +1;
		//return -1;
		return 0;
	}
}
