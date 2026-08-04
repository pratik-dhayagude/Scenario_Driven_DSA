import java.util.Scanner;

class LastDigitOddChecker
{
	public static boolean OddChecker(int No)
	{
		int iDigit = 0;
		boolean bflag = false;
		if(No < 0)
		{
			No = -No;
		}
		
		iDigit = No % 10;
		
		if(iDigit % 2 != 0)
		{
			bflag = true;
		}
		return bflag;
	}
	public static void main(String A[])
	{
	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter they number:");
	int No = sobj.nextInt();
	boolean bRet = OddChecker(No);
	if(bRet == true)
	{
		System.out.println("Odd Ending");
		
	}
	else
	{
		System.out.println("Even Ending");
	}
	}
	
}
