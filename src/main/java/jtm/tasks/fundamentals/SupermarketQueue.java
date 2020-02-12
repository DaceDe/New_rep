package jtm.tasks.fundamentals;

import jtm.activity03.Array;

import java.util.Arrays;

public class SupermarketQueue {

	/*
	 * TODO There is a queue for the self-checkout tills at the supermarket.
	 * Your task is write a function to calculate the total time required for
	 * all the customers to check out!
	 * 
	 * Input: customers: an array of positive integers representing the queue.
	 * Each integer represents a customer, and its value is the amount of time
	 * they require to check out. n: a positive integer, the number of checkout
	 * tills. Output The function should return an integer, the total time
	 * required.
	 * 
	 * Examples: queueTime([5,3,4], 1) => should return 12 Because when there is
	 * 1 till, the total time is just the sum of the times
	 * 
	 * queueTime([10,2,3,3], 2) => should return 10 Because here n=2 and the
	 * 2nd, 3rd, and 4th people in the queue finish before the 1st person has
	 * finished.
	 * 
	 * queueTime([2,3,10], 2) => should return 12
	 * 
	 */

	public static int solveSuperMarketQueue(int[] customers, int n) {
		int time = 0;
		int len = customers.length;
		if (len == 0 || n == 0)
			return 0;
		

		if (len < n) {
			time = customers[0];
			for (int i = 1; i < len; i++) {
				if (customers[i] > time){
					time = customers[i];
			}}
			return time;
		}

		int start = 0, end = n;
		while (end < len) {
			int min = customers[start];
			for (int i = start + 1; i < end; i++) {
				if (customers[i] > 0 && min > customers[i])
					min = customers[i];
			}

			time += min;
			for (int i = start; i < end; i++) {
				if (customers[i] != 0)
					customers[i] -= min;
			}

			while (customers[start] == 0) {
				start++;
			}

			int k = 1;
			int count = 1;

		
			while (count < n) {
				if (start + k >= len) {
					end = start + k;
					break;
				}
				if (customers[start + k] != 0)
					count++;
				k++;
			}

			end = start + k;
		}

		int max = customers[start];
		for (int i = start + 1; i < len; i++) {
			if (customers[i] > max)
				max = customers[i];
		}
		time += max;
		return time;

	}
}
