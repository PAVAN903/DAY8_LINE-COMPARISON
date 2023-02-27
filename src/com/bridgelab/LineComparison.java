package com.bridgelab;

import java.util.Scanner;

public class LineComparison {
	public void line() {
		double lengthOfline;
		double lengthOfline1,lengthOfline2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line co ordinate x1,x2 and y1,y2");
		 lengthOfline1=getLength(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		 System.out.println("enter line co ordinate x1,x2 and y1,y2");
		 lengthOfline2=getLength(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		 System.out.println("value of line of length 1 ::"+lengthOfline1);
		 System.out.println("value of line of length 2 ::"+lengthOfline2);
		 if(lengthOfline1==lengthOfline2) {
			 System.out.println("both lines are equal");
		 }else {
			 System.out.println("both lines are not equal"); 
		 }
		
		
	}

	private double getLength(double x1,double x2,double y1, double y2) {
		
		return (( Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) ));
	}

	public static void main(String[] args) {
		System.out.println("welcome to line comparison ");
		LineComparison object =new LineComparison();
		object.line();
	

	}

}
