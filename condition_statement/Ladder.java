package condition_statement;

public class Ladder {
	public void interest(int age) {
	    if(age>=18) 
		{
			System.out.println("eligible for interest");
			
		if(age>=18 && age<60) {
			System.out.println("interest rate is 6%");
		}
		else if (age>=60 && age<80)
		{
			System.out.println("interst rate 6.5%");
		}
		else if (age>=80 && age<=135)
		{
			System.out.println("interst rate 9%");
		}
		}
		else {System.out.println("not eligible");
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ladder obj=new Ladder();
		obj.interest(14);
	}

}
