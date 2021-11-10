import java.util.Scanner;

public class power {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of base");
		int X = sc.nextInt();
		System.out.println("enter the value of power");
		int N = sc.nextInt();
		int pow= 1;
		for(int i=1;i<=N;i++)
		{
			pow = pow*X;
		}
		System.out.println(X+" to the power "+N+" is = "+pow);
	}
}
