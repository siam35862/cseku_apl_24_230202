#include <stdio.h>
#include<math.h>

int main()

{

	int number;
    int i,j;
    int cheak_prime_divisor=0;
    int cheak_prime=0;

    printf("Enter an integer number: ");
    scanf("%d",&number);
    

	for (i=1;i<=number;i++)
	{
		if (number%i==0)//finding a divisor i
		{
            cheak_prime=0;
            
			for(j=2;j<=sqrt(i);j++)
			{
				if(i%j==0)
				{
					cheak_prime=1; 
                    break;
				}
			}

		

			if (cheak_prime==0)// divisor i is a prime number
			{
				printf("Prime divisor: %d\n",i);
                cheak_prime_divisor=1;
			}
        }    
	
		
	}

    if(cheak_prime_divisor==0)
	{
		printf("There is no prime divisor.");
	}

return 0;

}