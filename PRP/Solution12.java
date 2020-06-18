public class Solution12 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
		   if(num%i==0)
		   {
		      flag=true;
		      break;
		   }
		}
		if(!flag)
		{
			System.out.println("Prime Number");
		}
		 else
		   {
			   System.out.println("Not a Prime Number");
		   }
	}

}
