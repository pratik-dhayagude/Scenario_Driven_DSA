import java.util.*;

class IdenticalDigitValidator
{
	public static boolean CheakSame(int No)
	{	
		int iDigit = 0;
		boolean flag = false;
		int iValue = iDigit;
		
		while(No > 0)
		{
			iDigit = No % 10;
			if(iDigit != iValue)
			{
				flag = true;
			}
			else
			{
				return false;
			}
		}
		return flag;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		boolean bRet =  CheakSame(No);
		if(bRet == true)
		{
			System.out.println("valid number");
		}
		else
		{
			System.out.println("Invalid Number");
		}
		
		
	
	}
}
