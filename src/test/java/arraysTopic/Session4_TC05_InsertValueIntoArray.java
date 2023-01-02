package arraysTopic;

public class Session4_TC05_InsertValueIntoArray {
	
	static int[] insertValueIntoArray(int[] arr, int pos, int val) {
		int idx = pos-1;
		int n = arr.length;
		int[] ans = new int[n+1];
		
		// Copy content 0 to idx-1 from arr to ans
		for(int i=0; i<idx; i++) {
			ans[i] = arr[i];
		}
		ans[idx] = val;
		
		// deal with remaining values
		for(int i=idx; i<n; i++) {
			ans[i+1] = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20, 14, 12, 1, 3, 5};
		int val = 2;
		int pos = 1;
		int values[] = insertValueIntoArray(arr, pos, val);
		int count = values.length;
		for(int i=0; i<count; i++) {
			System.out.print(values[i] + " ");
		}
		
		
	}

}
