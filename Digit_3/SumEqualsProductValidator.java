/*
	-> Sum Equals Product Validator
	-> Problem Statement :
		Sum of digits = Product of digits
		
	-> OutPut:
		f condition satisfied → Valid Number
		Else → Invalid Number

	
*/

import java.util.Scanner;

class SumEqualsProductValidator
{
	public static boolean SumProductValidator(int No)
	{
		int iDigit = 0,iSum = 0 ,iProd = 1;
		
		while(No > 0)
		{
			iDigit = No % 10;
			iSum = iSum + iDigit;
			iProd = iProd * iDigit;
			No = No/10;
		
		}
		if(iSum == iProd)
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
		
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
	
		boolean bRet = SumProductValidator(iValue);
		if(bRet == true)
		{
			System.out.println("Valid Number");
		}
		else
		{
			System.out.println("Invalid Number");		
		}
	}
	
}
