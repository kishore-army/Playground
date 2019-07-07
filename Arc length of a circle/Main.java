#include<stdio.h>
int main()
{
  float r,len,angle;
  scanf("%f%f",&r,&angle);
  len=2*r*(3.14)*(angle/360);
  printf("%0.2f",len);
}