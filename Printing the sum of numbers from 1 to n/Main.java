#include <stdio.h>
 
int main()
{
   int i, n, s= 0,v;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&v);
    s=s+i;
  }
  printf("%d",s);
 

   return 0;
}