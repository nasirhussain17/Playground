#include<stdio.h>
int main()
{
  int n,t1=0,t2=1,nt=0,i;
  scanf("%d",&n);
  for(i=1;i<=n;++i)
  {
    	printf("%d ",t1);
    	nt=t1+t2;
    	t1=t2;
    	t2=nt;
  }
    
  return 0;
}