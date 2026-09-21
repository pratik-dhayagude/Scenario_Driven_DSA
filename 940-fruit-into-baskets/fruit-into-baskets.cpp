class Solution 
{
public:
    int totalFruit(vector<int>& fruits) 
    {
        int low = 0;
        int high = 0;
        int result = 0;
        unordered_map<int,int> f;
        int n=fruits.size();

        for(high = 0;high < n;high++)
        {
            f[fruits[high]]++;
            if(f.size()>2)
            {
               f[fruits[low]]--;
               if(f[fruits[low]] == 0)
               f.erase(fruits[low]);
               low++;
            }
            int len = high-low+1;
            result = max(result,len);
        }
      
       return result;  
    }
     
};