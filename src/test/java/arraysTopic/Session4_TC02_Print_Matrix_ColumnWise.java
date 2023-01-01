package arraysTopic;

import java.util.Scanner;

public class Session4_TC02_Print_Matrix_ColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int mat[][] = new int[n][m];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Print
		for(int j=0; j<m; j++) {
			
			for(int i=0; i<n; i++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
