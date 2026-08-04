import java.util.Scanner;

class  DigitDisplaySystem
{
	public static void DisplaySystem(int No)
	{
		int iDigit = 0;
		int rev = 0;
		while(No > 0)
		{
			iDigit = No % 10;
			rev = rev* 10 + iDigit;
			No  = No/10;
		}
		iDigit = 0;
		while(rev > 0)
		{
			iDigit = rev % 10;
			System.out.print(iDigit+" ");
			rev = rev /10;
		}
		System.out.println();
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		DisplaySystem(No);
		
	}

}
