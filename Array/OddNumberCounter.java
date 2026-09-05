/*
	-> Odd Number Counter
	-> Problem Statement:
		Given an array of N integers, determine how many elements are odd numbers.
	-> Example:
		Input:
		N=5
		arr = [1, 2, 3, 4, 6]
		Output:
		Count of Even Numbers: 2
		
	-> Time Complexity:
		O(n)
	-> Space Complexity:
		O(1)


*/

import java.util.*;

class OddNumberCounter
{
	public static int EvenNumberCounter(int Arr[])
	{
		int iCount = 0;
		
		for(int i =0;i<Arr.length;i++)
		{
			if(Arr[i]%2!=0)
			{
				iCount++;
			
			}
		
		}
		return iCount;
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		if(No<=0)
		{
			System.out.println("Invalid Input");
		
		}
		
		int Arr[] = new int[No];
		
		System.out.println("Enter the Numbers:");
		
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		
		}
		
		int iRet = EvenNumberCounter(Arr);
		System.out.println("The odd number Are:"+iRet);
	
	
	}



}
