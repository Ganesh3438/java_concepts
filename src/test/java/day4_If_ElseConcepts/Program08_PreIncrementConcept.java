package day4_If_ElseConcepts;

public class Program08_PreIncrementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		// Note: increment first and then assignment happens
		System.out.println("----------------");
		
		int c = 10;
		int d = ++c + c++;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("--------------");
		
		int x = 10;
		boolean y = x++ > 10;
		System.out.println(a); // 11
		System.out.println(y); // false
		

	}

}
