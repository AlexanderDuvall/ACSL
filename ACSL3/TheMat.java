package ACSL3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TheMat {
	protected static Integer[][] mat = new Integer[7][7];

	public static void build() {
		int c = 1;
		int m = 6;
		Integer[][] mat1 = new Integer[7][7];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = c;
				c++;
			}
		}
		for (int i = 0; i < mat1.length; i++) {
			mat1[i] = mat[m];
			m--;
		}
		mat = mat1;
	}

	public static void displaymat() {
		for (int i = 0; i < mat.length; i++) {
			System.out.println("");
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
		}
		System.out.println();
	}

	public static void displayBetweenColumn(int column, int r1, int r2) {
		String m = "";
		column -= 1;
		r1 -= 1;
		r2 -= 1;
		for (int i = Math.min(r1, r2); i <= Math.max(r1, r2); i++) {
			if (mat[i][column] != null) {
				m += Integer.toString(mat[i][column]);
				m += " ";
			} else {
				m += " ";
			}
		}
		System.err.println(m);
	}

	public static void displayBetweenRow(int row, int c1, int c2) {
		String m = "";
		row -= 1;
		c1 -= 1;
		c2 -= 1;
		for (int i = Math.min(c1, c2); i <= Math.max(c1, c2); i++) {
			if (mat[row][i] != null) {
				m += Integer.toString(mat[row][i]);
				m += " ";
			} else {
				m += " ";
			}
		}
		System.err.println(m);
	}

	public static void displayAngel(int c1, int r1, int c2, int r2) {
		int n = 1;
		int c11 = c1;
		int c22 = c2;
		int r11 = r1;
		int r22 = r2;
		String asdf = "";
		if (mat[r1][c1] == mat[r2][c2]) {
			System.out.println("Same");
		} else if (r1 > r2 && c1 > c2) {

			for (int i = 0; i < n; i++) {
				c1--;
				r1--;
				if (r1 >= 7 || c1 >= 7) {
					System.out.println("");
					System.err.println(false);
					break;
				} else if (mat[r1][c1] != mat[r2][c2]) {
					n++;
				} else if (mat[r1][c1] == mat[r2][c2]) {
					while (r11 > r2 && c11 > c2) {
						r11--;
						--c11;
						asdf += mat[r11][c11];
					}
				}
			}
		} else if (r1 < r2 && c1 > c2) {
			for (int i = 0; i < n; i++) {
				c1--;
				r1++;
				if (r1 >= 7 || c1 >= 7) {
					System.out.println("");
					System.err.println(false);
					break;
				} else if (mat[r1][c1] != mat[r2][c2]) {
					n++;
				} else if (mat[r1][c1] == mat[r2][c2]) {
					while (r11 < r2 && c11 > c2) {
						r11++;
						--c11;
						asdf += mat[r11][c11];
					}
				}
			}
		} else if (r1 > r2 && c1 < c2) {
			for (int i = 0; i < n; i++) {
				c1++;
				r1--;
				if (r1 >= 7 || c1 >= 7) {
					System.out.println("");
					System.err.println(false);
					break;
				} else if (mat[r1][c1] != mat[r2][c2]) {
					n++;
				} else if (mat[r1][c1] == mat[r2][c2]) {
					while (r11 > r2 && c11 < c2) {
						r11--;
						++c11;
						asdf += mat[r11][c11];
					}
				}
			}
		} else if (r1 < r2 && c1 < c2) {
			for (int i = 0; i < n; i++) {
				c1++;
				r1++;
				if (r1 >= 7 || c1 >= 7) {
					System.out.println("");
					System.err.println(false);
					break;
				} else if (mat[r1][c1] != mat[r2][c2]) {
					n++;
				} else if (mat[r1][c1] == mat[r2][c2]) {
					while (r11 < r2 && c11 < c2) {
						r11++;
						++c11;
						asdf += mat[r11][c11];
					}
				}
			}
		}
		System.out.println(asdf);
	}

	public static void junior1() throws FileNotFoundException {
		int m = 0;
		int n = 0;
		int a = 0;
		int s = 0;
		String sd = "";
		Scanner asdf = new Scanner(new File("one.dat"));
		ArrayList<Integer> asd = new ArrayList<Integer>();
		asd.add(asdf.nextInt());
		while (asd.get(asd.size() - 1) != 0) {
			asd.add(asdf.nextInt());
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int j2 = 0; j2 < asd.size(); j2++) {
					if (mat[i][j] == asd.get(j2)) {
						mat[i][j] = 0;
					}
				}
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == asd.get(0)) {
					m = i;
					n = j;
				} else if (mat[i][j] == asd.get(1)) {
					a = i;
					s = j;
				}
			}
		}

		if (n < s) {
			for (int i = n; i < s; i++) {
				sd += Integer.toString(mat[i][n]);
			}
		} else {
			for (int i = s; i < n; i++) {
				sd += Integer.toString(mat[i][n]);
			}
		}
		System.out.println(sd);
	}

	public static void junior3() throws FileNotFoundException {
		int m = 0;
		int n = 0;
		int a = 0;
		int s = 0;
		String sd = "";
		Scanner asdf = new Scanner(System.in);
		// Scanner asdf = new Scanner(new File("one.dat"));
		ArrayList<Integer> asd = new ArrayList<Integer>();
		asd.add(asdf.nextInt());
		while (asd.get(asd.size() - 1) != 0) {
			asd.add(asdf.nextInt());
		}
		// find zeroes
		for (int i = 2; i < asd.size(); i++) {
			for (int j = 0; j < mat.length; j++) {
				for (int j2 = 0; j2 < mat[j].length; j2++) {
					if (mat[j][j2] == asd.get(i)) {
						mat[j][j2] = 0;
					}
				}
			}
		}
		//get cordinates
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == asd.get(0)) {
					m = i;
					n = j;
					//System.err.println(m+" "+n);
				} else if (mat[i][j] == asd.get(1)) {
					a = i;
					s = j;
					//System.err.println(a+" "+s);
				}
			}
		}
		if (s == n) {
			if (m < a) {
				for (int i = m+1; i < a; i++) {
					sd += Integer.toString(mat[i][n])+" ";
				}
			} else {

				for (int i = a+1; i < m; i++) {
					sd += Integer.toString(mat[i][n])+" ";
				}
			}
		} else if (m==a){
			if (n < s) {
				for (int i = n+1; i < s; i++) {
					sd += Integer.toString(mat[m][i])+" ";
				}
			} else {
				for (int i = s+1; i < n; i++) {
					sd += Integer.toString(mat[m][i])+" ";
				}
			}
		} else {
			int c = 1;
			int c11 = n;
			int c22 = s;
			int r11 = m;
			int r22 = a;
			System.err.println(m+" "+n);
			System.err.println(a+" "+s);
			if (mat[m][n] == mat[a][s]) {
				System.out.println("Same");
			} else if (m > a && n > s) {
				for (int i = 0; i < c; i++) {
					n--;
					m--;
					if (m >= 7 || n >= 7) {
						System.out.println("");
						System.err.println(false);
						break;
					} else if (mat[m][n] != mat[a][s]) {
						c++;
					} else if (mat[m][n] == mat[a][s]) {
						while (r11 > a && c11 > s) {
							r11--;
							--c11;
							sd += Integer.toString(mat[r11][c11])+" ";
						}
					}
				}
			} else if (m < a && n > s) {
				for (int i = 0; i < c; i++) {
					n--;
					m++;
					if (m >= 7 || n >= 7) {
						System.out.println("");
						System.err.println(false);
						break;
					} else if (mat[m][n] != mat[a][s]) {
						c++;
						System.err.println("no");
					} else if (mat[m][n] == mat[a][s]) {
						System.err.println("y");
						while (r11 < a && c11 > s) {
							r11++;
							--c11;
							sd += Integer.toString(mat[r11][c11])+" ";
						}
					}
				}
			} else if (m >a && n < s) {
				for (int i = 0; i < c; i++) {
					n++;
					m--;
					if (m >= 7 || n >= 7) {
						System.out.println("");
						System.err.println(false);
						break;
					} else if (mat[m][n] != mat[a][s]) {
						c++;
					} else if (mat[m][n] == mat[a][s]) {
						while (r11 > a && c11 < s) {
							r11--;
							++c11;
							sd += Integer.toString(mat[r11][c11])+" ";
						}
					}
				}
			} else if (m < a && n < s) {
				for (int i = 0; i < c; i++) {
					n++;
					m++;
					if (m >= 7 || n >= 7) {
						System.out.println("");
						System.err.println(false);
						break;
					} else if (mat[m][n] != mat[a][s]) {
						c++;
					} else if (mat[m][n] == mat[a][s]) {
						while (r11 < a && c11 < s) {
							r11++;
							++c11;
							sd += Integer.toString(mat[r11][c11])+" ";
						}
					}
				}
			}
		}
		System.out.println(sd);
	}

	

	public static void main(String[] args) throws FileNotFoundException {
		build();
		displaymat();
		displayBetweenColumn(1, 1, 2);
		displayBetweenRow(1, 1, 2);
		displayAngel(1, 2, 2, 3);
		junior3();
	}

}
