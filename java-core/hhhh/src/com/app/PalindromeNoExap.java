package com.app;

public class PalindromeNoExap {
	
public static void main(String[] args) {
	int num = 9999;
	  int copy = num;
	  int reverseNumber = 0;
	  int mod = 0;
	  while(copy != 0){
	     mod = copy % 10;
	     reverseNumber = reverseNumber * 10 + mod;
	     copy = copy /10;
	  }
	  if(num == reverseNumber){
	     System.out.println("Palindrome");
	   }else{
	      System.out.println("Not Palindrome");
	   }
	 }
	}