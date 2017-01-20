package org.campus02.pr1.ue.abend;

public class SmallExamples {

	public static void main(String[] args) {

		String test = "hellox worlxxxd xhowxx arex ux?";
		System.out.println(test + " contains " + countCharX(test) + " x");

		System.out.println(test + " replaced x->y: " + changeCharXToY(test));
		System.out.println(test + " removed x: " + noX(test));

		int[] numsA = { 0, 7, 12, 13, 6, 100, -1 };
		System.out.println("nums array contains 6? " + arrayContains6(numsA, 0));

		int[] numsB = { 0, 7, 12, 13, 100, -1 };
		System.out.println("nums array contains 6? " + arrayContains6(numsB, 0));

		int[] numsC = { 0, -100, 0, -19, 27 };
		System.out.println("count of 11 in nums array: "+count11InArray(numsC, 0));
		
		int[] numsD = { 11, 11, 11, 0, 0, 11};
		System.out.println("count of 11 in nums array: "+count11InArray(numsD, 0));
		
		String test2 = "helloworld";
		System.out.println(prettifyWithStars(test2));
		
	}

	public static int countCharX(String str) {

		if (str == null || str.length() == 0) 
			return 0;	
		
			
		if (str.startsWith("x"))
			return 1 + countCharX(str.substring(1));
	
		return 0 + countCharX(str.substring(1));

	}

	public static String changeCharXToY(String str) {

		if (str == null || str.length() == 0)
			return str;

		if (str.startsWith("x"))
			return "y" + changeCharXToY(str.substring(1));
		
		return str.substring(0,1) + changeCharXToY(str.substring(1));

	}
		
	public static String noX(String str) {

		if (str == null || str.length() == 0)
			return str;

		if(str.startsWith("x"))
			return noX(str.substring(1));
		
		return str.substring(0,1) + noX(str.substring(1));

	}

	public static boolean arrayContains6(int[] nums, int index) {

		if (nums == null || nums.length == 0 || index >= nums.length) {
			return false;
		}

		if(nums[index] == 6)
			return true;
		
		return arrayContains6(nums,index+1);
		
	}
	
	public static int count11InArray(int[] nums, int index) {

		if (nums == null || nums.length == 0 || index >= nums.length) {
			return 0;
		}

		if(nums[index] == 11)
			return 1 + count11InArray(nums,index+1);
		
		return count11InArray(nums,index+1);
		
	}
	
	public static String prettifyWithStars(String str) {

		if (str == null || str.length() <= 1)
			return str;

		return str.substring(0,1) + "*" + prettifyWithStars(str.substring(1));
		
	}

}
