package com.linecomparison;

import java.util.Scanner;

public class Line {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to Line Comparison Computation");

		// variables
		double x1, y1, x2, y2; // line coordinates
		double lineLength1, lineLength2;
		// taking input from user
		System.out.println("enter the line coordinates for line1");
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		// calculating length of line1
		lineLength1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		System.out.println("enter the line coordinates for line1");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		// calculating length of line2
		lineLength2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		// converting Primitive to object
		Double lengthLine1 = Double.valueOf(lineLength1);
		Double lengthLine2 = Double.valueOf(lineLength2);
		boolean equalityCheck = lengthLine1.equals(lengthLine2);
		System.out.println("Two lines are equals: " + equalityCheck);
	}
}