import java.util.*;


class PerfectNumberChecker
{
	public static boolean PerfectNumber(int No)
	{	
		int i = 0;
		int iSum = 0;
		
		for(i = 1;i<=No/2;i++)
		{
			if(No % i == 0)
			{
				iSum += i;
			}
		}
		return (iSum == No);
		
		
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number");
		int No = sobj.nextInt();
		
		boolean bRet = PerfectNumber(No);
		if(bRet==true)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("not perfect Number");
			
		}
		
		
		
		
	}
}
