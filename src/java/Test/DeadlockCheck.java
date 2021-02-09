package Test;

import java.util.ArrayList;
import java.util.List;

public class DeadlockCheck {

	List<Object> arrayList = new ArrayList<>();

	public void test() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				arrayList.add(i);
			}
		}
	}
	
	class MyThread1 extends Thread {
		DeadlockCheck t;

		MyThread1(DeadlockCheck t) {
			this.t = t;
		}

		public void run() {
			t.test();
		}
	}
	public static void main(String[] args) {
		DeadlockCheck dc = new DeadlockCheck();
//		MyThread1 t1=new MyThread1(dc);
//		t1.start();

	}
}
