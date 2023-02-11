package test;


public class Animal extends AnimalTravel
	{
	public void travel() 
	{ 
		System.out.println("animal cat"); 
	}
public static void main(String arg[])
	{
	AnimalTravel a = new AnimalTravel();
    //a.eat();
    a.travel();
    }
}