


import java.util.*;


class AverageScoreCalculator
{
	public static int  AverageScoreCalculator(int Score[])
	{
		int Avg = 0,iMax = Score[0],iMin=Score[0],i=0;
		
		for(i = 1;i<Score.length;i++)
		{
			if(iMax<Score[i])
			{
				iMax = Score[i];
			
			}
		
		
		}
		for(i = 1;i<Score.length;i++)
		{
			if(Score[i]<iMin)
			{
				iMin = Score[i];
			
			}
		
		}
		
		for(i = 0;i<Score.length;i++)
		{
			if(Score[i]>iMin && Score[i] <iMax)
			{
				Avg = Score[i];
			
			}
		
		}
		return Avg;
	
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int No = sobj.nextInt();
		
		
		int Arr[] = new int[No];
		
		
		System.out.println("Enter your score:");
		for(int i =0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
			
		
		
		}
		int iRet = AverageScoreCalculator(Arr);
		System.out.println("Avg Score will be:"+iRet);
	
	}

}
