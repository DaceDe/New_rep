package jtm.tasks.fundamentals;

import java.util.Arrays;

public class DiceHistogram {

	/*
	 * TODO A 6-sided die is rolled a number of times and the results are
	 * plotted as a character-based histogram.
	 * 
	 * You will be passed the dice value frequencies, and your task is to write
	 * the code to return a string representing a histogram, so that when it is
	 * printed it has the same format as the example.
	 * 
	 * 
	 * There are no trailing spaces on the lines All lines (including the last)
	 * end with a newline \n A count is displayed beside each bar except where
	 * the count is 0 The number of rolls may vary but there are never more than
	 * 100
	 * 
	 * Example: [7,3,10,1,0,5] =>
	 * 
	 * 6|##### 5 5| 4|# 1 3|########## 10 2|### 3 1|####### 7
	 */
	public static String histogram(final int results[]) {

		//System.out.println(Arrays.toString(results));
	//	int size = results.length;
		int[] arr = new int[results.length];

		for (int i = 1; i >= results.length; i--) {
			System.out.print(i + "|" + " ");
			for (int j = 0; j < results[i]; j++) {
				System.out.print(""+"#");
			}
			System.out.println(""+results[i]);

//		char[] chars = new char[size];
//		Arrays.fill(chars, '#');
//		String result = new String(chars);
//		System.out.println(result);
//
		}
		return Arrays.toString(results);

	}
}
