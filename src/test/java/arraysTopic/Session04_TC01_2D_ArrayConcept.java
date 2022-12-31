package arraysTopic;

import java.util.Scanner;

public class Session04_TC01_2D_ArrayConcept {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		// Scan the values
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				mat[i][j] = sc.nextInt();

			}

		}

		// Print the values
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				System.out.println(mat[i][j] + " ");

			}
			System.out.println();
		}
	}

}
