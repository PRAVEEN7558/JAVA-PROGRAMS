//Count the number of even number range of 1 to 500?
package While_programs;
public class Range 
{
	public static void main(String[] args) {
		int C_Number=0;
		int even=1;
		while (even<=500) 
		{
			if(even%2==0) 
			{
				C_Number++;
				System.out.println(even);
			}
			even++;
		}
System.out.println(C_Number);
	}

}
