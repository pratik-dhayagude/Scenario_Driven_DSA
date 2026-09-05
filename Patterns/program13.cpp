#include<iostream>

using namespace std;

int main()
{   
    int i =0,j=0,n=0;

    cin>>n;

    int S = 2*(n-1);
    for(i = 1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            cout<<j;
        }
       
        for(j = 1;j<=S;j++)
        {
            cout<<" ";
        }


        
        for(j = i;j>=1;j--)
        {
            cout<<j;
        }
        cout<<"\n";
        S -= 2;
        
        
    }


    return 0;
}