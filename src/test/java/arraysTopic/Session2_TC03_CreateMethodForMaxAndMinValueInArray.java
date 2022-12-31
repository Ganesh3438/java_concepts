package arraysTopic;

public class Session2_TC03_CreateMethodForMaxAndMinValueInArray {

	public static int[] maxAndmin_Value(int arr[]) {
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
		
		int[] ans = {n, max, min};
		return ans;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {23, 11, 45, 6776, 123, 46};
		int a[] = maxAndmin_Value(arr);
		System.out.println("Size of the array is:"+ a[0]);
		System.out.println("Max value in the array is:"+ a[1]);
		System.out.println("Min value in the array is:"+ a[2]);
	}

}
