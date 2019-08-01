#include<stdio.h>
#include<string.h>

int main()
{
  char ch[100];
  int i,l=0;
  scanf("%[^\n]s",ch);
  for(i=0;ch[i]!='\0';i++)
  {
		if(ch[i]==' ')
        {
          	l++;
        }
  
}
  printf("%d",l+1);
  return 0;
}