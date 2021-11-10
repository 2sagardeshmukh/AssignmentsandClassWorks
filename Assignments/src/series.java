import java.util.Scanner;

public class series {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int N = sc.nextInt();
	    int n1 = 0;
        int n2 = 1;
        int n5= 1;
        int n6=2;
        //System.out.print(n1+" ");
        System.out.print(n2+" ");
        int n3;
        for(int i=2; i<=N;i++)
        {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
        System.out.println();
        System.out.print(n5+" ");
        System.out.print(n6+" ");
        
        for(int j=3;j<=N;j++)
        {
        	if(j%2 != 0)
        	{
        		n5=n5+3;
        		System.out.print(n5+" ");
        	}
        	else
        	{
        		n6= n6+4;
            	System.out.print(n6+" ");
        	}
        	
         }
        System.out.println();
        int a= 1;
        int b = 5;
        int c = 8;
        int d=0;
        System.out.print(a+" "+b+" "+c+" ");
        for(int k=4;k<=N;k++)
        {
        	d=a+b+c;
        	a=b;
        	b=c;
        	c=d;
        	System.out.print(d+" ");
        }
	}

}
