import java.util.*;

class CyberSecurityStrictlyIncreasingDigits
{
	public static boolean CheakIncreasingDecreasing(int No)
	{
		int Current = 0;
		int iCount = 0;
		int previous = 0;
		boolean Flag = false;
		if(No < 0)
		{
			
			return false;
		}
		previous = No %10;
		No = No/10;
		while(No > 0)
		{
			Current = No %10;
			
			if(Current < previous)
			{
				Flag = true;
			}
			
			previous = Current;
			No = No/10;
			
		}
		return Flag;		
		
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		boolean bRet = CheakIncreasingDecreasing(No);
		if(bRet == true)
		{
			System.out.println("Incresing");
		}
		else
		{
			System.out.println("Not Increasing");
			
		}
		
	}
}
