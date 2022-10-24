package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP07_Check_ClassPerformance {

	/**
	 * 
	 * You have been given a dataset for marks of 2 subjects, scored by students of
	 * classes ClassA and ClassB. You now want to compare the performances of class
	 * A and class B by finding out the average performance of the classes. Write a
	 * program to find if class A performed better. Print True is Class A is
	 * strictly better else return False.
	 * 
	 * 
	 * Input Format
	 * 
	 * There are 4 lines in the input. The first and second lines are marks of
	 * subjects for Class A. The third and fourth lines are marks of subjects for
	 * Class B.
	 * 
	 * 
	 * Output Format
	 * 
	 * Print True if class A is strictly better else False.
	 * 
	 * 
	 * Example Input
	 * 
	 * Input 1:- 80 27 54 61 Input 2:- 54 61 80 27
	 * 
	 * 
	 * Example Output
	 * 
	 * Output 1:- False Output 2:- True
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Sample Explanation
	 * 
	 * Explanation 1:- The average marks of class A is (80 + 27)/2 = 53.5, and the
	 * average of class B is (54 + 61)/2 = 57.5, so class B's average is better
	 * hence False is printed. Explanation 2:- The average marks of class A is(54 +
	 * 61)/2 = 57.5, and the average of class B is(80 + 27)/2 = 53.5, so class B's
	 * average is better hence True is printed.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int classA = (a+b)/2;
        int classB = (c+d)/2;

        if(classA>classB){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
	}

}
