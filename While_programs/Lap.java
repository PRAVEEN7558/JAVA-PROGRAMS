//print the given number 1,3,5,7,9,11,13,...range of 1 t0 40?.
package While_programs;
public class Lap {

	public static void main(String[] args) {
		int x=0;
		while (x<=40)
		{
			if (x%2==0)// x%2==1   1,3,5,7,9,......
			{
				System.out.print(" "+x);
			}
		 x++;	
		}

	}

}
