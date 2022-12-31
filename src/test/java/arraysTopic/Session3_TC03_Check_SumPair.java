package arraysTopic;

public class Session3_TC03_Check_SumPair {
	
	public static boolean target_Sum_Pair(int[] arr, int k) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			
			for(int j= i+1; j<n; j++) {
				if(arr[i]+ arr[j]==k) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = {5, 7, 1, 3, 5, 8};
		
		System.out.println(target_Sum_Pair(arr, 10));

	}

}
