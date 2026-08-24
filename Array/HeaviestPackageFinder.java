/*
	->Heaviest Package Finder
	->Problem Statement:
		A warehouse logistics system records the weights of N packages to identify the heaviest shipment for loading optimization.
		●Integer N
		●Array weights of size N
		Determine the maximum weight among the packages.
	->Input:
		N=5
		weights = [12, 45, 30, 22, 60]
		
	->OutPut:
		Maximum Weight: 60
	->Time Complexity:
		O(N)
	->Space Complexity:
		O(1)


*/

import java.util.*;


class HeaviestPackageFinder
{
	public static int HeaviestPackageFinder(int Weight[])
	{
		int Max_weight=0;
		
		for(int i =0;i<Weight.length;i++)
		{
			if(Max_weight<Weight[i])
			{
				Max_weight = Weight[i];
			
			
			}
		
		}
		return Max_weight;
	
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		int Arr[]= new int[No];
		
		
		System.out.println("Enter the weight:");
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		
		}
		int iRet = HeaviestPackageFinder(Arr);
		System.out.println("Maximum Weight:"+iRet);
	
	}


}
