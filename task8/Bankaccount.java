package task8;

public class Bankaccount {

	int balance;

	//t1,t2
	synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" try withdraw:"+amount);
		if(balance>=amount) {
			for(int i=0;i<3;i++) {
				try {
					System.out.println(Thread.currentThread().getName()+" processing:"+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName()+" withdraw success,balance:"+balance);
		} else {
			System.out.println(Thread.currentThread().getName()+" not enough balance,balance:"+balance);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Bankaccount account= new Bankaccount();
		account.balance=5000;

		Thread t1= new Thread(()->{
			account.withdraw(4000);
		},"thread1");

		Thread t2= new Thread(()->{
			account.withdraw(4000);
		},"thread2");

		t1.start();//1
		t2.start();//2

		t1.join();
		t2.join();
		System.out.println("final balance:"+account.balance);
	}
}