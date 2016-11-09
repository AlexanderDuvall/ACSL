package ACSL4;
///CHMOD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ACSL3 {

	public static String problem3(int specialcase, int a, int b, int c) {
		String m = ACSL2.problem2(Integer.toString(a), Integer.toString(b),
				Integer.toString(c), 1);
		String mm[] = m.split(" ");
		m = "";
		if (specialcase == 1) {
			mm[mm.length - 3] = mm[mm.length - 3].replace("x", "s");
		}
		if (specialcase == 2) {
			mm[mm.length - 2] = mm[mm.length - 2].replace("x", "s");
		}
		if (specialcase == 4) {
			mm[mm.length - 1] = mm[mm.length - 1].replace("x", "t");
		}
		for (int i = 0; i < mm.length; i++) {
			m += mm[i] + " ";
		}
		//System.out.println(m);
		return m;

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner asdf = new Scanner(new File("ACSL4.txt"));

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			String a = asdf.nextLine();
			String s[] = a.split(", ");
			System.out.println(problem3(Integer.parseInt(s[0]),
					Integer.parseInt(s[1]), 
					Integer.parseInt(s[2]),
					Integer.parseInt(s[3])));
		}

		/**
		 * problem3(0, 5, 2, 6); problem3(1, 7, 3, 0); problem3(2, 4, 1, 5);
		 * problem3(4, 2, 3, 4); problem3(4, 5, 6, 7);
		 **/
	}
}
