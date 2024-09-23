#include <stdio.h>
int main()
{
    int decimal_number;
    int i;
    int binary_number[100000]; // array for binary number
    int length_of_binary_number = 0;

    printf("\nEnter a decimal number: ");
    scanf("%d", &decimal_number);

    while (decimal_number > 0)
    {
        binary_number[length_of_binary_number] = decimal_number % 2;
        // storing binary digits

        decimal_number = decimal_number / 2;
        length_of_binary_number++;
    }
    printf("\nThe binary number of given decimal number is : ");

    for (i = length_of_binary_number - 1; i >= 0; i--)
    // reverse and print the storing digits
    {
        printf("%d", binary_number[i]);
    }

    printf("\n\n");

    return 0;
}
