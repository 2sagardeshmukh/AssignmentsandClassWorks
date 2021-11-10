import java.util.Scanner;

public class dtob {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String x = " ";
	System.out.println("Enter decimal number:");
	int n=sc.nextInt();
	int a;
	while(n>0)
	{
	a=n % 2;
	x=a+""+x;
	n=n/2;
	}
	System.out.println("binary number:"+x);

}
}
