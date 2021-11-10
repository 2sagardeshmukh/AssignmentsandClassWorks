import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		  
		    Scanner sc = new Scanner(System.in);
		    System.out.println("enter a number");
		    int x = sc.nextInt();
		    int n1 = 0;
	        int n2 = 1;
	        int count = x+2;
	        int n3 =0;
	        for(int i=2; i<=x+2;i++)
	        {
	            n3 = n1+n2;
	            if(x==0 || x==1 )
	 	        {
	 	        	System.out.println(x+" is a fibonacci number");
	 	        	count++;
	 	        	break;
	 	        } 
	            
	            if(x==n3)
	 	        {
	 	        	System.out.println(x+" is a fibonacci number");
	 	        	count++;
	 	        	break;
	 	        	
	 	        }
	          n1=n2;
	          n2=n3;
           }
	        if(count >x+3)
	        {
	        	System.out.println(x+" is not a fibonacci number");
	        }
	       
	}
}
