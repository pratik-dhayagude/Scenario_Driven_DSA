/*
	-> Salary Eligibility Checker
	-> Problem Statement:
		A company wants to identify employees earning more than ₹25,000 per month to determine bonus eligibility.
	-> Example:
		Input:
		N=5
		salaries = [20000, 30000, 26000, 15000, 40000]
		Output:
		Eligible Employees Count: 3
		
	-> Time Complexity:
		O(n)
	-> SpaceComplexity:
		O(1)
	
*/


import java.util.*;

class SalaryEligibilityChecker
{
	public static int SalaryEligibilityChecker(int Arr[])
	{
		int Max_Salary =0,i=0;
		
		for(i =0;i<Arr.length;i++)
		{
			if(Arr[i]>25000)
			{
				Max_Salary++;
			
			}
		
		}
		return Max_Salary;
		
	
	}
	public static void main(String A[])
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		
		int Arr[] = new int[No];
		
		System.out.println("Enter the salary:");
		for(int i=0;i<No;i++)
		{	
			Arr[i] = sobj.nextInt();
		
		
		}
		int iRet = SalaryEligibilityChecker(Arr);
		System.out.println("Eligible Employees Count:"+iRet);
	
	}

}
