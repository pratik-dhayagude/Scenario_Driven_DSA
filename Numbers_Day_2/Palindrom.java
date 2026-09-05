import java.util.*;


class Palindrom
{
	public static boolean Palindrome(int No)
	{
		int iDigit = 0;
		int temp = No;
		int value =No;
		
		while(No>0)
		{
			iDigit = No % 10;
			temp = temp *10+iDigit;
			No = No/10;
			
		}
		if(Value == temp)
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
		int No = sobj.nextInt();
		
		boolean bRet = Palindrome(No);
		if(bRet == true)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("not palindrom Number");	
		}
	}
}
