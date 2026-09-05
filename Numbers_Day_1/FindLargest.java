/*
	-A company stores the monthly sales of different branches. Find the branch with the highest
	 sales.
	-ProblemStatement
		A company stores the monthly sales of different branches. Find the branch with the highest
		sales.
	-example
		Arr = 1 2 3 4 5 6 
		
	-Output
		Largest = 6
		
	- Time Complexity
		T(n) = o(n)
	-space complexity
		S(n) = o(1)
		Process Variable = iMax ,i
		Auxillary Space = Constant
*/
	
import java.util.*;
class FindLargest
{
	public static int Largest(int Arr[])
	{
		int iMax = Arr[0];
		for(int i =0;i<Arr.length;i++)
		{
			if(Arr[i]>iMax)
			{
				iMax = Arr[i];
			}
		}
		return iMax;
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int No = sobj.nextInt();
		
		int Arr[] = new int[No];
		
		int i =0;
		System.out.println("Enter the monthely sales:");
		for(i = 0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
			
		}
		int iRet = Largest(Arr);
		System.out.println("Largest sale is:"+iRet);
		
	}
}
