#include<stdio.h>


int Division(int No1,int No2)
{
	return No1/No2;
}
int main()
{
	int No1,No2,iRet;
	printf("Enter the first number:\n");
	scanf("%d",&No1);
	
	printf("Enter the second Number:\n");
	scanf("%d",&No2);
	iRet = Division(No1,No2);
	printf("The division will be:%d\n",iRet);
	 
	
	
	return 0;

}
