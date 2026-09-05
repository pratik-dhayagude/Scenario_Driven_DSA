#include<iostream>
using namespace std;
int CheakDivisible(int No)
{
	if( No % 5 == 0)
	{
		return 1;
	}
	else
	{
		return 2;	
	}
}


int main()
{
	int No =0;
	cout<<"Enter the number:\n";
	cin>>No;
	int iRet = CheakDivisible(No);
	if(iRet == 1)
	{
		cout<<"The number divisible by 5\n";
	}
	else
	{
		cout<<"The number is not divisible by 5\n";
	}
	return 0;
}
