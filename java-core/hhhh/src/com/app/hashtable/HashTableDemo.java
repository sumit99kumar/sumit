package com.app.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable t=new Hashtable();
		t.put(new Temp(6),"A");
		t.put(new Temp(5),"f");
		t.put(new Temp(1),"j");
		t.put(new Temp(2),"x");
		
	}

}
class Temp{
	int i;

	public Temp(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i+"";
	}
	

	
	
	
	
	
	
}
