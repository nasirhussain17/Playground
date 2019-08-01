#include<stdio.h>
int main()
{
  	int n,n1,n2,i,n1_index=-1,n2_index=-1;

  scanf("%d",&n);
    int arr[n];
  for(i=0;i<n;i++)
  {
    	scanf("%d\n",&arr[i]);
  }
  scanf("%d%d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    	if(n1==arr[i]&&n1_index==-1)
        {
          	n1_index=i;
          
        }
    else if(n2==arr[i]&&n2_index==-1)
    {
      		n2_index=i;
    }
}
  printf("Element 1 index = %d",n1_index);
   printf("\nElement 2 index = %d",n2_index);
 
  return 0;
}