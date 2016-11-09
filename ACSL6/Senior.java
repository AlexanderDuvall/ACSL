package ACSL6;

import java.util.ArrayList;

public class Senior {
	public static void run(String x[][]) {
		String a[] = { "A-", "B", "C" };
		String v[] = { "A", "B", "C" };
		ArrayList asdf = new ArrayList();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (!x[i][j].equals("- ")) {
					asdf.add(j);
					asdf.add(x[i]);
					if (i == 0) {
						i++;
						for (int j2 = 0; j2 < 6; j2++) {
							if (!x[i][j2].equals("- ")) {
								asdf.add(j2);
								asdf.add(x[j2]);
							}
						}
					}
				}
				

			}
			if (asdf.size() == 2) {
				for (int j = 0; j < a.length; j++) {
					if (a.equals(asdf.get(1))) {
						a[j] = "";
					}
				}
				System.out.print(asdf.get(1));
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[j]);
				}
			}
			if (asdf.size() == 4) {
				System.out.print(asdf.get(1));
				System.err.print(asdf.get(3));
				for (int j = 0; j < a.length; j++) {
					if (a.equals(asdf.get(1)) || a.equals(asdf.get(3))) {
						a[j] = "";
					}
				}
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[j]);
				}
			}
			if (asdf.size() == 6) {
				System.out.print(asdf.get(1));
				System.err.print(asdf.get(3));
				System.out.print(asdf.get(5));
			}
			asdf= new ArrayList();
			a = v;
			System.out.println();
		}
	}
}
