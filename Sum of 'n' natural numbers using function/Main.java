#include<stdio.h>
int Sum_Of_Natural_Numbers(int Number);

int main()
{
  int Number, i, Sum = 0;
  scanf("%d", &Number);
  
  Sum = Sum_Of_Natural_Numbers(Number);
  
  printf("%d", Sum);
  return 0;
}

int Sum_Of_Natural_Numbers(int Number)
{
	int i, Sum = 0;
	
	if (Number == 0)
	{
		return Number;
	}
	else
	{
		return (Number * (Number + 1) / 2);
	}
	
}