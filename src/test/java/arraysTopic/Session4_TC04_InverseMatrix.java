package arraysTopic;

public class Session4_TC04_InverseMatrix {
	
	static int[] inverseMatrix(int[]arr) {
		int n = arr.length;
		int inv[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int val = arr[i];
			inv[val] = i;
		}
		return inv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 0, 1};
		int inv[] = inverseMatrix(arr);
		int len = inv.length;
		for(int i=0; i<len; i++) {
			System.out.print(inv[i]+ " ");
		}
	}

}
