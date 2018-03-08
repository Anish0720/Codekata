#include <stdio.h>
int main()
{
    int aa,i;
    int sum=0;
    printf("enter the values");
    scanf("%d",&aa);
    for(i=1;i<=aa;i++)
        sum=sum+i;
        
    printf("%d\n",sum);   
}
