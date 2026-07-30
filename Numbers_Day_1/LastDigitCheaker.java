import java.util.*;

class LastDigitCheaker
{
	public static boolean LastDigitCheak(int No)
	{
		int iDigit = 0;
		
		iDigit = No % 10;
		if(iDigit % 2 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		
		boolean bRet = LastDigitCheak(No);
		if(bRet == true)
		{
			System.out.println("Last digit is even");
		}
		else
		{
			System.out.println("Last digit is odd");
			
		}
		
		
	}
}
