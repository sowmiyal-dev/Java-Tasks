package task8;

public class onlineorder extends Thread{

	// =>create thread use run method
	public void run() {
		System.out.println("order thread run state:"+Thread.currentThread().getState());//RUNNABLE
		for(int i=0;i<3;i++) {
			System.out.println("order processing:"+i);
		}
		try {
			System.out.println("order sleeping");
			Thread.sleep(2000);//TIMED_WAITING
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("order completed");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		onlineorder order= new onlineorder();
		System.out.println("order:"+order.getState());//NEW

		order.start();//thread 1
		System.out.println("order:"+order.getState());//RUNNABLE

		Thread.sleep(500);
		System.out.println("order:"+order.getState());//TIMED_WAITING

		order.join();
		System.out.println("order:"+order.getState());//TERMINATED

		if(order.isAlive()) {
			System.out.println("order thread is alive");
		} else {
			System.out.println("order thread is not alive");
		}
	}
}