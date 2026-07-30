import java.util.*;
class ReverseTransactionNumber
{
	public static int Reverse(int No)
	{
		int iDigit = 0;
		static int temp =0;
		int sign = 0;
		if(No < 0)
		{
			sign = -1;
			iNo = -iNo;
		}
		
		
		while(No > 0)
		{
			iDigit = No % 10;
			temp = temp * 10;
			temp = temp +iDigit;	
			No = No/10;
			
		}
		return temp;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		
		int No = sobj.nextInt();
		
		int iRet = Reverse(No);
		
		System.out.println("Reverse Number is:"+iRet);
	}
}
