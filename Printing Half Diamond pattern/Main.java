#include <stdio.h>

int main()
{
   int rows, i, j, space;
   scanf("%d",&rows);

   for(i = 1; i <= rows; i++)
   {
      //for loop for displaying space
      for(space = i; space < rows; space++)
      {
         printf(" ");
      }
      //for loop to display star equal to row number
      for(j = 1; j <= (2 * i - 1); j++)
      {
         printf("*");
      }

      printf("\n");
   }

   return 0;
}