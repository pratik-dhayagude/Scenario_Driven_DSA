import java.util.*;


class SmallestDigitFinder
{	
	public static int SmallDigit(int A)
	{
		int iDigit=0;
		if(A < 0)
		{
			A = -A;
		}
		iDigit = A % 10;
		int Min = iDigit;
		
		while(A > 0)
		{
			iDigit = A % 10;
			if(iDigit < Min)
			{
				Min = iDigit;
				
			}
			A = A / 10;
		}
		return Min;
	}
	public static void main(String A[])
	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		
		int No = sobj.nextInt();
		
		int iRet = SmallDigit(No);
		System.out.println(iRet);
	}
}
