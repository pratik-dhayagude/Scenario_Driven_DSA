class Solution {
    public boolean isPalindrome(int x)
    {
        int iDigit =0;
        int temp = x;
        int Result =0;

        while(x>0)
        {
            iDigit = x%10;
            Result = Result *10 +iDigit;
            x = x/10;
        }
        if(Result == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}