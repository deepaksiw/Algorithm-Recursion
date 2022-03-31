package com.deecoding.recursion.basic;

public class CheckPalindrome {
	public static void main(String[] args) {
		CheckPalindrome caller = new CheckPalindrome();
		System.out.println("Is \"SOS\" is a palindrome :" + caller.isPalindrome("kanak", 0, "kanak".length() - 1));
		System.out
				.println("Is \"Lenonvo\" is a palindrome :" + caller.isPalindrome("Deepak", 0, "Deepak".length() - 1));
	}

	private boolean isPalindrome(String st, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (st.charAt(start) != st.charAt(end)) {
			return false;
		}
		return isPalindrome(st, start + 1, end - 1);
	}
}
