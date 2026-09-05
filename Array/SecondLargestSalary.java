/*
	-> Second Largest Salary
	-> Problem Statement:
		A company wants to identify the second highest distinct salary among employees.
		You are given an array of N salaries.
	-> Example:
		Input:
		[50000, 70000, 60000, 70000]
		Output:
		Second Maximum Value: 60000
		
	-> Complexity :
	
		Time: O(N)
		Space: O(1)

*/




import java.util.*;
class SecondLargestSalary
{
	public static int SecondLargestSalary(int Arr[])
	{
	
		int i = 0,iMax=Arr[0],iMin=Arr[0],Second_Largest =0;
		
		
		for(i = 1;i<Arr.length;i++)
		{
		
			if(Arr[i]>iMax)
			{
				iMax = Arr[i];
			
			}
			if(Arr[i]<iMin)
			{
				iMin = Arr[i];
			
			}
			if(Arr[i]>iMin && Arr[i]<iMax)
			{
				Second_Largest =Arr[i];	
			
			}
		
		}
		return Second_Largest;
		
	
	}

	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		int i =0;
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		
		int Arr[] = new int[No];
		System.out.println("Enter the Salary:");
		
		for(i = 0;i<No;i++)
		{
		
			Arr[i] = sobj.nextInt();		
		}
		
		int iRet = SecondLargestSalary(Arr);
		System.out.println("Second Largest Element will be:"+iRet);
		
		
	
	}
	

}
