package Threading;

public class Sec {//extends Abc {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj=new MyThread();
		obj.start();
//		try {
//			obj.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		obj.yield();

		for(int i=0; i<5; i++) {
			System.out.println("my thread");
		}
	}

}
