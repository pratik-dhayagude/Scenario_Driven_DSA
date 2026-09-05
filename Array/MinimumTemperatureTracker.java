/*
	->Minimum Temperature Tracker
	->Problem Statement:
		A temperature monitoring system records daily temperatures for N consecutive days.
		Temperatures may be positive or negative.
	-> Example:
		Input:
		N=4
		temps = [-5, 3, -10, 8]
		Output:
		Minimum Temperature: -10
	->Complexity:
		O(N)
	->Space Complexity:
		O(1)

*/



import java.util.Scanner;


class MinimumTemperatureTracker
{
	public static int  MinimumTemperatureTracker(int Temp[])
	{
		int Min = Temp[0];
		for(int i =1;i<Temp.length;i++)
		{
			if(Min>Temp[i])
			{
				Min = Temp[i];
			
			}
		
		}
		return(Min);
	
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		int Arr[]= new int[No];
		
		
		System.out.println("Enter the Temperature:");
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		
		}
		int iRet =  MinimumTemperatureTracker(Arr);
		System.out.println("Minimum Temperature Will be:"+iRet);
	
	
	}


}
