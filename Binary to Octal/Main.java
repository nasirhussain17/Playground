#include<stdio.h>
#include<math.h>
/*int power_fn(int base,int exp)
{
  	int i,sum=1;
  	for(i=0;i<exp;i++)
    {
      	sum=sum*base;
    }
	return sum;
}*/
int main()
{
 int b,s=0,r,exp=0;
  scanf("%d",&b);
  while(b!=0)
  {
    r=b%10;
  s=s+r*pow(2,exp);
  exp++;
  b=b/10;
  }
  int arr[100],i=0,j;
  while(s!=0)
  {
    	arr[i++]=s%8;
    s=s/8;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",arr[j]);
  return 0;
}