#include<iostream>

using namespace std;


int main()
{
    int i =0,j=0,n=0;
    cin>>n;
    for(i = 0;i<n;i++)
    {
        for(j = 0;j<i;j++)
        {
            cout<<"*\t";
        }
        cout<<"\n";
    } 

    return 0;
}