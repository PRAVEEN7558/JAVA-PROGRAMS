package While_programs;

public class Fact {
	public static void main (String arg[]) {
int no=5;
int fact=no;
while(no>1) {
	no--;
	fact=fact*no;
}
	System.out.println(fact);
}
}
