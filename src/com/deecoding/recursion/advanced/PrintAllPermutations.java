package com.deecoding.recursion.advanced;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3 };
		PrintAllPermutations caller = new PrintAllPermutations();
		System.out.println("Approach 1>>");
		caller.permute1(ar, new ArrayList<>(), new boolean[ar.length]);
		System.out.println("Approach 2>>");
		caller.permute2(0, ar);
	}

	// Approach-1(Using extra space)
	private void permute1(int[] ar, List<Integer> ds, boolean[] freq) {
		if (ds.size() == ar.length) {
			System.out.println(ds);
			return;
		}
		for (int i = 0; i < ar.length; i++) {
			if (!freq[i]) {
				ds.add(ar[i]);
				freq[i] = true;
				permute1(ar, ds, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}
		}
	}
	private void permute2(int index, int[] ar) {
		if(index == ar.length - 1) {
			print(ar);
			return;
		}
		for(int i = index; i < ar.length; i++) {
			swap(ar, index, i);
			permute2(index+1, ar);
			swap(ar, index, i);
		}
	}
	private void swap(int[] ar, int left, int right) {
		int temp = ar[left];
		ar[left] = ar[right];
		ar[right] = temp;
	}
	private void print(int[] ar) {
		System.out.print("[");
		for(int i = 0; i < ar.length; i++) {
			if(i == ar.length -1) {
				System.out.print(ar[i] +"]");
			}else {
				System.out.print(ar[i]+", ");
			}
			
		}
		System.out.println();
	}

	/*
	 * private void print(List<Integer> ar) { for(int item : ar) {
	 * System.out.print(item); } System.out.println(); }
	 */

}
