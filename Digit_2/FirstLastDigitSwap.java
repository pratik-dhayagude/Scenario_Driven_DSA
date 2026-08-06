import java.util.Scanner;

class FirstLastDigitSwap
{
	public static int DigitSwap(int No)
	{
		int iDigit = 0,rev = 0;
		
		
		if(No < 0)
		{
			No = -No;
		}
		
		
		while(No > 0)
		{
			iDigit = No % 10;
			rev = rev * 10 + iDigit;
			No = No /10;
		}
		return rev;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet = DigitSwap(No);
		System.out.println(iRet);
	}
} 
