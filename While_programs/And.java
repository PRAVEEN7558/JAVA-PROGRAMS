//Multiple the number three and five in to the range 1 to 100?
package While_programs;
public class And 
{
public static void main(String []arg) 
{
	int count=1;
	while(count<=100) 
	{
		if (count%3==0 && count%5==0) 
		{
			System.out.println(count);
		}
		count++;
	}
}
}