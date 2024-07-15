package InterviewPrograms;

public class FibonacciSeries 
{
	
	public static void fibonacci(int n)
	{
		int a=0 ,b=1, sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(a+ " ");
			sum=a+b;
			b=a;
			a=sum;
		}
	}
		public static void main (String args[])
		{
			fibonacci( 15); //calling fibonacci method as we defined
		}
	}


