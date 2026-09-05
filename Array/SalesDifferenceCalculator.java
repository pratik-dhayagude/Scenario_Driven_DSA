/*
	-> Sales Difference Calculator
	-> Problem Statement
		A retail analytics engine computes the difference between the maximum and minimum sale value recorded
	-> Example:
		Input: [100, 250, 75, 300]
		Output: Difference: 225
	-> Time: O(N)
	-> Space: O(1)


*/


import java.util.*;

class SalesDifferenceCalculator
{
	public static int SalesDifferenceCalculator(int Arr[])
	{
		int Max =Arr[0],Min=Arr[0];
		for(int i =1;i<Arr.length;i++)
		{
			if(Arr[i]>Max)
			{
				Max = Arr[i];
			}
			if(Arr[i]<Min)
			{
				Min = Arr[i];
			
			}
		}
		return Max -Min;
	}
	public static void main(String A[])
	{
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int No =sobj.nextInt();
		
		
		
		int Arr[]= new int[No];
		
		System.out.println("Enter the Number:");
		for(int i =0;i<No;i++)
		{
		
			Arr[i] = sobj.nextInt();
		}
		int iRet = SalesDifferenceCalculator(Arr);
		System.out.println("The Difference:"+iRet);
	
	}


}
