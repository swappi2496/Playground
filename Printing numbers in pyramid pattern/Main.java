#include <stdio.h>

int main()
{
   int rows, i, j, space,number=1;
   scanf("%d",&rows);

   for(i = 1; i <= rows; i++)
   {
      //for loop for displaying space
      for(space = i; space < rows; space++)
      {
         printf(" ");
      }
      //for loop to display star equal to row number
      for(j = 1; j <=i; j++)
      {
         printf("%d ",number);
        ++number;
      }

      printf("\n");
   }

   return 0;
}