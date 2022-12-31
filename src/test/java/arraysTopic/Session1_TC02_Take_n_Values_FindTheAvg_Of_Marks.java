package arraysTopic;

import java.util.Scanner;

public class Session1_TC02_Take_n_Values_FindTheAvg_Of_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Enter the marks and store into an array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = 0;

		for (int i = 0; i < n; i++) {

			temp = temp + arr[i];

		}
		System.out.println(temp);
		double avg = temp/(double)n;
		System.out.println(avg);
	}

}
