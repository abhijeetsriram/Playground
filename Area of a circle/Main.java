#include <stdio.h>
#include <stdlib.h>
#define PI 3.14

int main()
{
    float radius, area,r;
scanf("%f",&radius);
    r = radius / 2;
    area = PI * r * r ;
    printf("%.2f\n", area);
}