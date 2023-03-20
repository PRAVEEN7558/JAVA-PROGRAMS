package Threading;



//public void run() {
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("Hello");
//		}
//}
//
//	public static void main(String[] args) {
//		
//
//	}

	

	import java.util.Random;
	import java.util.Scanner;

	/**
	 * @author logan
	 *
	 */
	public class GuessTheNumber_Game {

		/**
		 * @param args
		 */
		
		Scanner sc;
		int arr1[];
		int arr2[];
		int count[];
		public static int range;
		String random_number;
		
		public void toGetRandom_Number()
		{
			sc=new Scanner(System.in);
			System.out.println("Enter the digit range of number that you want to guess:");
			range=sc.nextInt();
			
			Random r=new Random();
			
			arr1=new int[range];
			
			random_number="";
			for(int i=0;i<range;i++)
			{
				arr1[i]=r.nextInt(9);
				random_number+=arr1[i];
			}
			
//			for(int i:arr1)
//				System.out.print(i+" ");
			
			toCount_Random();
			
		}
		
		public void toGetUser_Number()
		{
			sc=new Scanner(System.in);
			
			System.out.println("\nEnter number to guess: ");
			//try{
				
				String str=sc.nextLine();
				
//				for(int i=0;i<str.length();i++)
//				{
//					if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
//						//throw new GuessNumberException(Error_msg_GuessNumber.err2_input_mismatch);
//				}
				
				arr2=new int[range];
				
				if(str.length()!=range)
				{
					//throw new GuessNumberException(Error_msg_GuessNumber.err1_input_mismatch);
				}
		
				for(int i=0;i<str.length();i++)
				{
					int temp=str.charAt(i);
					arr2[i]=temp-48;
				}
				
				System.out.println();
				for(int i:arr2)
					System.out.print(i+" ");
				
				toGuessNumber();
			
			//}
//			catch(ArrayIndexOutOfBoundsException e)
//			{
//				e=new ArrayIndexOutOfBoundsException(Error_msg_GuessNumber.err1_input_mismatch);
//				System.out.println(e.getMessage());
//				toGetUser_Number();
//			} 
//			catch (GuessNumberException e) 
//			{
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//				toGetUser_Number();
//			}
//			catch (Exception e) 
//			{
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//				
//			}		
		}
		
	  public void toGuessNumber()
		{
			char ch[]=new char[range];
			int check=0;
			int count_user[]=new int[range];
			
			for(int i=0;i<arr2.length;i++)
			{
				for(int j=i;j<=i;j++)
				{
					if(arr2[i]==arr1[j])
					{
						ch[i]='c';
						check++;
					}
				}
			}
			
			if(check==range)
			{
				{
					System.out.println();
					for(char i:ch)
						System.out.print(i+" ");
				}
				System.out.println("\n\nCongratulations, You have guessed correctly. \n\nThe number is : "+random_number );
			}
			else
			{
				for(int i=0;i<arr2.length;i++)
				{
						int j=0,index=0;
						boolean value=false;
						
					if(ch[i]!='c') {
						
						while(index<i)				//to check if the number is presents before, if it presents then the outer loop(j) will start from (i)index.
						{								//the loop will run until i index. 
							if(arr2[i]==arr2[index] && ch[index]=='p')
								{
									if(count_user[index]==count[toGetCount(arr2[i])])
									{
										//ch[i]='x';
										j=arr1.length;
									}
								}
							index++;
						}
						
					for(;j<arr1.length;j++)
					{
						
						if(arr2[i]==arr1[j] && ch[j]!='c')				//if user number and random number are same but their index is different, then it will indicate as p.
						{
							ch[i]='p';
							value=true;
							count_user[i]+=1;
							//break;
						}
					}
					
					if(j==arr1.length && value!=true)							//if user number not same as random number, then it will indicate as x.
						ch[i]='x';
					
					}
				}
					System.out.println();
					for(char i:ch)
						System.out.print(i+" ");
					
					System.out.println();
					toGetUser_Number();
			}
			
		}
	  
	  public void toCount_Random()
	  {
		  count=new int[range];
			
			
			for(int i=0;i<arr1.length;i++)
			{
				int index=0,j=i;
				while(index<i)
				{
					if(arr1[i]==arr1[index])
					{
						count[i]=0;
						j=arr1.length;
					}
					index++;
				}
				
				for(;j<arr1.length;j++)
				{
					if(arr1[i]==arr1[j])
					{
						count[i]+=1;
					}
				}
			}
	  }
	  
	  private int toGetCount(int num) {
			// TODO Auto-generated method stub
			  
			  int i=0;
			  for(;i<arr1.length;i++)
			  {
				  if(num==arr1[i])
				  {
					  return i;
				  }
			  }
			  
			return i;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			GuessTheNumber_Game obj=new GuessTheNumber_Game();
			obj.toGetRandom_Number();
			obj.toGetUser_Number();	
		}

	
}
