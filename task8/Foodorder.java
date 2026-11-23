package task8;

public class Foodorder {

	//t1
	synchronized void customer() {
		System.out.println("customer waiting for food");
		try {
			wait();//block
			System.out.println("customer got the food");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//t2
	synchronized void chef() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("chef preparing food:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("food is ready");
		notify();// it will realize customer
	}

	// normal method
	public void order() {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("order:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Foodorder food= new Foodorder();

		Thread t1= new Thread(()->{
			food.customer();
		});

		Thread t2= new Thread(()->{
			food.chef();
		});

		t1.start();//1
		food.order();//main thread
		t2.start();//2
	}
}