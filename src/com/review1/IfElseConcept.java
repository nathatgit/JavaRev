package com.review1;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		// comparison operators <,>,==,<=,>= !=;
		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		int c = 20;
		int d = 20;

		if (c == d) {
			System.out.println("c is equal to d");

		} else {
			System.out.println("c is not equal to d");

		}

		// Write a logic to find highest number
		int a1 = 800;
		int b1 = 6200;
		int c1 = 1700;

		// Nested if

		if (a1 > b1 & a1 > c1) {
			System.out.println("a1 is highest");
		} else if (b1 > c1) {
			System.out.println("b1 is highest");
		} else {
			System.out.println("c1 is highest");
		}

		if (a1 > b1) {
			if (a1 > c1) {
				System.out.println("a1 is highest");
			} else {
				System.out.println("c1 is highest");
			}

		} else if (b1 > c1) {

			System.out.println("b1 is highest");
		} else {
			System.out.println("c1 is highest");

		}

	}

	
}
