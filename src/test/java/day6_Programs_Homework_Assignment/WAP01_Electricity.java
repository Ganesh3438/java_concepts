package day6_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP01_Electricity {

	/*
	 * Problem Description Mr. T got the Electricity bill of his house. He felt that
	 * the bill amount was too much. He come to you to understand the relation
	 * between amount and number of units with Electricity bill.
	 * 
	 * 
	 * Instructions are give on Electricity biil that : 1. For first 50 units Rs.
	 * 0.50/unit. 2. For next 100 units Rs. 0.75/unit. 3. For next 100 units Rs.
	 * 1.20/unit. 4. For above 250 units Rs. 1.50/unit. 5. An additional surcharge
	 * of 20% is added to the bill.
	 * 
	 * NOTE: As the electricity bill can have any real value (floating point), you
	 * have to tell the floor value of the bill. Floor value of a floating point is
	 * the closest integer less than or equal to that value. For eg. Floor value of
	 * 2.91 is 2.
	 * 
	 * To avoid manual calculation again and again, You have to write a code which
	 * take number of Unit (suppose N) from user and print the amount.
	 * 
	 * 
	 * 
	 * Problem Constraints 0 < N <= 100000
	 * 
	 * 
	 * Input Format Take an integer N from user
	 * 
	 * 
	 * Output Format Print the amount for that much unit
	 * 
	 * 
	 * Example Input Input 1 : 150
	 * 
	 * Input 2 : 4
	 * 
	 * 
	 * Example Output Output 1 : 120
	 * 
	 * Output 2 : 2
	 * 
	 * 
	 * Example Explanation Explanation 1: For first 50 units, the bill is (Rs
	 * 0.5/unit) * (50 unit) = Rs 25 For next 100 units, the bill is (Rs 0.75/unit)
	 * * (100 unit) = Rs 75 Bill amount without additional surcharge = Rs 100 Total
	 * Bill amount with additional surcharge = Rs (100 + 0.20 * 100) = Rs 120
	 * 
	 * Explanation 2: Bill without additional surcharge (Rs 0.5/unit) * (4 unit) =
	 * Rs 2 Total Bill amount with additional surcharge = Rs (2 + 0.20 * 2) = Rs 2.4
	 * Floor value of Bill amount = Rs 2
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double a;
        if(N<=50)
        {
            a=N*0.5;
        System.out.println((int)(a+0.20*a));
        }
        else if(N>=50 && N<=150)
        {
            a=((50*0.5)+((N-50)*0.75));
            System.out.println((int)(a+0.20*a));
        }
        else if(N>=150 && N<=250)
        {
            a=((50*0.5)+(100*0.75)+((N-150)*1.20));
            System.out.println((int)(a+0.20*a));
        }
        else 
        {
            a=((50*0.5)+(100*0.75)+(100*1.20)+((N-250)*1.50));
            System.out.println((int)(a+0.20*a));
        }
	}

}
