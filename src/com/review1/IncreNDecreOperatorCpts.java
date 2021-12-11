package com.review1;

public class IncreNDecreOperatorCpts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*************PostIncrement*****************");

		int i = 1;
		int j = i++;

		System.out.println(i + "\n" + j);

		System.out.println("************PreIncrement******************");

		int q = 4;
		int r = ++q;

		System.out.println(q + "\n" + r);

		System.out.println("**********PreDecrement********************");

		int q1 = 4;
		int r1 = --q1;

		System.out.println(q1 + "\n" + r1);

		System.out.println("***********PostDecrement*******************");

		int q2 = 4;
		int r2 = q2--;

		System.out.println(q2 + "\n" + r2);

	}

}
