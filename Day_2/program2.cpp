#include<iostream>

using namespace std;
void Display(int No)
{
	while(No != 0)
	{
		cout<<No<<"\n";
		No = No-1;
	}
}
int main()
{
	int No = 0;
	cout<<"Enter the number:";
	cin>>No;
	Display(No);
	return 0;
	
}
