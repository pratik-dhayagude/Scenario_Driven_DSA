import java.util.*;

class DigitalLock

{
	public static boolean CheakEven(int No)
	{
		if(No % 2 ==0)
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
		
		System.out.println("Enter Number:");
		int No = sobj.nextInt();
		
		boolean bRet = CheakEven(No);
		if(bRet == true)
		{
			System.out.println("Access Granted");
		}
		else
		{
			System.out.println("Access Denied");
		}
		
		
	}
}
