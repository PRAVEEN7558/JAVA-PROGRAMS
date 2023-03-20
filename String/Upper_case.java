package String;

public class Upper_case {

	public static void main(String[] args) {
		String s = "payilagam is in velachery";
		System.out.println(s.lastIndexOf((int) 'a')); /// last irukura 'a' index number--> 19
		System.out.println(s.indexOf((int) 'a'));    ///  first irukura  'a' index number-->1
		System.out.println(s.lastIndexOf('a'));   ///   last irukura 'a' index number--> 19
		System.out.println(s.lastIndexOf("in")); ///  last 'in'endha index  irukko andha index -->13 

		String arr[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {

			String one = arr[i];   
			int count = 0;
			for (int j = 0; j < one.length(); j++) {
				if (one.charAt(j) == 'a') { ///  one[payilagam]--> 'a' number of count--> 3 
					count++;                //// one[is]--> 'a' number of count--> 0
				}                           //// one[in]--> 'a' number of count--> 0
			}                               ///  one[is]--> 'a' number of count--> 1
			System.out.println("count of i in " + one + " is " + count);
		}
		for(int i=0; i<arr.length;i++) {
			String temp=arr[i];
			char k=(char) (temp.charAt(0)-32);  ///index 0 irukura value ellam upper case matthanum 
			temp=temp.replace(temp.charAt(0), k);      /// payalagam--> Payilagam 
			arr[i]=temp;                               /// is-->Is
		}                                              /// in -->In
		System.out.println(" ");                       /// velachary -->Velachery
		
		for(String var:arr) 
		{ 
			System.out.print(var+" "); 
			}
	}

}
