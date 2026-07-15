package array;

public class LargestNumber {
	   public static int findLargest(int[] arr) {
	        int  largest = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] >  largest) {
	               largest = arr[i];
	            }
	        }

	        return largest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 25, 7, 50, 15};

	        int result = findLargest(numbers);

	        System.out.println("Largest number is: " + result);
	    }
	}


