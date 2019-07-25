#include<stdio.h>  
int main()    
{    
 long int i,fact=1,number;    
    
  scanf("%ld",&number);    
    for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  printf("%ld",fact);    
return 0;  
}   