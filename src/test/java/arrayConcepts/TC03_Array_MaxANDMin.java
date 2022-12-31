package arrayConcepts;

public class TC03_Array_MaxANDMin {

	/*
	 * Given an array, write a function that returns 
	 * size, min and max of the array
	 */
	
	public static int[] size_And_Max_Min(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		 int[] ans = {n, min, max};
		 return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {11, 565, 12, 7587, 3213, 99, 12};
		
		
		int[] A= size_And_Max_Min(arr);
		System.out.println("Size ="+A[0]);
		System.out.println("Min ="+A[1]);
		System.out.println("Max ="+A[2]);
	}

}
