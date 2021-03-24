package com.linecomparison;

public class Line implements Comparable<Line> {

	// member variables
	private double x1, y1, x2, y2; // line coordinates
	private double lineLength = 0;

	public Line(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// member function to calculate length of a line
	public void getLineLength() {
		this.lineLength = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
	}

	// overriding equals method to check whether two lines have equal length or not
	@Override
	public boolean equals(Object obj) {
		Line temp = (Line) obj;
		if (this.lineLength == temp.lineLength)
			return true;
		else
			return false;
	}

	// overriding the method to get two lines are equal,less or greater than each
	// other based on their lengths
	@Override
	public int compareTo(Line temp) {
		// temp indicate object line2
		if (this.lineLength == temp.lineLength)
			return 0;
		else if (this.lineLength > temp.lineLength)
			return 1;
		else
			return -1;
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to Line Comparison Computation");
		Line line1 = new Line(3, 4, 9, 7);
		line1.getLineLength();
		Line line2 = new Line(9, 10, 4, 5);
		line2.getLineLength();
		System.out.println("line1 length " + line1.lineLength);
		System.out.println("line2 length " + line2.lineLength);
		// checking lines are equal or not
		boolean equalityCheck = line1.equals(line2);
		if (equalityCheck)
			System.out.println("line1 and line2 are equal");
		else
			System.out.println("line1 and line2 are not equal");
		// checking lines are equal,greater or smaller than one another
		int compareResult = line1.compareTo(line2); // implicitly passing line2 object
		if (compareResult == 0)
			System.out.println("Lines are of equal length");
		else if (compareResult > 0)
			System.out.println("Line1 is greater than line2");
		else
			System.out.println("Line1 is smaller than line2");
	}
}
