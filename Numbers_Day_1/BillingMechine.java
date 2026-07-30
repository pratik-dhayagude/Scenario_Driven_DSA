import java.util.*;

class BillingMechine
{
	public static int CheakBilling(int No)
	{	
		
		int LastDigit =0;
		if(No < 0)
		{
			LastDigit = -(No % 10);
		
			
		}
		else{
			LastDigit = No%10;
		}
		if(LastDigit == 5)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they InvoiceNumber:");
		int No = sobj.nextInt();
		
		int iRet = CheakBilling(No);
		if(iRet == 1)
		{
			System.out.println("Ends with 5");
		}
		else
		{
			System.out.println("Not Ends with 5");
			
		}
		
		
		
		
	}
}
