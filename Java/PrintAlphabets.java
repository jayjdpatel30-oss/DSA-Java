public class PrintAlphabets {
	
	// ========================================================================
	// PROBLEM: Print Alphabets A to Z
	// ========================================================================
	/*
	 * Problem Statement: Print all alphabets from A to Z.
	 * Output: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	 */

	public static void main(String[] args) {

		for (char alph = 'A'; alph <= 'Z'; alph++) {
			System.out.print(alph + " ");
		}
		
		System.out.println();
		
		// small alphabets
		char letter = 'a';
		
		while(letter != 'z') {
			System.out.print(letter + " ");
			letter++;
		}
	}
}
