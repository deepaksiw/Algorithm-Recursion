package com.deecoding.recursion.basic;

public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.fact(5));
	}

	private int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
