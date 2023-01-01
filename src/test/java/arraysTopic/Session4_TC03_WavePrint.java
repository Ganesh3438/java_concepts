package arraysTopic;

import java.util.Scanner;

public class Session4_TC03_WavePrint {

	static void wave_print(int[][] mat) {
     
		int rows = mat.length;
		int cols = mat[0].length;

		for (int j = 0; j < cols; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < rows; i++) {
					System.out.print(mat[i][j] + " ");
				}
			} else {
				for (int i = rows - 1; i >= 0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}
             System.out.println("");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int mat[][] = new int[n][m];

		// Scan the values
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		wave_print(mat);

	}

}
