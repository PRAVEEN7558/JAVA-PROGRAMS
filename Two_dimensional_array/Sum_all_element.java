package Two_dimensional_array;

public class Sum_all_element {                           //////////      Sum of all element   /////////
public static void main(String arg[]) {
	int arr[][] = new int[3][3];
	int sum = 1;

	for (int i = 0; i < arr.length; i++) {

		for (int j = 0; j < arr[i].length; j++) {            
			arr[i][j] = sum;                                          
			sum+= 1;                                                 
		}                                                             
	}
	int total=0;
	int val=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			total+=arr[i][j];
		}
	}
	System.out.print("Sum of all element= "+ total);
}
}
