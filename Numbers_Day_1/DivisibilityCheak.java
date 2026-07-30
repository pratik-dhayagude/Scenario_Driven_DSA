import java.util.*;

class DivisibilityCheak
{
	public static boolean CheakDiv(int No)
	{
		if(No % 5 ==0 && No % 3==0)
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
		int Num = sobj.nextInt();
		
		boolean bRet = CheakDiv(Num);
		if(bRet == true)
		{
			System.out.println("Valid number");
		}
		else
		{	
			System.out.println("Invalid number");
			
		}
		
		
	
	}
}
