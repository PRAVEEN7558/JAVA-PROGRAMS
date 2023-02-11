package Pattern_program;

public class File {

	public static void main(String[] args) {
		int number=5;
		
		for(int row=1;row<=number;row++)
		{ 
			int s=row;
			for( int col=1;col<=number;col++) {
				
				System.out.print(s+" ");
				s=s+number;
			}
			System.out.println("");
	}
	}
}
