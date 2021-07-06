package com.group_study;

public class ClassOverloading {

	public static void main(String[] args) {
	
		System.out.println (add(1,2));	
	
		System.out.println (add(1,2,3));
	 
		System.out.println(subtract(1,2));
		
	}
	
     public static int add (int a, int b) {
    
    	 return a+b;
     }
     public static int add (int a, int b, int c) {

	     return a+b+c;
     }     
	     public static int subtract (int a,int b) {
	    	 
	    return a-b;
	     }
}

   


