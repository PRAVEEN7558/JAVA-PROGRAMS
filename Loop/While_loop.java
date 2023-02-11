package Loop;

public class While_loop 
{
	public static void main(String []arg)
	{
		int check_count=0;		
		int count=1;
	while(count<=200)
		{
			if (count%11==0&&count%12==0)
			{
				check_count++;
				System.out.println(count);
			}
	count++;
		}
	System.out.println(check_count);
	}
}
