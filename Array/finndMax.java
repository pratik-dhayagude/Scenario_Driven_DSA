import java.util.*;
class finndMax
{
	public static int Find_Max(int Arr[],int K)
	{
		int n = Arr.length;
		int low = 0;
		int high = K-1;
		int i =0;
		int Sum =0,MaxSum=0;
		for(i = low ;i<=high;i++)
		{
			Sum =Sum + Arr[i];
			
		}
		MaxSum = Sum;
		while(high < n-1)
		{
			
			low++;
			high++;
			
			Sum = Sum - Arr[low-1]+Arr[high];
			
			if(Sum > MaxSum)
			  {
				MaxSum = Sum;
			  }
		}
		return MaxSum;
		
		
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int No;
		
		
		System.out.println("Enter the size of sub array:");
		int k=sobj.nextInt();
		
		System.out.println("Enter the Number that you want:");
		No = sobj.nextInt();
		
		int Arr[] = new int[No];
		System.out.println("Enter the Numbers Into the Array:");
		for(int i=0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		int iRet = Find_Max(Arr, k);
		System.out.println("Maximum Number will be:"+iRet);		
;	}
	
}
