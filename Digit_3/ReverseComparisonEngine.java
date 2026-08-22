/*
	-> Reverse Comparison Engine
	-> Problem Statement:
		Reverse the digits of a number.
		If reversed number > original number
		
	-> OutPut:
		 Increasing After Reverse
		Else →
		Output: Not Increasing
	
*/



import java.util.Scanner;

class ReverseComparisonEngine
{

	public static boolean ComparisonEngine(int No)
	{
		int iDigit = 0,temp =0,iResult = 0;
		temp = No;
		
		if(No < 0)
		{
			No = -No;
		}
		while(No >0)
		{
			iDigit = No %10;
			iResult = iResult * 10 + iDigit;
			No = No/10;
		}
		
		if(iResult > temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int iNo = sobj.nextInt();
		boolean bRet = ComparisonEngine(iNo);
		if(bRet == true)
		{
		
			System.out.println("Increasing After Reverse");
			
		}
		else
		{
			
			System.out.println("Not Increasing After Reverse");
		}
	}

}
