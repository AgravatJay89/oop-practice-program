interface A
{int i=10;}
class B implements A
{int j=20;}
interface C implements A
{int k=30;}
class D extends B implements C
{
	void op()
	{
		System.out.println(i+j+k);
	}
}
class interfaceDemo{
	public static void main(String[] args) {
		D obj=new D();
		obj.op();
	}
}