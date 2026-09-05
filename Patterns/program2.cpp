#include<iostream>

using namespace std;

void print(int row,int Coloum)
{
    int i =0,j=0;
    for(i=0;i<row;i++)
    {
        for(j = 0;j<Coloum;j++)
        {

            cout<<"*\t";
        }
        cout<<"\n";

    }

}

int main()
{

    int i=0 ,j=0;

    cout<<"Enter the row:\n";
    cin>>i;

    cout<<"Enter the Coloum:\n";
    cin>>j;
    print(i,j);

    


    return 0;
}
