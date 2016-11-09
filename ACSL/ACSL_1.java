package ACSL;

import java.util.Scanner;

public class ACSL_1 {
	protected static String[] mm = { "a", "b", "c", "d", "e", "f", "g", "h",
			"j", "k" };
	protected static int[] ss = { 450, 140, 125, 365, 250, 160, 380, 235, 320 };
	protected static Scanner asdf = new Scanner(System.in);

	protected static int ACSL1() {
		System.out.println("Input your 2 destinations!");
		String sdf = asdf.nextLine().toLowerCase();
		String df = asdf.nextLine().toLowerCase();
		int a = 0;
		int s = 0;
		int as = 0;
		for (int i = 0; i < mm.length; i++) {
			if (sdf.equals(mm[i])) {
				a = i;
			}
			if (df.equals(mm[i])) {
				s = i;
			}
		}
		System.out.println(a + " " + s);
		for (int j = Math.min(a, s); j < Math.max(a, s); j++) {
			as += ss[j];
		}
		System.out.println(as);
		return as;
	}

	public static void main(String[] args) {
		ACSL1();
	}
}
