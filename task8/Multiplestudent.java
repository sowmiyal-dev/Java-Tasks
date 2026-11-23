package task8;

public class Multiplestudent {

	//t1
	synchronized void student1() {
		System.out.println("student1 waiting for result");
		try {
			wait();//block
			System.out.println("student1 result:85");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//t2
	synchronized void student2() {
		System.out.println("student2 waiting for result");
		try {
			wait();//block
			System.out.println("student2 result:78");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//t3
	synchronized void student3() {
		System.out.println("student3 waiting for result");
		try {
			wait();//block
			System.out.println("student3 result:92");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//t4
	synchronized void teacher() {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("teacher checking paper:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("teacher published result");
		notifyAll();// it will realize all thread
	}

	// normal method
	public void attendance() {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("attendance:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Multiplestudent exam= new Multiplestudent();

		Thread t1= new Thread(()->{
			exam.student1();
		});

		Thread t2= new Thread(()->{
			exam.student2();
		});

		Thread t3= new Thread(()->{
			exam.student3();
		});

		Thread t4= new Thread(()->{
			exam.teacher();
		});

		t1.start();//1
		t2.start();//2
		t3.start();//3
		exam.attendance();//main thread
		t4.start();//4
	}
}