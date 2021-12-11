package com.review1;

import java.lang.reflect.Array;

public class TwoDimArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2D array is array of arrays thats why when we calculate rows of array is simply 
//		Array.length , but when we calculate col of array is first element in first array.length
//		
		String[][] s = new String[3][5];

		System.out.println(s.length); // rows of array = length of array
		System.out.println(s[1].length); // col of array , as explained above
		
		
		s[0][0] = "first element";
		s[0][1] = "2nd element";
		s[0][2] = "3rd element";
		s[0][3] = "4th element";
		s[0][4] = "5th element";
		
		s[1][0] = "6th element";
		s[1][1] = "7th element";
		s[1][2] = "8d element";
		s[1][3] = "9th element";
		s[1][4] = "10th element";
		
		s[2][0] = "11th element";
		s[2][1] = "12th element";
		s[2][2] = "13th element";
		s[2][3] = "14th element";
		s[2][4] = "15th element";
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println(s[i][j]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
