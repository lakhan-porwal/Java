package array;

public class Max__Array {
	public static void main(String[] args) {
		int [] a = {22,5,21,10,51,55,100};
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] < max);{
				max = a[i];
			}
		}
		System.out.println("Max Value is : " + max);
	}
		}
