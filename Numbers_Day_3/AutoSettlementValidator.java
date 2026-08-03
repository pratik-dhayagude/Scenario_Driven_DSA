import java.util.*;

class AutoSettlementValidator
{
	public static boolean Validator(int No)
	{
		int iDigit = 0;
		boolean bFlag = false;
		if(No < 0)
		{
			return false;
		}
		iDigit = No % 10;
		if(iDigit == 0)
		{
			bFlag = true;
		}
		return bFlag;
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		boolean bRet = Validator(No);
		if(bRet == true)
		{
			System.out.println("Auto Settlement Allowed");
		}
		else
		{
			System.out.println("Not Allowed");
		}
	}
	
}
