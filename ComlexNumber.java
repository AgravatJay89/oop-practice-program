/*

Define class for Complex number with real and imaginary as data members. Create its 
contructor, overload the constructors. Also define addition method to add two complex 
objects.


*/

class Complex{
	double r;
	double i;

	public Complex(){
		r=0;
		i=0;
	}

	public Complex(double r,double i){
		this.r=r;
		this.i=i;
	}

	public void printAddition(Complex co2){
			 String temp="";
		double tempR= this.r + co2.r;
		double tempI= this.i + co2.i;
		System.out.println(tempR+" + "+tempI + "i");
	}

	 public void displayNO(){
	 	System.out.println(r+" + "+i + "i");
	 }
}

public class ComlexNumber{
	public static void main(String[] args) {
		Complex co1 =new Complex(5,2);
		Complex co2 =new Complex(2,5);
		co1.printAddition(co2);
	}
}