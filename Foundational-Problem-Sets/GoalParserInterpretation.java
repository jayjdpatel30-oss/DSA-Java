package Foundation_problems;

import java.util.Iterator;

public class GoalParserInterpretation {

	/**
	 * Problem Statement: You own a Goal Parser that can interpret a string command.
	 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
	 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
	 * and "(al)" as the string "al". The interpreted strings are then concatenated
	 * in the original order. Given the string command, return the Goal Parser's
	 * interpretation of command.
	 * 
	 * Input: command = "G()(al)" Output: "Goal"
	 * 
	 * Input: command = "G()()()()(al)" Output: "Gooooal"
	 * 
	 * Input: command = "(al)G(al)()()G" Output: "alGalooG"
	 */

	public static void main(String[] args) {

		String command = "(al)G(al)()()G";

		System.out.println("The interpreted strings : " + goalParser(command));
		System.out.println("The interpreted strings : " + interpret(command));
	}

	private static String goalParser(String command) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				sb.append(command.charAt(i));
			} else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
				sb.append("al");
			} else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				sb.append("o");
			}
		}

		return sb.toString();
	}

	public static String interpret(String command) {
		return command.replace("()", "o").replace("(al)", "al");
	}

}
