package Chapter13_쓰레드;

public class Ch13_11_synchronized예제 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx12();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
		} //인출
	}
}

class RunnableEx12 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance()>0) {
			// 100, 200, 300중 한 값을 임으로 선택해서 출금
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	}
}