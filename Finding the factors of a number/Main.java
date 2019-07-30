#include <stdio.h>
 
int main()
{
  int i, Number; 
  scanf("%d", &Number);
  for (i = 1; i <= Number; i++)
   {
     if(Number%i == 0)
        {
		 printf("%d\n", i);
		}
   }
 
  return 0;
}