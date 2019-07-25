#include <stdio.h>
int main()
{long int a,b,j=1,i,n;
 scanf("%ld %ld",&a,&b);
 if(b>=0)
 {
 for(i=1;i<=b;i++)
   j=j*a;
 printf("%ld",j);}
 else{
   printf("Wrong input");}
  	//Your code here       
    return 0;
}