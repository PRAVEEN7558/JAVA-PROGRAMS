package String;

public class Vowels_string {

	public static void main(String[] args) {
	
		String str = new String("Hi Welcome to my home");
		
		String[] words = str.split(" ");
		
		int temp = 0;
		for(int i=0;i<words.length;i++)
        {
           for(int j=0;j<words[i].length();j++)
           {
              char ch=words[i].charAt(j);   
              if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')  
              {
                     temp=1;
                }
           }
           if(temp==1)
           {
              System.out.print(words[i]+" ");  
           }
           temp=0;
        }
        
	  }

	}


