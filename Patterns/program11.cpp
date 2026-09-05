#include<iostream>

using namespace std;

int main()
{   
    int i =0,j=0,n=0;

    cin>>n;

    for(i = 0;i<=2*n-1;i++)
    {
        int Stars = i;

        if(i>n)
        {
            Stars = 2*n-i;
        }
        for(j = 0;j< Stars;j++)
        {
            cout<<"*";
        }
        cout<<"\n";
        
    }


    return 0;
}