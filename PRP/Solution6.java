public class Solution6 
{
	public static void main(String[] args) 
	{
		String s=args[0];
		int age=Integer.parseInt(args[1]);
		if(s.equals("female") && age>1 && age<=58)
		{
			System.out.println("8.2%");
		}
		else if(s.equals("female") && age>59 && age<=100)
		{
			System.out.println("9.2%");
		}
		else if(s.equals("male") && age>1 && age<=58)
		{
			System.out.println("8.4%");
		}
		else if(s.equals("male") && age>59 && age<=100)
		{
			System.out.println("10.5%");
		}
		else
		{
			System.out.println("Invalid person");
		}
	}

}
