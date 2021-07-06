package com.group_study;

public class ClassOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		add (1,2);
        add (1,2,3);
	    subtract(1,2);
	    add (50,23,15,67);
	}
       
            static void add (int a, int b) {
    	    System.out.println(a+b);
            } 	
    	
    		static void add(int a, int b, int c) {
    	    System.out.println(a+b+c);	
    		}
    	
    		static void subtract (int c, int a) {
    		System.out.println(c-a);
    		}		
    		static void add (int a, int b, int c, int d) {
    			System.out.println(a+b+c+d);
    		}
    	}
    	
    		
 


