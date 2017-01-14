package org.campus02.pr1.lv;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String text) {
		
		//safety check first :)
		if(text == null) {
			return false;
		}
		
		//the empty string and any string of length 1
		//is a palindrome per definition
		if(text.length() <= 1 ) {
			return true;
		}
		
		char first = Character.toLowerCase(text.charAt(0));
		char last = Character.toLowerCase(text.charAt(text.length()-1));
		
		//check if both chars are letters
		if(Character.isLetter(first) && Character.isLetter(last)) {
			//check if equal
			if(first == last) {
				//remove both of original text and check
				//remaining text for palindrome rules
				return isPalindrome(text.substring(1,text.length()-1));
			}
			return false;
		} 
		
		//either of the two or both are not letters
		if(!Character.isLetter(first)) {
			//remove first and check rest
			return isPalindrome(text.substring(1,text.length()));
		}
		
		if(!Character.isLetter(last)) {
			//remove last and check rest
			return isPalindrome(text.substring(0,text.length()-1));
		}	
				
		return false;
	}
	
}
