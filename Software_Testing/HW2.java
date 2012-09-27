/*
#################################################
# Programmer: Mitch Miller
# File: HW2.java
# Course: Software Testing and Quality Assurance
#################################################
*/

import java.io.*;

class HW2{
	public static void main(String[] args){
		testOne();
		System.out.println("Test one finished.");
		testTwo();
		System.out.println("Test two finished.");
		testThree();
		System.out.println("Test three finished.");
	}
	//Cyclomatic Complexity of this method is 2+N
	public static String searchArray(int[] LIST, int numElem, int A){
		for(int i=0; i<numElem; i++){
			if(LIST[i] == A){
				return "The number to be found was at position: " + Integer.toString(i) + " in the array.";
			}
		}
		return "Element not found.";
	}
	
	//Initial test to make sure that the function works as expected.
	public static void testOne(){
		System.out.println("Test One: Testing to make sure that the function works as expected.");
		int size=10;
		int[] LIST = new int[size];
		int A=6;
		for(int i=0; i<size; i++){
			LIST[i]=i;
		}
		
		String result=searchArray(LIST, size, A);
		
		System.out.println(result);
	}
	//A is not found
	public static void testTwo(){
		System.out.println("Test Two: Testing when A is not found.");
		int size=100;
		int[] LIST = new int[size];
		int A=101;
		for(int i=0; i<size; i+=100){
			LIST[i]=i;
		}
		
		String result=searchArray(LIST, size, A);
		
		System.out.println(result);
	}
	
	//Test for an empty array
	public static void testThree(){
		System.out.println("Test Three: Testing empty array.");
		int size=0;
		int[] LIST = new int[size];
		int A=6;
		for(int i=0; i<size; i++){
			LIST[i]=i;
		}
		
		String result=searchArray(LIST, size, A);
		
		System.out.println(result);
	}
}