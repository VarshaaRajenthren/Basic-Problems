public class Solution17 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int a=num;
		int rem=0,ans=0;
		while(num>0)
		{
			rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		if(a==ans)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}

