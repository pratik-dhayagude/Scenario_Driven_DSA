/*
	 -Transaction ID Digit Counter
	 -Problem Statement
	 -A financial auditing system needs to verify transaction IDs by counting the number of digits present. The system must
	 	Accept only numbers ≥ 0 
	 	Count total digits
	 	Print result in format
	 -Input
	 	Integer transactionID
	 -output
	 	Total Digits count OR error message
	 	45892 -> Total Digits: 5
	 	0 ->	 Total Digits: 1
*/

import java.util.*;


class TransactionIDDigitalCounter
{	
	public static int Digit_Count(int ID)
	{
		int Digit = 0;
		int iCount = 0;
		if(ID < 0)
		{
			System.out.println("Invalid transaction id");
			
		}
		else if(ID == 0)
		{
			iCount = 1;
		}
		while(ID > 0)
		{
			Digit = ID % 10;
			iCount++;
			ID = ID/10;
			
		}
		return iCount;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they Transaction ID:");
		int TransactionID = sobj.nextInt();
		
		int iRet = Digit_Count(TransactionID);
		System.out.println("Total Digit count:"+iRet);
		
		
	}
}

