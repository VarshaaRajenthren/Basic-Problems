public class Solution1 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		if(n>0 && n%10==n && m%10==n)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
