import java.util.*;

class FindLargestDigit
{
	public static int Largest(int No)
	{
		int iDigit = 0;
		int Max = 0;
		while(No>0)
		{
			iDigit = No %10;
			if(iDigit > Max)
			{
				Max = iDigit;
			}
			No = No/10;
		}
		return Max;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet =  Largest(No);
		System.out.println("Largest number is :"+iRet);
		
		
	}
}
