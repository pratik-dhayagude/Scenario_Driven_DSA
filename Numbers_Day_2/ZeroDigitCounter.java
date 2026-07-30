import java.util.*;

class ZeroDigitCounter
{
	public static int CountZero(int No)
	{
		int iDigit = 0;
		int iCount = 0;
		
		while(No > 0)
		{
			iDigit = No %10;
			if(iDigit == 0)
			{
				iCount++;
				
			}
			No = No/10;
		}
		return iCount;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int No = sobj.nextInt();
		
		int iRet =  CountZero(No);
		System.out.println("Count will be:"+iRet);
		
	}
}
