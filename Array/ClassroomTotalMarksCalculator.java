/*

	-> Classroom Total Marks Calculator
	-> Problem Statement:
		A classroom management system stores examination marks of N students to generate performance statistics for internal reporting.
		You are given:
		●An integer N representing the number of students.
		●An array marks of size N, where each element represents the marks scored by a student.
		Your task is to calculate the total marks obtained by the entire class
		
	->Input:
		Marks
	->OutPut:
		Total Marks: <sum>
	->Time Complexity:
		o(n)
	->Space Complexity:
		o(1)

*/



import java.util.Scanner;


class ClassroomTotalMarksCalculator
{
	public static int MarksCalculator(int Arr[])
	{
	
		int iSum = 0;
		
		for(int i = 0;i<Arr.length;i++)
		{
			iSum += Arr[i];
		}
		return iSum;
		
		
	
	
	}
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int i =0;
		System.out.println("Enter the number:");
		int No = sobj.nextInt();
		
		int Arr[] = new int[No];
		
		System.out.println("Enter the Marks:");
		for(i = 0;i<No;i++)
		{
			Arr[i] = sobj.nextInt();
			
		}
		
		int iRet = MarksCalculator(Arr);
		System.out.println("Summation of Marks will be:"+iRet);
	
	
	}

}
