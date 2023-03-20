package Threading;

public class withdrawal {
	int bal = 200;

	public synchronized void withdraw() {
		bal -= 10;
		System.out.println(bal + " one");
	}

	public synchronized void withdraw_inATM() {
		bal -= 10;
		System.out.println(bal + " two");
	}

	public static void main(String[] args) throws InterruptedException {
		withdrawal obj = new withdrawal();
		Runnable aa = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread 1");
					obj.withdraw();
					// obj.withdraw_inATM();
				}
				//obj.withdraw();
			}
		};
		Runnable bb = new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread 2");
					// obj.withdraw();
					obj.withdraw_inATM();
				}
				//obj.withdraw_inATM();
			}
		};
		// aa.withdraw();
		// Runnable ff = new Runnable();

		Thread t1 = new Thread(aa);

		Thread t2 = new Thread(bb);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.bal);
	}

}
