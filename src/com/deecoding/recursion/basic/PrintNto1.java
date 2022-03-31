package com.deecoding.recursion.basic;

public class PrintNto1 {
	public static void main(String[] args) {
		PrintNto1 print1toN = new PrintNto1();
		print1toN.print(5);
	}

	private void print(int n) {
		if (n < 1) {
			return;
		}
		System.out.println(n--);
		print(n);
	}
}
