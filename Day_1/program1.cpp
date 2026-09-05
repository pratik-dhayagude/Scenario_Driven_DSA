#include<iostream>

using namespace std;

int Division(int No1,int No2)
{
	return No1/No2;
}
int main()
{
	int No1 ,No2,iRet;
	cout<<"Enter the first number:\n";
	cin>>No1;
	cout<<"Enter the second number:\n";
	cin>>No2;
	iRet = Division(No1,No2);
	cout<<"The division is:"<<iRet<<"\n";
	
	
	return 0;
}
