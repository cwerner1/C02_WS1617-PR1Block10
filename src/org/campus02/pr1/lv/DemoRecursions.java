package org.campus02.pr1.lv;

public class DemoRecursions {

	public static void main(String[] args) {
		
		int result = RecursiveMaths.sum(10);
		System.out.println(result);
		
		result = RecursiveMaths.fibonacci(8);
		System.out.println(result);
		
		long factN = RecursiveMaths.factorial(7);
		System.out.println(factN);
		
		String test = "Go hang a salami, I’m a lasagna hog";
		System.out.println(PalindromeChecker.isPalindrome(test));
		
	}

}
