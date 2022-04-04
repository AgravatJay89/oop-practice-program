// WAP that counts the number of objects created using static.


 class Count{
	  static int count=0;

	Count(){
		count++;	
	}

	void printCount(){
	System.out.println(count);}
}


public class CountObject{
	public static void main(String[] args) {
		Count a1=new Count();
		Count a2=new Count();
		Count a3=new Count();
		Count a4=new Count();
		Count a5=new Count();

		a5.printCount();
	}

}
/*
class Count{
	static int count=0;

	Count(){
	count++;

	System.out.println(count);
	}
}

public class CountObject{
	public static void main(String[] args) {
		Count a1=new Count();
		Count a2=new Count();
		Count a3=new Count();
		Count a4=new Count();
		Count a5=new Count();

		
	}

}


*/