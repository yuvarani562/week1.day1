package wee2day1;

public class CharOccurance {

	public static void main(String[] arg) {

		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences

		int count = 0;

		// convert the string into char array

		char[] arr = str.toCharArray();

		// get the length of the array

		int arrl = arr.length;

		// traverse from 0 till the array length
		for (int i = 0; i < arrl; i++) {
			System.out.println(arr[i]);

			// Check the char array has the particular char in it
			if (arr[i] == 'e') {

				// if is has increment the count
				count++;

			}
		}

		// print the count out of the loop
		System.out.println(count);
	}

}
