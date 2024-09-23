#include <stdio.h>
#include <string.h>

int vowel_count_recursively(char string[], int length);

int main()
{
    char string[100000];
    int length; // length of string
    int vowel_count = 0;

    printf("Enter a string (length of string, between 1 and 100000) : ");
    gets(string); // input a string

    length = strlen(string);

    vowel_count = vowel_count_recursively(string, length);
    // counting vowel in a string by calling recursive function

    printf("\nThe number of vowel is %d in that given string.\n", vowel_count);

    return 0;
}

int vowel_count_recursively(char string[], int length)
{

    if (length == 0) // termination condition of recursion
    {
        return 0;
    }
    else
    {

        if (string[length - 1] == 'a' || string[length - 1] == 'A' ||
            string[length - 1] == 'e' || string[length - 1] == 'E' ||
            string[length - 1] == 'i' || string[length - 1] == 'I' ||
            string[length - 1] == 'o' || string[length - 1] == 'O' ||
            string[length - 1] == 'u' || string[length - 1] == 'U')
        {
            return 1 + vowel_count_recursively(string, length - 1);
            // recurssive call
        }
        else
        {

            return 0 + vowel_count_recursively(string, length - 1);
            // recurssive call
        }
    }
}
