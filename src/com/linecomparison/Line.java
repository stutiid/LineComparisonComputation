package com.linecomparison;

import java.util.Scanner;

public class Line {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to Line Comparison Computation");

		// variables
		double x1, y1, x2, y2; // line coordinates
		double lineLength;
		// taking input from user
		System.out.println("enter the line coordinates");
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		// computation of line length
		lineLength = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		System.out.println("Line length is " + lineLength);
	}
}
