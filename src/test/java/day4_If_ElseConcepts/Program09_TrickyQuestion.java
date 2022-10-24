package day4_If_ElseConcepts;

public class Program09_TrickyQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, d;
		a = b = c = d = 20;
		a +=b -=c *= d /= 20;
		System.out. println("A = " + a + " B = " + b + " C = " + c + " D = " + d);
		 
		// Note: It is BODMAS
		// first we need to divide and multiply then subtraction 
		// and then addition
      
	}

}
