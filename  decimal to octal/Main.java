#include<stdio.h>
int main()
{
 int n,arr[100],i=0,j;
  scanf("%d",&n);
  while(n>0)
  {
    	arr[i]=n%8;
    	n=n/8;
    	i++;
  }
  for(j=i-1;j>=0;j--)
  {
    	printf("%d",arr[j]);
  }
  return 0;
}