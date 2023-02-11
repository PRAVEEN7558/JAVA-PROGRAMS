package Loop;

public class Count 
{ 
	public static void main(String []arg) 
	{
		int check_count=0;		
		int count=1;
		while(count<=200)
		{
			if (count%7==0)
			 {
				check_count++;
				System.out.println(count);
			 }
		count++;
		}
	System.out.println(check_count);
	}
}