import java.util.*;

class VotingMachineIDValidation
{
	public static boolean CheakerVOTE(int No)
	{
		int iDigit = 0;
		int iCount = 0;
		while(No > 0)
		{
			iDigit = No %10;
			iCount++;
			No  = No/10;
				
		}
		if(iCount > 5)
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
		
		boolean bRet = CheakerVOTE(iNo);
		if(bRet == true)
		{
			System.out.println("Accepted");
		}
		else
		{
			System.out.println("Rejected");
		}
		
		
		
	}
}
