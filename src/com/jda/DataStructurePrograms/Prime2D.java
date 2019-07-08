package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.utility;

public class Prime2D {
	public static void main(String args[]) {
		String[][] prime = new String[10][25];
		utility util = new utility();
		System.out.println("Start");
		int strt=util.inputInteger();
		System.out.println("end");
		int end=util.inputInteger();
		ArrayList<Integer> array = util.prime(strt, end);
		int row = 0;
		int col = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				prime[i][j] = " ";

			}
		} 

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
