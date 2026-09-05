#include<stdio.h>

void Display(int No)
{
	int iCnt = 0;
	for(iCnt = 0;iCnt<No;iCnt++)
	{
		printf("Marvellous\n");
	}
}

int main()

{	
	int iNo = 0;
	printf("Enter the Number:\n");
	scanf("%d",&iNo);
	Display(iNo);
	return 0;
}
