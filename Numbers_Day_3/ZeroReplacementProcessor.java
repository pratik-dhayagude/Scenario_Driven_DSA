import java.util.*;

class ZeroReplacementProcessor
{
    public static int ReplaceZero(int No)
    {
    	int iDigit = 0;
    	int temp =0;
    	int Multiplyer =1;
    	
    	while(No > 0)
    	{
    		iDigit = No %10;
    		if(iDigit == 0)
    		{
    			iDigit = 1;
    		}
    		temp = temp +(iDigit * Multiplyer);
    		Multiplyer *=10;
    		No = No/10;
    		
    	}
    	
    	return temp;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int iValue = sobj.nextInt();
        
        int iRet = ReplaceZero(iValue);
        System.out.println(iRet);
        

        
    }
}
