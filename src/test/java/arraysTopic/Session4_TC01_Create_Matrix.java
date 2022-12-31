package arraysTopic;

import java.util.Scanner;

public class Session4_TC01_Create_Matrix {

	/*
	 * Take N and M from user and then N * M values. Create a matrix of size n*m,
	 * and fill values in this matrix given by user
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		// Scan the values
		for(int i=0; i<n; i++) {
			 for(int j=0; j<m; j++) {
				 mat[i][j] = sc.nextInt();
			 }
		}
		
		
		// Print the values
		for(int i=0; i<n; i++) {
			 for(int j=0; j<m; j++) {
				 System.out.print(mat[i][j] + " ");
			 }
			 System.out.println();
		}
        
	}

}
