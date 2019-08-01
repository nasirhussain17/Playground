#include <stdio.h>
int main()
{
  	 int b,e,r=1,i;
  	scanf("%d %d",&b,&e);
  	if(e>=0)
    {
      for(i=0;i<e;i++)
      {
        	r*=b;
      }
      printf("%d",r);
    }
  	else
    {
      	printf("Wrong input");
    }
    return 0;
}