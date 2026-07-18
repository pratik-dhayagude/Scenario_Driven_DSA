import java.util.*;

class program2
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		while(No != 0){
			System.out.println(No);
			No = No-1;
		}		
	}
}
