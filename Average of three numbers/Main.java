#include<stdio.h>
int main()
{
  int num,secondlast,last,sum,avg;
  scanf("%d %d %d  %d %d",&num,&secondlast,&last,&sum,&avg);
  sum=num+secondlast+last;
  avg=sum/3;
  printf("%d",avg);
  return 0;
}