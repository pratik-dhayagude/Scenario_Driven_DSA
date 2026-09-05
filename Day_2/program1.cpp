#include<iostream>

using namespace std;

void Display(int No)
{
	int i = 0;
	for(i = 0;i<No;i++)
	{
		cout<<"Marvellous\n";
	}
}
int main()
{
	int A = 0;
	cout<<"Enter the number:\n";
	cin>>A;
	Display(A);
	return 0;
}
