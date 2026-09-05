#include<stdio.h>

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
	printf("Enter the number:\n");
	scanf("%d",&No);
	int iRet = CheakDivisible(No);
	if(iRet == 1)
	{
		printf("The number divisible by 5\n");
	}
	else
	{
		printf("The number is not divisible by 5\n");
	}
	return 0;
}
