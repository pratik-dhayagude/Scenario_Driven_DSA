#include<iostream>

using namespace std;

int main()
{   
    int i =0,j=0,n=0;

    cin>>n;

     int Star= 1;
    for(i = 0;i<n;i++)
    {
       if(i % 2 == 0) Star =1;
       else Star = 0;
       
       for(j =0 ;j<=i;j++)
       {
        cout<<Star;
        Star = 1 - Star;

       }
        cout<<"\n";
        
        
    }


    return 0;
}