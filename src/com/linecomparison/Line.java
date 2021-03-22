package com.linecomparison;

import java.util.Scanner;

public class Line {
public static void main(String args[]) {
	//welcome message
	System.out.println("Welcome to Line Comparison Computation");
	
	//variables
	double x1,y1,x2,y2; //line coordinates
	double lineLength1,lineLength2;
	//taking input from user
	System.out.println("enter the line coordinates for line1");
	Scanner s= new Scanner(System.in);
	x1=s.nextDouble();
	y1=s.nextDouble();
	x2=s.nextDouble();
	y2=s.nextDouble();
	//computation
	lineLength1= Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1,2));
	System.out.println("enter the line coordinates for line1");
	x1=s.nextDouble();
	y1=s.nextDouble();
	x2=s.nextDouble();
	y2=s.nextDouble();
	lineLength2= Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1,2));
	//converting Primitive to object
	System.out.println("line1 length "+lineLength1);
	System.out.println("line2 length "+lineLength2);
	Double Line1=Double.valueOf(lineLength1);
	Double Line2=Double.valueOf(lineLength2);
	int T=Line1.compareTo(Line2);
	if(T==0)
		System.out.println("Two lines are equals");
	else if(T>0)
		System.out.println("line1 is greater than line2");
	else
		System.out.println("line1 is less than line2");
}
}
