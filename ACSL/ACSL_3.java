package ACSL;

import java.util.Scanner;

/*
 * 0 d1 city 1 d2 city 2 t1 time 3 p1 pm am 4 t2 time 5 p2 pm am 6 m1 mile 1 7m2
 * mile 2
 */
/**
 * 
 * @author Alexander
 *
 */
public class ACSL_3 {
	protected static ACSL_1 mm = new ACSL_1();
	protected static Scanner asdf = new Scanner(System.in);
	protected static String[] aa = asdf.nextLine().split(" ");
	protected static int q2 = 0;
	protected static int q1 = 0;

	public static void ACSL3() {
		int m = ACSL_1.ACSL1();
		double n = 0;
		double s = 0;
		double a = 5.9;
		int d = 0;
		int o = 0;
		for (double i = 0; i <= m; i += a) {
			if ((int) n + (int) s == m) {
				System.out.println(n + " " + s + " ssssssssssssssssssssss");
				System.out.println(d);
				o++;
				break;
			} else {
				n = n + (Double.parseDouble(aa[6]) / 8);
				s = s + (Double.parseDouble(aa[7]) / 8);
				System.out.println(n + " " + s);
			}
			d++;
			o++;
		}
		System.out.println(o);

		System.err.println("done");
	}

	public static void main(String[] args) {
		ACSL3();
	}
}
