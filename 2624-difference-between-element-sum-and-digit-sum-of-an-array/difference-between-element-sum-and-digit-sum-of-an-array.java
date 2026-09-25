class Solution
{
    public int differenceOfSum(int[] nums)
    {
         int iSum =0;
         int SumArr =0;
         for(int i=0;i<nums.length;i++)
        {
            iSum+= nums[i];

             
            while(nums[i]>0)
            {
                int iDigit = nums[i] % 10;
                SumArr += iDigit;
                nums[i] /= 10;

            }

        }

        int Result = iSum - SumArr;
        return Result;
        
    }
}