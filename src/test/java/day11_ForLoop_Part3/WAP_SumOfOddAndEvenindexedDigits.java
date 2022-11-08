package day11_ForLoop_Part3;

import java.util.Scanner;

public class WAP_SumOfOddAndEvenindexedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		int index = 0;
		for(; n>0; ) {
			
			int d = n % 10;
			if(index % 2==0) {
				sumEven = sumEven + d;
			}else {
				sumOdd = sumOdd + d;
			}
			n= n/10;
			index++;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
