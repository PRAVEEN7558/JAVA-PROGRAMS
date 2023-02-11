package condition_statement;

public class Student_Marks 
{
	int mark;
	char grade;
	public void Marks(int mark){
	if (mark>=500) {
		System.out.println("500 greater then pass mark");
		if (mark>=500 && mark<700) 
		{
			grade ='C';
			System.out.println(mark+"is pass mark grade is="+grade);
		}
		else if(mark>=700 && mark<900) {
			grade ='B';
			System.out.println(mark+"is pass mark grade is="+grade);
		}
		else  if(mark>=900 && mark<1100)
		{
			grade ='A';
			System.out.println(mark+"is pass mark grade is="+grade);
		}
		else if (mark>=1100 && mark<=1200)
		{
			grade ='O';
			System.out.println(mark+"is pass mark grade is "+grade+"+");
		}
		else 
		{
		System.out.println(("invalid"));	
		}
	}
		else 
		{
			System.out.println("not pass");
		}
	}
	public static void main(String[] args) {
		Student_Marks obj=new Student_Marks();
		obj.Marks(1700);
	}

}
