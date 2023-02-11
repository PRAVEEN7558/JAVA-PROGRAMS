//write a program to lcm for two number ?
//write a program to lcm for three number ?
package While_programs;
public class LCM {
public static void main(String arg[]) 
{
	int no1=3;
	int no2=5;
	int no3=75;
	int max=no2;
	int lcm=0;
	while(lcm<=no3) 
	{
		if(max%no1==0 && max%no2==0 && max%no3==0) 
		{
			lcm=max;
			break;
		}
		max++;
	}
	System.out.println(lcm);
}
}
