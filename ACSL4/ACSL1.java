package ACSL4;

import java.util.ArrayList;
import java.util.Scanner;

public class ACSL1 {
	public static Scanner asdf = new Scanner(System.in);
	public static String[] letterKey = { "---", "--x", "-w-", "-wx", "r--",
			"r-x", "rw-", "rwx" };
	public static String[] binaryKey = { "000", "001", "010", "011", "100",
			"101", "110", "111" };

	public static String problem1stringtobinary(String mm) {
		// string to binary
		int c = 0;
		if (mm.length() > 1) {
			for (int i = 0; i < letterKey.length; i++) {
				if (letterKey[i].equals(mm)) {
					c = i;
					break;
				}
			}
		}
		return (binaryKey[c]);
	}

	public static String problem1(String mm, int counter) {
		// xxxx -> binary
		if (counter == 1 || counter == 5) {
			int c = 0;
			if (mm.length() > 1) {
				for (int i = 0; i < binaryKey.length; i++) {
					if (letterKey[i].equals(mm)) {
						c = i;
						break;
					}
				}

				return binaryKey[c];
			} else {

				return binaryKey[Integer.parseInt(mm)];
			}
		}

		// binary to octal
		if (counter == 4) {
			int c = 0;
			for (int i = 0; i < binaryKey.length; i++) {
				if (binaryKey[i].equals(mm)) {
					c = i;
					return Integer.toString(i);
				}
			}
		}
		return "fff";
	}

	public static String problem1stringtoPermission(String mm) {

		// xxxx -> permission
		int c = 0;
		if (mm.length() > 1) {
			for (int i = 0; i < binaryKey.length; i++) {
				if (binaryKey[i].equals(mm)) {
					c = i;
					break;
				}
			}
			return letterKey[c];
		} else {
			return letterKey[Integer.parseInt(mm)];

		}
		// binary to octal
	}
}
