package ACSL;

import java.util.Scanner;

/**
 * 0 d1 city 1 d2 city 2 t1 time 3 p1 pm am 4 t2 time 5 p2 pm am 6 m1 mile 1 7
 * m2 mile 2
 */
public class ACSL_2 {
	protected static ACSL_1 mm = new ACSL_1();
	protected static Scanner asdf = new Scanner(System.in);
	protected static String[] aa;
	protected static int q2 = 0;
	protected static int q1 = 0;

	public static void second() {
		int s = 0;
		aa = asdf.nextLine().split(" ");
		if (aa[3].contains("pm")) {
			q1 = q1 + 12 + Integer.parseInt(aa[2]);
		} else {
			q1 += Integer.parseInt(aa[2]);
		}
		if (aa[5].contains("pm")) {
			q2 = q2 + 12 + Integer.parseInt(aa[4]);
		} else {
			q2 += Integer.parseInt(aa[4]);
		}
		System.out.println(q1 + " " + q2);
		for (int i = Math.min(q1, q2); i < Math.max(q1, q2); i++) {
			s += Integer.parseInt(aa[6]);
		}
		int a = ACSL_1.ACSL1() - s;
		System.out.println(s + ", " + a + ", "
				+ (Math.max(q1, q2) - Math.min(q1, q2)));
	}

	public static void main(String[] args) {

		second();
	}
}
