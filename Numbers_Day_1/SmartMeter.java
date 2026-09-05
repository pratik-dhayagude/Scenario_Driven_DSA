import java.util.*;

class SmartMeter
{
	public static int SmartMeter(int No)
	{
		 int iDigit = 0;
		 int iSum =0;
		 while(No>0)
		 {
		 	iDigit = No%10;
		 	iSum = iSum + iDigit;
		 	No = No/10;
		 }
		 return iSum;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		int iRet =  SmartMeter(No);
		System.out.println("The Addition:"+iRet);
		
		
		
		
	}
}
