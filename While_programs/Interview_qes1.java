package While_programs;

public class Interview_qes1 {

	public static void main(String[] args) {
		int time=8;
		         
		int no1=9;
		int no2=12;
		int no3=15;
		int max=no3;
	
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
		System.out.println("Time is : " +((lcm/60)+time));
	


	}

}
