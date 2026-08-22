/*
	-> Remove All Zeros
	->ProblemStatement:
		Remove every occurrence of digit 0 from a number
		
	->Preserve sign.
	  If all digits are zero → return 0
	  
	-> OutPut:
		Updated Number

*/



import java.util.*;


class RemoveAllZeros
{
	public static int RemoveZero(int No)
	{
		int iDigit = 0,iResult=0,iRet =0;
		
		
		while(No != 0)
		{
			iDigit = No % 10;
			if(iDigit != 0)
			{
				iResult = iResult*10+iDigit;
			
			}
			No = No/10;
		
		
		}
		while(iResult!=0)
		{
		
			iDigit = iResult %10;
			iRet = iRet * 10 + iDigit ;
			iResult = iResult /10;
			
		
		}
		return iRet;
		
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		
		System.out.println("Eter the number");
		int No = sobj.nextInt();
		
		int iRet = RemoveZero(No);
		System.out.println("Original Number will be:"+iRet);
		
			
	
	
	}


}
