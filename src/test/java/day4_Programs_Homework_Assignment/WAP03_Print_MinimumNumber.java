package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP03_Print_MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a<b) && (a!=b)){
        System.out.print(a);
        }else{
          System.out.print(b);
        }
	}

}
