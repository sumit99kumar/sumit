package com.app;


public class StaticQuiz {

   static int a = 5;
   
   static{
       a = a + 5;
   }
   
   static void square(int num){
       System.out.println("Square of " + num + " = " + num*num);
   }

   public static void main(String[] args) {
       int a = 5;
       square(a);
   }

}