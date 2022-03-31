package com.deecoding.recursion.basic;

public class Sum1toN {
	public static void main(String[] args) {
		Sum1toN sum1toN = new Sum1toN();
		// System.out.println(sum1toN.sum(5, 0));
		// -----OR-----
		System.out.println(sum1toN.sum2(5));
	}

	private int sum(int n, int sum) {
		if (n < 1) {
			return sum;
		}
		return sum(n - 1, sum + n);
	}

	// -----OR-----
	private int sum2(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum2(n - 1);
	}
}
