package jtm.tasks.fundamentals;

import java.util.Arrays;

public class ArrayLeaders { /*
							 * TODO Given an array/list [] of integers , Find
							 * all the LEADERS in the array. An element is
							 * leader if it is greater than The Sum all the
							 * elements to its right side.
							 *
							 * Array size is at least 3 . Array numbers Will be
							 * mixture of positives , negatives and zeros
							 * Repetition of numbers in the array could occur.
							 * Returned Array should store the leading numbers
							 * in the same order in the original array.
							 */
	public static int[] arrayLeaders(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
		int[] massiveLeader = new int[numbers.length];
		boolean leader = true;
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				sum = sum + numbers[j];
			}
			if (numbers[i] <= sum) {
				leader = false;
				// break;
			} else {
				massiveLeader[k] = numbers[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(massiveLeader));
		int m = k--;
		int[] massiveLeaderFinal = new int[m];
		for (int l = 0; l < m; l++) {
			massiveLeaderFinal[l] = massiveLeader[l];
		}
		System.out.println(Arrays.toString(massiveLeaderFinal));
		return massiveLeaderFinal;
	}
}