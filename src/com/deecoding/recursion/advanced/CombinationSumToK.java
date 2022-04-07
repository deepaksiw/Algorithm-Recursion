package com.deecoding.recursion.advanced;

import java.util.Stack;

/**
 * To find the all the combination in a given array of distinct integer. Note :
 * A particular number can be taken many times E.g. {2,3,6,7} target = 7
 * Combinations would be: => 2+2+3 = 7 => 7 = 7
 * 
 * @author Deepak Pandey
 *
 */
public class CombinationSumToK {
	private void print(Stack<Integer> stack) {
		for (int item : stack) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	private void printCombinations(int index, Stack<Integer> ds, int target, int[] ar) {
		if (index >= ar.length) {
			if (target == 0) {
				print(ds);
				return;
			}
			return;
		}
		// If element at given index is taken
		ds.add(ar[index]);
		if (target >= ar[index]) {
			printCombinations(index, ds, target - ar[index], ar);
		}
		ds.pop();

		// If element at given index is NOT taken
		printCombinations(index + 1, ds, target, ar);
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 6, 7 };
		int target = 7;
		CombinationSumToK caller = new CombinationSumToK();
		caller.printCombinations(0, new Stack<Integer>(), target, array);
	}
}
