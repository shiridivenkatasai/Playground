#include<stdio.h>
int main()
{
  //Type your code here
  int num,ld,fd,sum=0;
  scanf("%d",&num);
  ld=num%10;
  fd=num;
  while(num>=10){
    num=num/10;
  }
  fd=num;
  sum=fd+ld;
  printf("%d",sum);
  return 0;
}