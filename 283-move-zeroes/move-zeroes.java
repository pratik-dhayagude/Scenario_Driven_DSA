class Solution {
    public void moveZeroes(int[] nums)
    {
        int i,j,temp=0;
        i=0;
        for(j = 0;j<nums.length;j++)
        {
            if(nums[j] != 0)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                i++;
            }
        }
        
    }
}