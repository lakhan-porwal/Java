package array;

public class MaxArray {
	public static void main(String[] args) {
		int [] arr = {10,11,15,17,12,11 }; 
			int max = 0;
			for(int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}System.out.println("Maximum : " + max);
		}

}
