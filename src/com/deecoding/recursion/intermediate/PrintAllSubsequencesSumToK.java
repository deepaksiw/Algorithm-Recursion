package com.deecoding.recursion.intermediate;

import java.util.Stack;

public class PrintAllSubsequencesSumToK {
	private void print(Stack<Integer> stack) {
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	private void printAllSunsequences(int index, Stack<Integer> ds, int sum, int[] ar, int k) {
		if (index >= ar.length) {
			if (sum == k) {
				print(ds);
			}
			return;
		}
		// Take
		ds.add(ar[index]);
		sum += ar[index];
		printAllSunsequences(index + 1, ds, sum, ar, k);
		ds.pop();
		sum -= ar[index];
		// Not- Take
		printAllSunsequences(index + 1, ds, sum, ar, k);

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 1 };
		int k = 2;
		PrintAllSubsequencesSumToK caller = new PrintAllSubsequencesSumToK();
		caller.printAllSunsequences(0, new Stack<Integer>(), 0, ar, 2);
	}
}
