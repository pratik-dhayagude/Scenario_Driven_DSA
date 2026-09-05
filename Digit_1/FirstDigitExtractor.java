import java.util.Scanner;

class  FirstDigitExtractor
{	
	public static int Extractor(int No)
	{
		int iDigit = 0;
		int iCount =0;
		
		if(No < 0)
		{
			No = -No;
			
		}
		if(No == 0)
		{
			return 0;
		}
		
		
		while(No > 10)
		{
			No = No /10;
		}
		return No;
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they numeber:");
		int No = sobj.nextInt();
		int iRet = Extractor(No);
		System.out.println(iRet);
		
		
	}
	
}
