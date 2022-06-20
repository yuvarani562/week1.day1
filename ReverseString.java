package week2day2;

public class ReverseString {
	public static void main(String[] arg) {
		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/*
		 * Pseudo Code: 1 a) Convert the String to character array b) Traverse through
		 * each character (using loop in reverse direction) c) Print the character
		 * (without newline -> like below System.out.print(ch);
		 */
		char[] arr = test.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		/*
		 * Pseudo Code: 2 a) Find the length of the string b) Traverse through each
		 * index from length-1 -> 0 (using loop in reverse direction) c) Find the
		 * character of the String using its index
		 */
		for (int i = test.length() - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
