#include<stdio.h>
int square(int num)
{
return (num * num);
}
int main() {
  int num,n;
  scanf("%d",&num);
  n=square(num);
  printf("%d",n);
   // Type your code here
  
   return 0;
}