package com.jda.DataStructurePrograms;

import java.util.HashMap;

import com.jda.utility.Que;
import com.jda.utility.utility;
import com.jda.utility.Que.Node;

public class WeekDay {
	public static void main(String args[]) {
		utility util = new utility();
		HashMap<Integer, Que> array=new HashMap<>();
		for (int i = 0; i < 6; i++) {
			array.put(i, null);
		}

		System.out.println("please enter the month");
		int month = util.inputInteger();
		System.out.println("please enter the year");
		int year = util.inputInteger();
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && util.leapyear(year))
			days[month] = 29;
		System.out.print(" " + months[month] + " " + year);
		System.out.println();
		System.out.print("  S  M Tu  W Th  F  S");
		System.out.println();
		int d = util.day(1, month, year);
		int count = 1;
		for (int i = 0; i < 6; i++) {
			Que queue = new Que();
			array.put(i, queue);
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < d)
					array.get(i).enqueue(0,0);
				else {
					if (count <= days[month]) {
						array.get(i).enqueue(count,0);
						count++;
					} else
						array.get(i).enqueue(0,0);
				}

			}

		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				 Node temp=array.get(i).dequeue();
					int val =temp.key;
				if (val <= 9) {
					if (val == 0)
						System.out.print("   ");
					else
						System.out.print("  " + val);
				} else
					System.out.print(" " + val);
			}
			System.out.println();
		}
	}

}
