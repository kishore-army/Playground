#include <stdio.h>
int main() {
	  char ch;
   
   scanf("%c", &ch);
   if('a' <=  ch && ch <= 'z')
   {
      printf("%c", ch-32);
   }
   else if('A' <=  ch && ch <= 'Z')
   {
      printf("%c", ch+32);
   }
   else
   {
      printf("%c", ch);
   }// Type your code here
	return 0;
}