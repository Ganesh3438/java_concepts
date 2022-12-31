package arraysTopic;

import java.util.Scanner;

public class Session1_Take_Five_Values_From_User_StoreThatInAn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n]; 
		
	    // Enter values and storing into an array
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		// Print the values under array
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
