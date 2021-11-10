import java.util.Scanner;

public class btod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = " ";
		System.out.println("Enter binary number:");
		int n=sc.nextInt();
		int sum =0;
		double a;
		int rem=0;
		int i=0;
		while(n>0)
		{
		rem = n%10;
		sum= (int) (sum+ rem*Math.pow(2,i));
		n=n/10;
		i++;
		}
		System.out.println("decimal number:"+sum);

	}

}
