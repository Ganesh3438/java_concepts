package arraysTopic;

public class Session3_TC01_CheckArrayIsSortedORNot {

	public static boolean checkArrayIsSorted(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1]) {
                 continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2, 5, 9, 11, 12}; 
		System.out.println(checkArrayIsSorted(arr));
	}

}
