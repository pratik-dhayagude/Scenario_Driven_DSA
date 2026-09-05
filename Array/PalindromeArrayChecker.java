/*
	-> Palindrome Array Checker
	-> Problem Statement
		An array is called a palindrome if it reads the same forward and backward.
		Determine whether the given array is a palindrome.
		
	-> Example:
		Input: [1, 2, 3, 2, 1]
		Output: Palindrome
		
	-> Time: O(N)
	-> Space:O(1)
*/
import java.util.Scanner;

class PalindromeArrayChecker
{
	public static boolean  PalindromeArrayChecker(int Arr[])
	{
		int Start =0,End =Arr.length-1;
		boolean bFlag = false;
		
		while(Start < End)
		{
			if(Arr[Start] != Arr[End])
			{
				return false;
			
			}
			Start++;
			End--;
			bFlag = true;
		
		}
		
	
		return bFlag;
	}
	public static void main(String A[])
	{
	
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int No = sobj.nextInt();
		
		
		int Arr[]  = new int[No];
		System.out.println("Enter the Numbers:");
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
			
		}
		boolean bRet = PalindromeArrayChecker(Arr);
		if(bRet == true)
		{
			System.out.println("Palindrom");
		
		}
		else
		{
			System.out.println("Not Palindrome");
		
		}
		
		
	}
}
