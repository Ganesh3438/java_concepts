package arraysTopic;

import java.util.Scanner;

public class Session1_TC03_FindHigheshMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] > temp) { 
				temp = arr[i];
			}

		}
		
		System.out.println(temp);
	}

}
