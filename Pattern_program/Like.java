package Pattern_program;

public class Like {

	public static void main(String[] args) {
		//int row;
		for(int row=0; row<5;row++) {
			//int col=row;
			for(int col=0;col<5-row;col++) {
				//int i=col+row;
				System.out.print(col+1 + " ");
			}
			System.out.println();
		}
	System.out.println();
	for(int row=1; row<=5;row++) {
		//int col=row;
		for(int col=1;col<=row;col++) {
			//int i=col+row;
			System.out.print( "*");
		}
		System.out.println();
	}
	
	System.out.println();
	for(int row=0; row<5;row++) {
		//int col=row;
		for(int col=0;col<1+row;col++) {
			//int i=col+row;
			System.out.print(col+1 + " ");
		}
		System.out.println();
	}


	System.out.println();
	for(int row=1; row<=3;row++) {    
		for(int col=1;col<=5;col++) {
			if(col==3)
			{
			System.out.print(col+" ");
			} else {
		    System.out.print(" ");
			}
		}  
		System.out.println();
	}
}}
