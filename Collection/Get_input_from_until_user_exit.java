package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Get_input_from_until_user_exit {

	public static void main(String[] args) {
		
		List aa = new LinkedList();
		Scanner sc =new Scanner(System.in);
		
		while(sc.hasNext()){
			String ss=sc.next();
			if(ss.equals("exit")) {
			break;	
			}else{
				aa.add(ss);
			}
		}
       System.out.println(aa);
	}

}
