#include<stdio.h>
int main()
{
  int num,sum=0,firstDigit=0,lastDigit=0;
 scanf("%d",&num);
  lastDigit=num%10;
  firstDigit=num/100;
  sum=firstDigit+lastDigit;
  printf("%d",sum);
  return 0;
}