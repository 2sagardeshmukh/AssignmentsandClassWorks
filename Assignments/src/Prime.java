import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of n and m");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		
		for(int i=n;i<=m;i++)
		{
			int flag = 1;

			if(i==1)
			{
				flag =0;
			}
			
			for(int j=2;j<=i/2;j++)
			{
			   if(i%j == 0)
			   {	
				 flag = 0;
				 break;
			   }
			}
			if(flag==1)
			{
				System.out.println(i);	
				sum = sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
