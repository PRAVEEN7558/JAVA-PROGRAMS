package Collection;

import java.util.ArrayList;
import java.util.List;

public class Coll1 {

	public static void main(String[] args) {
		
		List a=new ArrayList();
		a.add(1);
		a.add(233); 
		a.add(8996); 
		a.add(922); 
		a.add(94); 
		a.add(77); 
		a.add(78);
		a.add(989); 
		
		ArrayList l = new ArrayList(a);
		
		System.out.println(a);
		int aSum=0;
		for(int t=0;t<a.size();t++)
		{
			aSum=aSum+(Integer)l.get(t);
		}
		
		System.out.println("Sum of  a all element = "+aSum);
		
		ArrayList even = new ArrayList();
		 
		//System.out.println(even);
		
		int evSum=0;
		for(int i=0; i<a.size();i++) 
		{
			if(	(Integer)l.get(i)%2==0) 
			{
				
				even.add(l.get(i));
				evSum=evSum + (Integer)l.get(i);
				
			}
			
		}
		System.out.println("\n"+even+" Even Element ");
		System.out.println("Sum of even element = "+evSum);
		
		ArrayList odd = new ArrayList();
		int oddSum=0;
		for(int j=0; j<a.size();j++) 
		{
			if(	(Integer)l.get(j)%2!=0) 
			{
				odd.add(l.get(j));
				oddSum=oddSum + (Integer)l.get(j);
			}
		}
		System.out.println("\n"+odd+" Odd Element ");
		System.out.println("Sum of Odd element = "+oddSum);
		
		ArrayList oddIndex = new ArrayList();
		int odd_IndexSum=0;
		for(int j=0; j<a.size();j++) 
		{
			if(	j%2!=0) 
			{
				oddIndex.add(l.get(j));
				odd_IndexSum= odd_IndexSum+ (Integer)l.get(j);
			}
		}
		System.out.println("\n"+oddIndex+" Odd Index ");
		System.out.println("Sum of Odd Index = "+odd_IndexSum);
		
		
		ArrayList evenIndex = new ArrayList();
		int even_IndexSum=0;
		for(int g=0; g<a.size();g++) 
		{
			if(	g%2==0) 
			{
				evenIndex.add(l.get(g));
				even_IndexSum= even_IndexSum+ (Integer)l.get(g);
			}
		}
		System.out.println("\n"+evenIndex+" Even Index ");
		System.out.println("Sum of Even Index = "+even_IndexSum);
		
		
	}

}
