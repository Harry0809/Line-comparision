package com.line.comparision;

public class LineComparision {

	int x1, x2, y1, y2;
	int a1, a2, b1, b2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Line Comparision");
		LineComparision method = new LineComparision();
		method.Length();
	}

	public void Length() {
		Double distance_a, distance_b;
		x1 = 1;
		y1 = 5;
		x2 = 6;
		y2 = 6;
		a1 = 1;
		b1 = 5;
		a2 = 7;
		b2 = 6;
		distance_a = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		System.out.println("Calculated len1" + distance_a);
		distance_b = Math.sqrt(Math.pow((a2 - a1), 2) + (Math.pow((b2 - b1), 2)));
		System.out.println("Calculated len2:" + distance_b);
		if (distance_a.equals(distance_b)) {
			System.out.println("Line are Equal");

		} else {
			System.out.println("Line are Not Equal");
		}

	}


}
