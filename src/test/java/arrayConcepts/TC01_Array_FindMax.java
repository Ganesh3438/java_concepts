package arrayConcepts;

public class TC01_Array_FindMax {

	public static int maxNumber(int arr[]) {
		int n = arr.length;
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 42, 13, 11, 78, 1, 2, 6 };

		System.out.println(maxNumber(arr));
	}

}
