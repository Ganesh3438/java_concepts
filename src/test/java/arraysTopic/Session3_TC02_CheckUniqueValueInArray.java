package arraysTopic;

public class Session3_TC02_CheckUniqueValueInArray {

	public static int checkUniqueValue(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			
			int value = arr[i];
			
			int freq = 0;
			
			for(int j=0; j<n; j++) {
				if(arr[j]==value) {
					freq++;
				}
			}
			
			if(freq == 1) {
				return value;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 10, 1, 5, 10};
		System.out.println(checkUniqueValue(arr));
	}

}
