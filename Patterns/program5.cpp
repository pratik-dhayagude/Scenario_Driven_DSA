#include<iostream>

using namespace std;

int main()
{   
    int i =0,j=0,n=0;

    cin>>n;

    for(i = 1;i<n;i++)
    {
        for(j =1;j<=i;j++)
        {
            cout<<i<<"\t";
        }
        cout<<"\n";
    }


    return 0;
}