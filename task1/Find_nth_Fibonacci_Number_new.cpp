#include <stdio.h>

int fibonacci(int n);

// Fibonacci Number Series: 0 1 1 2 3 5 8 13 21 34 55 ......

int main()
{
    int Nth;
    int Nth_fibonacci_number;

    printf("Please enter the term number of the series: ");
    scanf("%d", &Nth);

    Nth_fibonacci_number = fibonacci(Nth); // Function call

    printf("\n%dth fibonacci number is %d .\n", Nth, Nth_fibonacci_number);

    return 0;
}

int fibonacci(int n)
{
    if (n == 1 || n == 2)
    {
        return n - 1;
        // 1st fibonacci number is 0 and 2nd fibanacci number is 1.
    }
    return fibonacci(n - 1) + fibonacci(n - 2); // recursive funtion call
    // Nth Fibonacci number in series=((N-1)th +(N-2))th Fibonacci Number
}
