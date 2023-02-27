package com.bridgelab;

import java.util.Scanner;

public class LineComparison {
	public void line() {
		double lengthOfline;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first line co ordinate x1");
		int x1=sc.nextInt();
		System.out.println("enter first line co ordinate x2");
		int x2=sc.nextInt();
		System.out.println("enter second line co ordinate y1");
		int y1=sc.nextInt();
		System.out.println("enter second line co ordinate");
		int y2=sc.nextInt();
		 lengthOfline=(Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ));
		System.out.println("length of line is "+lengthOfline);
	}

	public static void main(String[] args) {
		System.out.println("welcome to line comparison ");
		LineComparison object =new LineComparison();
		object.line();
	

	}

}
