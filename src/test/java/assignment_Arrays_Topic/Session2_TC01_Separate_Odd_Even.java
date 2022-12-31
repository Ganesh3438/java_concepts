package assignment_Arrays_Topic;

import java.util.Scanner;

public class Session2_TC01_Separate_Odd_Even {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		int T = scn.nextInt();
		while (T-- > 0)
		{
		int N = scn.nextInt();
		int[] A = new int [N];
		int odd = 0;
		int even = 0;
		for ( int i = 0; i < N; i++)
		{
		A[i] = scn.nextInt();
		if(A[i] % 2 == 1)
		{
		System.out.print(A[i] + " ");
		}
		}
		System.out.println();
		for ( int i = 0; i < N; i++)
		{
		//A[i] = scn.nextInt();
		if(A[i] % 2 == 0)
		{
		System.out.print(A[i] + " ");
		}
		}
		System.out.println();
		}

	}

}
