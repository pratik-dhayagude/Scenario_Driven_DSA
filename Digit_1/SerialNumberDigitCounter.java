import java.util.Scanner;

class SerialNumberDigitCounter
{
	public static int Counter(int No)
	{
		int iDigit =0;
		int iCount = 0;
		if(No < 0)
		{
			No = -No;
		}
		if(No == 0)
		{
			iCount = 1;	
		}
		while(No > 0)
		{
			iDigit = No %10;
			iCount++;
			No = No/10;
		}
		return iCount;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		int iRet =  Counter(No);
		System.out.println(iRet);
		
	}
}
