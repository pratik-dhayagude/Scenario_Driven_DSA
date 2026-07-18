#include<stdio.h>

void Display(int No)
{
	while(No != 0)
	{
		printf("%d\n",No);
		No = No-1;
	}
}
int main()

{
	int No = 0;
	printf("Enter the number:");
	scanf("%d",&No);
	Display(No);
	
	return 0;
}
