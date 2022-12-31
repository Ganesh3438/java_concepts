package arrayConcepts;

public class TC02_Array_FindMin {

	public static int minNumber(int arr[]) {
		int n = arr.length;
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1, 11, 0, 2, 5, -1, -9};
		
		System.out.println(minNumber(arr));
	}

}
