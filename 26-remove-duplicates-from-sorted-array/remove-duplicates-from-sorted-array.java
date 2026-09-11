/*
    -> Author : Pratik Dhanajay Dhayagude
*/
class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i,j;
        i = 1;
        for(j=1;j<nums.length;j++)
        {
            if(nums[j] != nums[i-1])
            {
                nums[i] = nums[j];
                  i++;
            }

          
        }
       
        return i;
        
    }
}