public class Exception2{
	public static void main(String[] args) {
		int sum=0;

		for (int i=0;i<args.length ;i++ ) {
			
			try{
			int a=Integer.parseInt(args[i]);

			if (a<0) 
			{
				throw new Exception("please enter valid input");		
			}

			else if (a%10==0) 
			{
				throw new Exception("please enter valid input");
			}
			else if (1000<a && a >2000) 
			{
				throw new Exception("please enter valid input");
			}
			else if (a>7000) 
			{
				throw new Exception("please enter valid input");
			}

			else
			{
				
				sum=sum+a;

				
			}
		 }
		 catch(Exception e)
			{
				System.out.println("INVALID INPUT...");
			}
		}

		System.out.println("sum="+sum);
		

	}
}