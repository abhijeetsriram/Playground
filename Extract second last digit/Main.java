#include<stdio.h>
int main()
{
  int num,secondlast,last;
  scanf("%d %d %d ",&num,&secondlast,&last);
  secondlast=num/10;
  last=secondlast%10;
  printf("%d",last);
  return 0;
}