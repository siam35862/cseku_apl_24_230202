#include <stdio.h>
#include <string.h>
int vowel_count_recursive(char string[], int n);
// void star_print_recursive1(int n);

int main()
{
    char s[1000];
    printf("Enter a string : ");
    gets(s);
    int n;
    n = strlen(s);
    int count = 0;
    count = vowel_count_recursive(s, n);
    printf("The number of vowel : %d \n", count);

    return 0;
}

int vowel_count_recursive(char string[], int n)
{

    if (n >= 0)
    {

        if (string[n - 1] == 'a' || string[n - 1] == 'e' || string[n - 1] == 'i' || string[n - 1] == 'o' || string[n - 1] == 'u' || string[n - 1] == 'A' || string[n - 1] == 'E' || string[n - 1] == 'I' || string[n - 1] == 'O' || string[n - 1] == 'U')
        {
            return 1 + vowel_count_recursive(string, n - 1);
        }
        else
        {

            return 0 + vowel_count_recursive(string, n - 1);
        }
    }
    else
        return 0;
}
