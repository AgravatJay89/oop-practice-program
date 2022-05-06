class Ru1 implements Runnable{
	public void run(){
		for (int i=1;i<=20 ;i++ ) {

		if (i%2!=0) {
				System.out.println("Odd number is---"+i);
			}

			try{
				Thread.currentThread().sleep(100);
			}
			catch(Exception e){

			}
		 }
			
	}
}

class Ru2 implements Runnable{
	public void run(){
		for (int i=1;i<=20 ;i++ ) {
			if (i%2==0) {
				System.out.println("Even number is---"+i);
			}

			try{
				Thread.currentThread().sleep(100);
			}
			catch(Exception e){

			}
		 }System.out.println("THANK YOU!...");
			
	}
}

class OddEvenThread{
	public static void main(String[] args) {
		

		Ru1 r1=new Ru1();
		Thread t1=new Thread(r1);
		t1.start();


		Ru2 r2=new Ru2();
		Thread t2=new Thread(r2);
		t2.start();




	}
}

