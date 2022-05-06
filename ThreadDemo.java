class Ru1 implements Runnable{
	public void run(){
		for (; ; ) {
			System.out.println("Good Morning");

			try{
				Thread.currentThread().sleep(1000);
			}
			catch(Exception e){

			}
		 }
			
	}
}

class Ru2 implements Runnable{
	public void run(){
		for (; ; ) {
			System.out.println("Good Afternoon");

			try{
				Thread.currentThread().sleep(3000);
			}
			catch(Exception e){

			}
		 }
			
	}
}

class ThreadDemo{
	public static void main(String[] args) {
		Ru1 r1=new Ru1();
		Thread t1=new Thread(r1);
		t1.start();

		Ru2 r2=new Ru2();
		Thread t2=new Thread(r2);
		t2.start();
	}
}