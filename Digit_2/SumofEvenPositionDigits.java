import java.util.Scanner;

class  SumofEvenPositionDigits
{
	public static int PositionDigits(int No)
	{
		int iDigit = 0,iSum = 0,iCount =0;
		
		while(No > 0)
		{
			iDigit = No % 10;
			
			iCount++;
			if(iCount % 2 == 0)
			{
				iSum += iDigit;
			}
			No = No /10;
		}
		return iSum;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet =  PositionDigits(No);
		
		System.out.println(iRet);
	}
}
