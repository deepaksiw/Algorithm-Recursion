package com.deecoding.recursion.basic;

public class Print1toN {
	public static void main(String[] args) {
		Print1toN print1toN = new Print1toN();
		print1toN.print2(5);
	}

	// First method
	private void print(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(i++);
		print(i, n);
	}

	// ------OR-----
	// Second method
	private void print2(int n) {
		if (n < 1) {
			return;
		}
		print2(n - 1);
		System.out.println(n);
	}
}
