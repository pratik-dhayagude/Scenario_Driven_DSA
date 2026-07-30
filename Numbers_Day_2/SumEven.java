import java.util.*;


class SumEven
{	
	public static int SumEven(int No)
	{
		int iDigit = 0;
		int iSum = 0;
		while(No > 0)
		{
			iDigit = No %10;
			if(iDigit % 2 ==0)
			{
				iSum = iSum + iDigit;
			}
			No = No/10;
		}
		return iSum;
	}	
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet =  SumEven(No);
		System.out.println("Addition is:"+iRet);
		
		
	}
}
