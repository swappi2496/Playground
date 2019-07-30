#include <stdio.h>

int main()
{
    int i, j, rows;

    /* Input number of rows from user */
    scanf("%d", &rows);
	
    /* Iterate through rows */
    for(i=rows; i>=1; i--)
    {
        /* Iterate through columns */
        for(j=i; j>=1; j--)
        {
            
          printf("%d",j);
          
        }
       
        /* Move to the next line */
        printf("\n");
    }

    return 0;
}