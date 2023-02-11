package test;

public class Multiplex {
	static String Name="kamala";
	String movie_name;
	int movie_time;
	Multiplex(String movie_name,int movie_time){
		this.movie_name=movie_name;
		this.movie_time=movie_time;
	System.out.println(Name+" "+movie_name+" "+movie_time);
	}
	void display() {
	//System.out.println(Name+" "+movie_name+" "+movie_time);
	}
	public static void main(String[] args) {
		Multiplex screen1=new Multiplex("varisu",1);
		Multiplex screen2=new Multiplex("thunivu",2);
		screen1.display();
		screen2.display();
	}

}
