class Star7
{
   public static void main(String args[])
{
    for(int i =1;i<=5; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int j =1;j <=2*i-1; j++)
		{
			System.out.print("*");
		}System.out.println();
	}
	for(int k =4;k>=1; k--)
	{
		for(int j=4; j>=k; j--)
		{
			System.out.print(" ");
		}
		for(int j =1 ;j <=2*k-1; j++)
		{
			System.out.print("*");
		}System.out.println(); 
	} 
} 
}
