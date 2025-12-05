package Foundation_problems;

public class DefangingAnIPAddress {

	/**
	 * Problem Statement: Given a valid (IPv4) IP address, return a defanged version
	 * of that IP address. A defanged IP address replaces every period "." with
	 * "[.]".
	 * 
	 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
	 * 
	 * Input: address = "255.100.50.0" Output: "255[.]100[.]50[.]0"
	 * 
	 * Input: address = "192.168.1.1" Output: "192[.]168[.]1[.]1"
	 * 
	 * Approach: Use the built-in replace() method to replace all occurrences of "."
	 * with "[.]". Alternatively, iterate and build result manually.
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n) - Result string
	 */

	public static void main(String[] args) {

		String address = "1.1.1.1";
		System.out.println("defanged version of IP address : " + defangedVersion(address));
		System.out.println("defanged version of IP address : " + defangIPaddr(address));

	}

	private static String defangedVersion(String address) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < address.length(); i++) {

			if (address.charAt(i) == '.') {
				sb.append("[.]");
			} else {
				sb.append(address.charAt(i));
			}

		}

		return sb.toString();
	}

	public static String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

}
