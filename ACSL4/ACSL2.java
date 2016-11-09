package ACSL4;

import java.util.ArrayList;

public class ACSL2 {

	public static String problem2(String a, String b, String c, int counter) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		String m = "";
		if (counter == 1 || counter == 2) {
			al1.add(ACSL1.problem1(a, 1));
			al1.add(ACSL1.problem1(b, 1));
			al1.add(ACSL1.problem1(c, 1));
			al2.add(ACSL1.problem1stringtoPermission(a));
			al2.add(ACSL1.problem1stringtoPermission(b));
			al2.add(ACSL1.problem1stringtoPermission(c));
			for (int i = 0; i < al1.size(); i++) {
				// System.out.print(al1.get(i) + " ");
				m += al1.get(i) + " ";
			}
			m += " and ";
			//System.out.print(" and ");
			for (int i = 0; i < al2.size(); i++) {
				// System.out.print(al2.get(i) + " ");
				m += al2.get(i) + " ";
			}
		}
		if (counter == 3 || counter == 4) {
			al1.add(ACSL1.problem1(a, 4));
			al1.add(ACSL1.problem1(b, 4));
			al1.add(ACSL1.problem1(c, 4));
			al2.add(ACSL1.problem1stringtoPermission(a));
			al2.add(ACSL1.problem1stringtoPermission(b));
			al2.add(ACSL1.problem1stringtoPermission(c));
			for (int i = 0; i < al1.size(); i++) {
				// System.out.print(al1.get(i));
				m += al1.get(i);
			}
			///System.out.print(" and ");
			m += " and ";
			for (int i = 0; i < al2.size(); i++) {
				// System.out.print(al2.get(i) + " ");
				m += al2.get(i) + " ";
			}
		}
		return m;
	}

	public static int permission_number_finder(String mm) {
		int c = 0;
		for (int i = 0; i < ACSL1.letterKey.length; i++) {
			if (ACSL1.letterKey[i].equals(mm)) {
				c = i;
				return c;
			}
		}
		return 0;
	}

	public static String problem2last(String a, String b, String c, int mmm) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		al1.add(permission_number_finder(a));
		al1.add(permission_number_finder(b));
		al1.add(permission_number_finder(c));
		al2.add(ACSL1.problem1stringtobinary(a));
		al2.add(ACSL1.problem1stringtobinary(b));
		al2.add(ACSL1.problem1stringtobinary(c));
		String m = "";
		for (int i = 0; i < al1.size(); i++) {
			// System.out.print(al1.get(i));
			m += al1.get(i);
		}
		m += " and ";
		//System.out.print(" and ");
		for (int i = 0; i < al2.size(); i++) {
			// System.out.print(al2.get(i) + " ");
			m += al2.get(i) + " ";
		}
		return m;
	}

	public static void main(String[] args) {
		problem2("5", "2", "6", 1);
		System.out.println();
		problem2("7", "3", "0", 2);
		System.out.println();
		problem2("100", "001", "101", 3);
		System.out.println();
		problem2("010", "011", "100", 3);
		System.out.println();
		problem2last("r-x", "rw-", "rwx", 5);

	}
}
