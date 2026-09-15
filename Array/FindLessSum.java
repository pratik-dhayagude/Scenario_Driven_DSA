/*
    -> Enter the Target:
            15
            Enter the Number:
            9
            Enter the Numbers in the array:
            2
            3
            1
            4
            5
            6
            7
            8
            9
            Array After sorting: [1, 2, 3, 4, 5, 6, 7, 8, 9]
            Total:13

*/

import java.util.*;

class FindLessSum
{
    public static int FindSmaller(int nums[],int target)
    {
        int i =0,left = 0,right=0,sum=0,return_Sum=0;
        Arrays.sort(nums);

        System.out.println("Array After sorting: " + Arrays.toString(nums));


        for(i=0;i<nums.length-2;i++)
        {
            left = i+1;
            right = nums.length-1;

            sum = nums[i]+nums[left]+nums[right];

            if(sum >= target)
            {
                right--;
            }
            else
            {
                return_Sum = return_Sum+(right-left);
                left++;

            }
            
        }
        return return_Sum;

    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        
      
        int Target = 0;
        System.out.println("Enter the Target:");
        Target = sobj.nextInt();

        System.out.println("Enter the Number:");
        int No = sobj.nextInt();

        System.out.println("Enter the Numbers in the array:");
        int Arr[] = new int[No];
        for(int i =0;i<No;i++)
        {
            Arr[i] = sobj.nextInt();

        }
        int iRet = FindSmaller(Arr,Target);

        System.out.println("Total:"+iRet);
    }
}