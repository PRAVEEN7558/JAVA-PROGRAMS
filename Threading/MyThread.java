package Threading;

public class MyThread extends Thread {
	
	public void run() {
		
		for(int i=0; i<20; i++) {
			System.out.println("Hai");
		}
	}
	
	
	
	public static void main(String[] args) {
//		MyThread obj=new MyThread();
//		obj.run();
	}

}
