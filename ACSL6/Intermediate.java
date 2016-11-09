package ACSL6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//title : ABC
public class Intermediate {
	@SuppressWarnings("finally")
	public static void set() throws FileNotFoundException {
		String mat[][] = new String[6][6];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = "- ";
			}
		}

		Scanner asdf = new Scanner(new File("ACSL6.txt"));
		while (asdf.hasNextLine()) {
			String holder = asdf.nextLine();
			String scanmat[] = new String[holder.split(",").length];
			String holdermat[] = new String[38];
			scanmat = holder.split(",");
			for (int i = 0; i < 4; i++) {
				holdermat[Integer.parseInt(scanmat[i])] = /*scanmat[i]*/ "X ";
			}
			String letter = "";
			int a = 0;
			try {

				for (int i = 0; i < Integer.parseInt(scanmat[3]) * 2; i += 2) {
					letter = scanmat[i + 5];
					a = Integer.parseInt(scanmat[i + 6]);
					holdermat[a] = letter+" ";
				}
			} catch (Exception e) {
				int c = 0;
				for (int i = 0; i < holdermat.length; i++) {
					if (holdermat[i]==null)
						holdermat[i] ="- ";
				}
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat[i].length; j++) {
						mat[i][j] = holdermat[c+1];
						c++;
					}
				}
			} finally {
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat[i].length; j++) {
						System.out.print(mat[i][j]);
					}
					System.out.println();
				}
				//return mat;
				Senior.run(mat);
			}

		}
	//	return mat;
	}

	public static String [][] transfer(String  c [][] ){
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				
			}
		}
		return c;
	}
	public static void main(String[] args) throws FileNotFoundException {
		set();
	}
}
