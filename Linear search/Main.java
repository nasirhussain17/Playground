#include<stdio.h>
int main()
{
  int n,arr[100],i,n1,j=0;
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    	scanf("%d",&arr[i]);
  }
  scanf("%d",&n1); 
  for(j;j<n;j++)
  {
    	if(n1==arr[j])
        {
			printf("%d",j+1);
          return 0;

       }
  }
  printf("%d isn't present in the array.",n1);
  
  return 0;
}