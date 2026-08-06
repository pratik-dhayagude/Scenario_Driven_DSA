import java.util.Scanner;


class NonZeroDigitLockValidator
{

	public static boolean LockValidator(int No)
	{
		int iDigit = 0;
		boolean bFlag = false;
		
		if(No < 0)
		{
			return false;
		}
		while(No > 0)
		{
			iDigit = No % 10;
			if(iDigit == 0)
			{
				return false;
			}
			bFlag = true;
			No = No /10;
		}
		return bFlag;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter they number:");
		
		int No = sobj.nextInt();
		
		boolean bRet = LockValidator(No);
		if(bRet == true)
		{
			System.out.println("Lock Open");
		}
		else
		{
			System.out.println("Lock not open");
		}
		
	}
	
	
}
