import java.util.*;

class WarehouseBatchPriorityAssignment
{
	public static boolean CheakPriority(int No)
	{
		if(No % 10 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter they number:");
		int No = sobj.nextInt();
		
		boolean bRet =  CheakPriority(No);
		if(bRet == true)
		{
			System.out.println("Priority Batch");
		}
		else
		{
			System.out.println("Normal Batch");
		}
		
	}
}
