import java.util.Scanner;

class  InvoiceDigitSumCalculator
{
	public static int SumCalculator(int No)
	{
		int iDigit = 0,iSum =0;
		if(No < 0)
		{
			No = -No;
		}
		if(No ==0)
		{
			return 0;
		}
		while(No > 0)
		{
			iDigit = No %10;
			iSum += iDigit;
			No = No /10;
			
		}
		return iSum;
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		int iRet = SumCalculator(No);
		System.out.println(iRet);
	}
}
