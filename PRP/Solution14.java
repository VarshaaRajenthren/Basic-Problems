public class Solution14 
{
	public static void main(String[] args) 
	{
		int n=1234,sum=0;
		for(;n!=0;)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
