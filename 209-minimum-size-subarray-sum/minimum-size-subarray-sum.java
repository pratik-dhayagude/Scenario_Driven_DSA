class Solution
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int low =0;
        int high=0;
        int Min=Integer.MAX_VALUE;;
        int Sum = 0;
        int n = nums.length;


        for(high =0;high<n;high++)
        {
            Sum = Sum+nums[high];
            while(Sum>=target)
            {
                Min = Math.min(Min, high - low + 1);
                Sum = Sum - nums[low];
                low++;
            }

        }
        if(Min == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return Min;
        }
        
    }
}