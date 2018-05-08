package com.homework.java;

import java.util.Scanner;

public class Dsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[7];
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入 7 个整数: ");
	    for (int i=0;i<7;i++) {
	        array[i] = scanner.nextInt();
		}
	    
	    array = bubbleSort(array);
	    
	    for (int i =0;i<array.length;i++) {
	          System.out.print(array[i]+" ");
	    }
	}
	    
	private static int[] bubbleSort(int[] array) {
		// TODO Auto-generated method stub
     	  
	    for (int j =0;j<array.length;j++) {
	    	for(int k =0;k<array.length-j-1;k++) {
	          if (array[k]>array[k+1]) {
	        	  int tmp = array[k];
	        	  array[k]= array[k+1];
	        	  array[k+1] =tmp;}
	        	  
	    	}   
	    } 	  
		
		
		return array;
	    	}
	    }	
	

		


	