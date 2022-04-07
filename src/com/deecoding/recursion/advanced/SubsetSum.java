package com.deecoding.recursion.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Program is to print all subset sum of an array in increasing order
 * E.g.
 * Array => {3,1,2}
 * Subsets => {}, {3},{1},{2},{3,1},{3,2},{1,2},{3,1,2}
 * Sums => 0,3,1,2,4,5,3,6 Sorted order = 0,1,2,3,3,4,5,6
 * 
 * @author Deepak Pandey
 *
 */
public class SubsetSum {
	public static void main(String[] args) {
		int[] ar = {3,1,2};
		List<Integer> res = new ArrayList<>();
		SubsetSum caller = new SubsetSum();
		caller.helper(0, ar, 0, res);
		Collections.sort(res);
		System.out.println(res);
	}
	
	private void helper(int index, int[] ar, int sum, List<Integer> res) {
		if(index >= ar.length) {
			res.add(sum);
			return;
		}
		//Take the element at given index
		helper(index+1, ar, sum+ar[index], res);
		//Not take element at given index
		helper(index+1, ar, sum, res);
	}
	
}

