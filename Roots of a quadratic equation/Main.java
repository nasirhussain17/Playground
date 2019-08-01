#include<math.h>
#include<stdio.h>

int main()
{
  float a,b,c,r1,r2,d,rpart,ipart;
  scanf("%f%f%f",&a,&b,&c);
  d=(b*b-(4*a*c));
  if(d>0)
  {
    r1=(-b+sqrt(d))/(2*a);
    r2=(-b-sqrt(d))/(2*a);
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else if(d==0)
  {
    	r1=r2=(-b/(2*a));
    	printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else
  {
    	 rpart = -b/(2*a);
        ipart = (sqrt(-d))/(2*a);
        printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi", rpart, ipart, rpart, ipart);
    }
    	return 1;
  
}