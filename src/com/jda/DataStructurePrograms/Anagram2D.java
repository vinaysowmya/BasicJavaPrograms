package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.utility;

public class Anagram2D {
	public static void main(String args[]) {
		String[][] anagrm = new String[100][2];
		String[][] prime = new String[10][25];
		utility util = new utility();
		System.out.println("Start");
		int strt=util.inputInteger();
		System.out.println("end");
		int end=util.inputInteger();
		ArrayList<Integer> array=util.prime(strt,end);
		ArrayList<Integer> array1=util.prime(strt,end);
		int size=array.size();
		System.out.println();
		int row = 0;
		int col = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 2; j++) {
				anagrm[i][j] = " ";

			}
		} 
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				prime[i][j] = " ";

			}
		} 
		for(int i=0;i<size-1;i++)
		{
			String str1=	Integer.toString(array1.get(i));
			for(int j=i+1;j<size;j++)
			{
			
			String str2=	Integer.toString(array1.get(j));
	if(util.anagram(str1, str2))
	{
		anagrm[row][col]=str1;
		anagrm[row][col+1]=str2;
		row++;
		col=0;
		array.remove(array1.get(i));
		array.remove(array1.get(j));
	}
	
			}
		}
		System.out.println("Prime no that are anagrams");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(anagrm[i][j]+"  ");

			}
			System.out.println();
		}
		System.out.println("Prime no that are not anagrams");
		row=0;
		col=0;
		for (int i = 0; i < array.size(); i++) {
			if (row != (array.get(i))/100) {
				row = (array.get(i))/ 100;
				col = 0;
			}
			prime[row][col]=Integer.toString(array.get(i));
			col++;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(prime[i][j]+"  ");

			}
			System.out.println();
		}

	}

}
