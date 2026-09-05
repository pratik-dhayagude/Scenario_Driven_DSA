/*
	-Validating a Banking PIN
	
	-Problem Statement
		A banking application requires users to enter a secure 4-digit Personal Identification Number (PIN) before accessing their account. 
		Due to increasing fraudattempts,the system must strictly validate the entered PIN before authentication. The PIN must follow these rules
		
	-Test Cases
		It must contain exactly 4 digits 
		It must be a positive number
		Leading zeros are allowed only if they are part of a 4-digit format 
		(e.g., 0123 should be treated as invalid if input is integer type) If the PIN satisfies all conditions, the system should display
		
	-Input
		An integer pin
	-output
		1234 -> Valid PIN
		987 -> 987
		-1234 -> Invalid PIN
		
*/


import java.util.*;

class ValidatingaBankingPIN
{
	public static int cheakPIN(int PIN)
	{
		int Digit = 0;
		int iCount =0;
		if(PIN <= 0)
		{
			return 1;
		}
		while(PIN > 0)
		{	
			Digit = PIN % 10;
			iCount++;
			PIN = PIN/10;		
		}
		
		if(iCount == 4)
		{	
			return 2;
		}
		return -1;	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the PIN");
		int PIN = sobj.nextInt();
		
		int iRet = cheakPIN(PIN);
		if(iRet == 2)
		{
			System.out.println("Valid PIN");
		}
		else
		{
			System.out.println("Invalid PIN");
		}
		
		
		
	}
}
