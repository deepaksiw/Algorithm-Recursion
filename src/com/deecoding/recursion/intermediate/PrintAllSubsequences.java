package com.deecoding.recursion.intermediate;

import java.util.Stack;

public class PrintAllSubsequences {
	private void printArray(Stack<Integer> stack) {
		System.out.print("{");
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.print("}");
		System.out.println();
	}

	private void printSubsequences(int index, int[] ar, Stack<Integer> ds) {
		if (index >= ar.length) {
			printArray(ds);
			return;
		}
		// Not taken
		printSubsequences(index + 1, ar, ds);
		// Taken
		ds.push(ar[index]);
		printSubsequences(index + 1, ar, ds);
		ds.pop();
	}

	public static void main(String[] args) {
		int[] array = { 3, 1, 2 };
		PrintAllSubsequences caller = new PrintAllSubsequences();
		caller.printSubsequences(0, array, new Stack<Integer>());

	}
}
