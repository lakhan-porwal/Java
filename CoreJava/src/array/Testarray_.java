package array;

public class Testarray_ {
     public static void main(String[] args) {
	 int [] a = {10,20,30,40,50,60,70,80,90,100};
	 
	 System.out.println("Length of Array is : " + a.length);
	 System.out.println(a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4]);
	 System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);	
	 
	 
	 System.out.println("Hello World");
	 for(int i = 0; i < a.length ; i++ ) { 
		 System.out.println(a + "=" + a[i]);
	 }
}

}
