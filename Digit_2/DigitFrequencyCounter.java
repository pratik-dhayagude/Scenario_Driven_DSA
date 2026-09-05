import java.util.Scanner;


class DigitFrequencyCounter
{

	public static int Counter(int No1,int No2)
	{
		int iDigit =0,iCount =0;
		if(No1 < 0)
		{
			No1 = -No1;
		}
		while(No1>0)
		{
			iDigit = No1 % 10;
			if(iDigit == No2)
			{
				iCount++;	
			}
			No1  = No1/10;
		}
		return iCount;
		
	}
	
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter they number:");
		
		int No1 = sobj.nextInt();
		System.out.println("Enter they Finding number:");
		
		int No2 = sobj.nextInt();
		
		int iRet = Counter(No1,No2);
		System.out.println("Frequency will be:"+iRet);
		
	}
	
}
