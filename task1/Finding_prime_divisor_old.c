#include <stdio.h>
#include<math.h>

int main()

{

	int a,n,i,j, f,len; 
    scanf("%d",&n);
    int fl=0;

	for (i=2;i<=n;i++)
	{
		if (n%i==0)
		{
            f=0;
            
			for(j=2;j<=sqrt(i);j++)
			{
				if(i%j==0)
				{
					f=1; 
                    break;
				}
			}

		

			if (f!=1)
			{
				printf("Prime divisor: %d\n",i);
                fl=1;
			}
        }    
	
		
	}
    if(fl==0)printf("There is no prime divisor.");

return 0;

}
