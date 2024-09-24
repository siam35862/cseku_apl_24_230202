#include <stdio.h>
int fib(int n);

int main()
{
    int n,t;
    printf("Please enter the term number of the series: ");
    scanf("%d",&n);
    int nth_fibonacci_number=fib(n-1);
    printf("\n%dth fibonacci number is %d .\n",n,nth_fibonacci_number);       
    return 0;
}

int fib(int n)
{    if (n==0 || n==1)
    {
        return n;
    }            
    return fib(n-1)+fib(n-2);
    
 }
 