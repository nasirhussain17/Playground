#include<stdio.h>
int main()
{
  int n,i=0,arr[32],j;
  scanf("%d",&n);
  while(n>0)
  {
    arr[i]=n%2;
    n=n/2;
    i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",arr[j]);
  }
  
  return 0;
}