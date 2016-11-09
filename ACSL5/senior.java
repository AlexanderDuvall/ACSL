package ACSL5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
//ACSL String
import java.util.Scanner;

public class senior {



	public static String expression(String expression, int length, int decimal) {
		String m = "";
		if (length > expression.length()) {
			for (int i = 0; i < length + 1 - (expression.length()); i++) {
				m += "#";
			}
			// ###123.22
			System.out.print(m);
			System.out.printf("%." + Integer.toString(decimal) + "f",
					Double.parseDouble(expression));
			return "";
		}

		if (length == expression.replace(".", "").replace("+", "")
				.replace("-", "").length()) {
			if (expression.contains("+") || expression.contains("-")) {
				m += expression.charAt(0);
				expression = expression.replace("+", "");
				expression = expression.replace("-", "");
			}
			System.out.print(m);
			System.out.printf("%." + Integer.toString(decimal) + "f",
					Double.parseDouble(expression));
			return "";
		}
		if (length < expression.replace(".", "").length()) {
			String s = String.format("%." + Integer.toString(decimal) + "f",
					Double.parseDouble(expression));
			s = s.replaceAll("(?s).", "#");
			for (int i = 0; i < s.length() - length + 1; i++) {
				s = s.replaceFirst(s.substring(0, 1), "");
			}
			String[] ars = new String[s.length()];
			ars = s.split("");
			ars[s.length() - 1 - decimal] = ".";
			for (String string : ars) {
				System.out.print(string);
			}
			return "";
		}

		System.out.printf("%,." + Integer.toString(decimal) + "f",
				Double.parseDouble(expression));
		return "";

	}

	public static void methods() {
		expression("523.125", 6, 2);// norm
		System.out.println();
		expression("+523.125", 6, 1);// +
		System.out.println();
		expression("-523.163", 6, 1);// -
		System.out.println();
		expression("523.125", 4, 2);// ###
		System.out.println();
		expression("523.125", 9, 2);//
		System.out.println();
		expression("-532.12", 6, 1);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner asdf = new Scanner(new File("ACSL5.txt"));
		for (int i = 0; i < 6; i++) {
			String a[] = new String[3];
			a = (asdf.nextLine().split(" "));
			expression(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]));
			System.out.println();
		}
	}
}
