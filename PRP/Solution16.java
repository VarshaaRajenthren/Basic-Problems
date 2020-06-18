public class Solution16 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int rev=0;
		while(n!=0)
		{
			int x=n%10;
			rev=rev*10+x;
			n/=10;
		}
		System.out.println(rev);

	}

}
