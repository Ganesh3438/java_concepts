package day12_Pattern_Part1;

import java.util.Scanner;

public class WAP05_StarAndNumberCombinationPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n ; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if(j%2==0) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		

	}

}
