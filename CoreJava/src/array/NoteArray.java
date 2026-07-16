package array;

public class NoteArray {
	public static void main(String[] args) {
		
	
	int money = 6798;
	
	int []notes = {500,200,100,50,20,10,5,2,1 };
	
	int count = 0;
	
	for ( int i = 0; i < notes.length; i++) {
		
		count = money /notes[i] ;
		if (count > 0) {
			System.out.println(notes[i] + "=" + count);
		}
		money = money % notes[i];
	
	}

}
}
