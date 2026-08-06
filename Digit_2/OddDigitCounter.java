import java.util.Scanner;


class OddDigitCounter
{
	public static int DigitCounter(int No)
	{
		int iDigit = 0,iCount=0;
		if(No < 0)
		{
			No = -No;
		}
		while(No>0)
		{
			iDigit = No %10;
			if(iDigit % 2 !=0)
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
		
		int iRet = DigitCounter(No);
		System.out.println("Count is:"+iRet);
	}
}
