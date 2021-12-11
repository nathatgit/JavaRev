package com.review1;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array :- to store similar dataType values a object
		int[] i = new int[3];
		int j;
		// Lower bound/index = 0
		// upper bound/ index = n-1 (n = size of array)
		/*one dim array or static array 
		 * disadvantage of 1D array Size is fixed , to overcome this
		 problem , we use collection/dynamic array  	like arraylist, hashtable
		 store similar datatypes : to overcome this
		 problem , we use object array *
		 */

		i[0] = 3;
		i[1] = 123;
		i[2] = 83;
		// Print all the values of array

		System.out.println(i[0] + "\n" + i[1] + "\n" + i[2]);
		System.out.println(i.length);

		for (j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// Double Array

		double[] d = new double[3];
		d[0] = 10.11;
		d[1] = 22.33;
		d[2] = 22.773;

		System.out.println(d[2]);

		System.out.println("value of j: " + j);

		// Char array

		char[] c = new char[j];

		System.out.println("value of j: " + c.length);

		c[0] = 'a';
		c[1] = 2;
		c[j - 1] = 'f';

		System.out.println(c[0]);
		
		// boolean array
		
		boolean[] b = new boolean[2];

		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);

		// String array
		
		String[] s = new String[2];
		s[0] = "New Array Concept";
		s[1] = "New Array Concept learning";

		System.out.println(s[1]);

		//Object array :- to store different data type in a array
		
		
		Object[] ob= new Object[6];
		ob[0]="Raghav";
		ob[1]=34;
		ob[2]=77.1;
		ob[3]="22/3/1001";
		ob[4]="Male";
		ob[5]="New Delhi";
		
		
		for(j=0;j<ob.length;j++)
		{
			System.out.println(ob[j]);
		}
		}
		
	}


