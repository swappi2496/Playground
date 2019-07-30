#include<stdio.h>
int main()
{	
	int n;
    scanf("%d %d",&n);
	for(int count = 1 ;count <= n ;count++) 
        {
		   printf("%d",count);
		   if((count % 3==0) && (count != n))
    		   printf(",");			
		}
     return 0;
}