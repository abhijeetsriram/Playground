#include<stdio.h>
int main()
{int t,sum,r;
 scanf("%d %d",&t,&sum);
  
      r = t % 10;
      sum       = sum + r;
      t         = t / 10;
 t= t+r;
 printf("%d",t);
 
  return 0;
}