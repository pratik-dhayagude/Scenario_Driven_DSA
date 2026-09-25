class Solution {
    public int addDigits(int num)
    {
        
    
        while(num>=10)
        {
                int iSum =0;
            while(num>0)
            {
                int iDigit = num%10;
                iSum += iDigit;
                num /=10;
            }
            num = iSum;
        }
        return num;

        
    }
}