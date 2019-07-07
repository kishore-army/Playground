#include <stdio.h>
int main()
{
  int b,p,i,a=1;
  scanf("%d%d",&b,&p);
  if(p>=0)
  {
    for(i=1;i<=p;i++)
    {
      a=a*b;
   
    }
     printf("%d",a);
  }
 else
    printf("Wrong input");
  
  	//Your code here       
    return 0;
}