package arraysTopic;

public class Session2_TC02_Check_ConsecutiveValuesArePresentOrNot {
	
	// Creating a method to check consecutive values are present or in an array
	
	public static boolean checkConsectuiveValues(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {12, 45, 23, 67, 1, 34};
        System.out.println(checkConsectuiveValues(arr));
        }
	}


