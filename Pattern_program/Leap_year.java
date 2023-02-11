//leap year program?

package Pattern_program;

public class Leap_year {
	
	public  static void leap(int no)
	{
		if (no % 4 == 0 && no % 100 != 0 || no %400==0) {
			System.out.println("this is leap year  " + no);
		} else {
			System.out.println("this is not leap year  " + no);
		}
	}
		
	public static void main(String arg[]) {
		Leap_year test=new Leap_year();
		test.leap(48);
		}
	}
	
	
