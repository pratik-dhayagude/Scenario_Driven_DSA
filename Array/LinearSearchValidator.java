/*
	-> Linear Search Validator
	-> Problem Statement:
		A monitoring system needs to verify whether a specific value exists in a dataset.
	-> Example
		Input:
		N=5
		arr = [10, 20, 30, 40,50]
		target = 30
		Output:
		Found
		
	-> Time Complexity:
		O(N)
	-> Space Complexity:
		O(1)


*/



import java.util.*;

class LinearSearchValidator
{
	public static boolean LinearSearchValidator(int Arr[],int Target)
	{
		boolean bFlag = false;
		int i=0;
		
		for(i =0;i<Arr.length;i++)
		{
			if(Arr[i] == Target)
			{
				bFlag = true;
				break;
			
			}
		
		}
		return bFlag;
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int i =0;
		System.out.println("Enter the Number:");
		int No = sobj.nextInt();
		
		System.out.println("Enter the Target Nmber:");
		int Target = sobj.nextInt();
		
		int Arr[] = new int[No];
		System.out.println("Enter the Number:");
		for(i=0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		
		}
		
		boolean bRet = LinearSearchValidator(Arr,Target);
		if(bRet == true)
		{
			System.out.println("Found");
		
		}
		else
		{
			System.out.println("Not Found");
			
		}
		
		
		
	
	}
}
