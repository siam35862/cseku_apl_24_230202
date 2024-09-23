#include<stdio.h>
int main()
{
    int i,x=0,a[1000];
    int n;
    scanf("%d",&n);
    while(n>0)
    {
        a[x]=n%2;
        n=n/2;
        x++;
    }
    for(i=x-1;i>=0;i--)
    {
        printf("%d",a[i]);

    }
    printf("\n");
    return 0;
}
