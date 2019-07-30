#include<stdio.h>
int main()
{
	//your code here
  long int n,fact=1;
  scanf("%ld",&n);
  int c=1;
  while(c<=n){
    fact=fact*c;
    c++;
  }
  printf("%ld",fact);
  return 0;
}