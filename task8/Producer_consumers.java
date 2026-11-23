package task8;

public class Producer_consumers {

	int product;

	//consumer threads
	synchronized void consumer() {
		while(product==0) {
			try {
				System.out.println(Thread.currentThread().getName()+" no product,waiting");
				wait();//block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		product--;
		System.out.println(Thread.currentThread().getName()+" consumed product:"+product);
	}

	//producer => one product
	synchronized void realize1() {
		product++;
		System.out.println("producer made 1 product:"+product);
		notify();// it will realize first
	}

	//producer => many product
	synchronized void realizeall() {
		product=product+3;
		System.out.println("producer made 3 product:"+product);
		notifyAll();// it will realize all thread
	}

	public static void main(String[] args) {
		Producer_consumers store= new Producer_consumers();

		Thread t1= new Thread(()->{
			for(int i=0;i<2;i++) {
				store.consumer();
			}
		},"consumer1");

		Thread t2= new Thread(()->{
			for(int i=0;i<2;i++) {
				store.consumer();
			}
		},"consumer2");

		Thread t3= new Thread(()->{
			for(int i=0;i<2;i++) {
				store.consumer();
			}
		},"consumer3");

		Thread t4= new Thread(()->{
			try {
				for(int i=0;i<3;i++) {
					Thread.sleep(1000);
					store.realize1();
				}
				Thread.sleep(1000);
				store.realizeall();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"producer");

		t1.start();//1
		t2.start();//2
		t3.start();//3
		t4.start();//4
	}
}