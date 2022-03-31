package com.deecoding.recursion.basic;

public class ReverseArray<T> {
	private void printArray(T[] array) {
		for (T i : array) {
			System.out.print(i.toString() + " ");
		}
		System.out.println();
	}

	private void swap(T[] array, int x, int y) {
		T temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

	private void reverse(T[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		swap(array, start, end);
		reverse(array, start + 1, end - 1);
	}

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5 };
		ReverseArray<Integer> caller = new ReverseArray<>();
		System.out.println("Original Array:");
		caller.printArray(array);
		System.out.println("Reversed Array:");
		caller.reverse(array, 0, array.length - 1);
		caller.printArray(array);
	}

}
