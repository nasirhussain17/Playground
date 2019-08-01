#include<stdio.h>
#include<string.h>
int main()
{
	char ch[100];
  	int i,l,c=1;
  	gets(ch);
     if(strlen(ch)>20)
      {
        	printf("Invalid Input");
      }
  else{
  	for(i=0;ch[i]!='\0';i++)
    {
      	if(ch[i]==ch[i+1])
        {
          	c++;
        }
      else
      {
        	printf("%c%d",ch[i],c);
        c=1;
      }
      
    }
  }
  	return 0;
  	
}