package ACSL2;

import java.util.Scanner;

// (ADD (EXP -3 2) (SQR 5) (SUB 6 2) (MULT 6 7 -2 3) (DIV 15 5))
//
public class acslStrings {
	public static Scanner asdf = new Scanner(System.in);
	public static String ff = asdf.nextLine();
	public static String[] mm = ff.split(" ");

	// check
	public static void count() {
		int cup = 0;
		String[] sdf = { "ADD", "SUB", "MULT", "DIV", "SQR", "EXP" };
		for (int i = 0; i < mm.length; i++) {
			for (int j = 0; j < sdf.length; j++) {
				if (mm[i].contains(sdf[j])) {
					cup++;
				}
			}
		}
		cup--;
		System.out.println(cup);
	}

	/**
	 * pemdas parenthesis exponents multiplication division addition subtraction
	 */
	public static void sort(int sdf, int df) {
		String[] dd = ff.split("\\(");
		String[] xx = { "EXP", "SQR", "MULT", "DIV", "ADD", "SUB" };

		for (int i = sdf; i < df+1; i++) {
			int cup = 0;
			if (i==2){
				break;
			} else {
				int c2 = 0;
				for (int j = 0; j < xx.length; j++) {
					if(dd[i].equals(xx[j])  ){
						
					}
				}
			}
		}
		System.err.println("ERROR");
	}

	// check
	public static void remove(int ms, int nn) {
		String[] dd = ff.split("\\(");
		for (int i = ms + 1; i <= nn + 1; i++) {
			dd[i] = "";
		}
		for (int i = 0; i < dd.length; i++) {
			if (i==0)
				System.out.print("" +dd[i]);
			else
			System.out.print("("+dd[i]);
		}
	}

	// check
	public static void Maximum() {
		String[] dd = ff.split("\\(");
		int m = 0;
		int n = 0;
		for (int i = 0; i < dd.length; i++) {
			if (m < dd[i].length()) {
				m = dd[i].length();
				n = i;
			}
		}
		System.out.print("("+dd[n]);
	}

	public static void reverse(int nn, int ss) {
		String[] dd = ff.split("\\(");
		int cup = 0;
		for (int i = nn + 1; i <= ss + 1; i++) {
			if (cup != (ss + 1 - nn) / 2) {
				String m = "";
				m = dd[i]; // sets 'm' as last

				dd[i] = dd[ss + 1 - cup];// sets first as last

				dd[ss + 1 - cup] = m;// sets last as last
				++cup;
			}

			else if (cup == 2) {
				break;
			}
			
		}
		for (int x = 0; x < dd.length; x++) {
			if (x==0){
				System.out.print(""+dd[x]);
			} else 
			System.out.print("("+dd[x]);
		}
	}

	public static void main(String[] args) {
		System.err.println("Reverse");//REVERSE
		int m= asdf.nextInt();
		int n = asdf.nextInt();
		reverse(Math.min(m, n),Math.max(m, n));

		System.out.println();
		System.err.println("Remove");
		int a = asdf.nextInt();
		int s = asdf.nextInt();
		remove(Math.min(a, s),Math.max(a, s));//REMOVE
		
		System.out.println("COUNT");
		count();//COUNT
	}
}
