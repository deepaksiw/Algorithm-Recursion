package com.deecoding.recursion.intermediate;

import java.util.Stack;

public class PrintAnySubsequenceSumToK {
	private void print(Stack<Integer> stack) {
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	private boolean printAnySunsequence(int index, Stack<Integer> ds, int sum, int[] ar, int k) {
		if (index >= ar.length) {
			if (sum == k) {
				print(ds);
				return true;
			}
			return false;
		}
		// Take
		ds.add(ar[index]);
		sum += ar[index];
		if (printAnySunsequence(index + 1, ds, sum, ar, k)) {
			return true;
		}
		ds.pop();
		sum -= ar[index];
		// Not- Take
		if (printAnySunsequence(index + 1, ds, sum, ar, k)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 1 };
		int k = 2;
		PrintAnySubsequenceSumToK caller = new PrintAnySubsequenceSumToK();
		caller.printAnySunsequence(0, new Stack<Integer>(), 0, ar, 2);
	}
}
