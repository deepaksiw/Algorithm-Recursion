package com.deecoding.recursion.intermediate;

import java.util.Stack;

public class CountSubsequencesSumToK {

	private void print(Stack<Integer> stack) {
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	private int CountSubsequencesSum(int index, Stack<Integer> ds, int sum, int[] ar, int k) {
		if (index >= ar.length) {
			if (sum == k) {
				print(ds);
				return 1;
			}
			return 0;
		}
		// Take
		ds.add(ar[index]);
		sum += ar[index];
		int left = CountSubsequencesSum(index + 1, ds, sum, ar, k);
		ds.pop();
		sum -= ar[index];
		// Not- Take
		int right = CountSubsequencesSum(index + 1, ds, sum, ar, k);

		return left + right;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 1 };
		int k = 2;
		CountSubsequencesSumToK caller = new CountSubsequencesSumToK();
		System.out.println("Count = " + caller.CountSubsequencesSum(0, new Stack<Integer>(), 0, ar, 2));
	}

}
