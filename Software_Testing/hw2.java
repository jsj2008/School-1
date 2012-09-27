/*
#################################################
# Programmer: Mitch Miller
# File: HW2.java
#
#
#################################################
*/
//TODO: Construct Program graphs
//      Compute cyclomatic complexity
//      identify basis path sets with the maximal # of independent paths
//      Apply independent path testing to develop test cases that will 
//      	guarantee that all statements in the program have been tested.

import java.io.*;

class HW2{
	public static void main(String[] args){
		testOne();
		System.out.println("Test one finished.");
		testTwo();
		System.out.println("Test two finished.");
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
		int size=100;
		int[] LIST = new int[size];
		int A=101;
		for(int i=0; i<size; i+=100){
			LIST[i]=i;
		}
		
		String result=searchArray(LIST, size, A);
		
		System.out.println(result);
	}
	
	public static void testThree(){
		
	}
	
	public static void testFour(){
	
	}
}
