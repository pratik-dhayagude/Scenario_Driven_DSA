/*

	-> Costly Item Counter
	-> Problem Statement:
		An e-commerce billing system processes N purchased items and needs to count how many items cost more than ₹100	0.
		Return the count.
	-> Example
		Input:
		N=4
		prices = [500, 1500, 2000, 750]
		Output:
		Count of Costly Items: 2
	-> Time Complexity:
		O(n)
	->Space Complexity:
		O(1)


*/



import java.util.*;

class CostlyItemCounter
{
	public static int CostlyItemCounter(int Cost[])
	{
		int Max_cost = Cost[0];
		
		for(int i =1;i<Cost.length;i++)
		{
			if(Max_cost<Cost[i])
			{
				Max_cost = Cost[i];
			
			}
		
		
		}
		return Max_cost;
		
		
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		int Arr[]= new int[No];
		
		
		System.out.println("Enter the Cost:");
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		
		}
		
		int iRet = CostlyItemCounter(Arr);
		System.out.println("MAximum cost will be:"+iRet);
	
	}


}
