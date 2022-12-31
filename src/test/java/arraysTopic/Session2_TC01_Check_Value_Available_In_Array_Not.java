package arraysTopic;

public class Session2_TC01_Check_Value_Available_In_Array_Not {

   // Creating a method to check a value is present in array or not?
	
	public static boolean checkValueInArray(int arr[], int k) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == k) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12, 4, 23, 1, 5};
		System.out.println(checkValueInArray(arr, 1));
	}

}
