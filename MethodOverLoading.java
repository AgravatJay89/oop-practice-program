public class MethodOverLoading{
	public static void main(String[] args) {
		int ans1=sum(5,2);
		int ans2=sum(5,2,6);
		double ans3=sum(5.8,6.4);

		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);

	}

	public static int sum(int x,int y){
		return (x+y);
		
	}

	public static int sum(int x,int y,int z){
		return(x+y+z);
		
	} 

	public static double sum(double x,double y){
		return(x+y);
	}
}