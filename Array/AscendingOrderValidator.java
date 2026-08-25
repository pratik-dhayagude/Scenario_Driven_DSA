/*
	-> Ascending Order Validator
	-> Problem Statement:
		A sorting verification system checks whether a dataset is arranged in strictly ascending order.
		An array is considered sorted if:	
	-> Example
		Input:
		N=5
		arr = [2, 5, 8, 12, 20]
		Output:
		Sorted
		
	-> Complexity:
		O(N)
	-> Space Complexity:
		O(1)
*/



import java.util.*;

class AscendingOrderValidator
{
	public static boolean AscendingOrderValidator(int Arr[])
	{
		int i =Arr[0];
		boolean bFlag = false;
		
		for(i=1;i<Arr.length;i++)
		{
			if(Arr[i]>Arr[i-1])
			{
				bFlag = true;
			}
		
		}
		return bFlag;
	
	}
	public static void main(String A[])
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		
		int Arr[] = new int[No];
		
		System.out.println("Enter the Numbers:");
		for(int i=0;i<No;i++)
		{	
			Arr[i] = sobj.nextInt();
		
		
		}
		
		boolean bRet = AscendingOrderValidator(Arr);
		if(bRet == true)
		{
			System.out.println("Sorted");
		
		
		}
		else
		{
			System.out.println("Not Sorted");
		
		}
	
	}

}
