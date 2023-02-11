package condition_statement;

import java.util.Scanner;

public class Data {
public void Odd_even(int num) {
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
	}
public void equal(int n,int s) {
		if(n==s)
		{
			System.out.println("same number");
		}
		else 
		{
			System.out.println("not same");
		}
	}
public void divisible(int num) { 
			if(num/3==0)
			{
				System.out.println("Divisible");
			}
			else 
			{
				System.out.println("Non Divisible");
			}
	}
public int highest_number(int a,int b) {
		if(a>b)
		{
			System.out.println("highest number");
			return a;
		}
		else 
		{
			System.out.println("lowest number");
			return b;
		}	
	}
public void biggest_number(int x,int y,int z) {
		if(x>y && x>z)
		{
			System.out.println(x);
		}
		else if(y>x && y>z)
		{
			System.out.println(y);
		}
		else if(z>x && z>y)
		{
			System.out.println(z);
		}	
		else {
			System.out.println("all are equal");
		}
	}
public static void main(String []arg ){
 Data obj=new Data();
 obj.Odd_even(13);
 obj.divisible(86);
 obj.equal(567, 765);
 obj.highest_number(89,97);
 obj.biggest_number(345,541,100);
 Scanner sc=new Scanner(System.in);
}
}
