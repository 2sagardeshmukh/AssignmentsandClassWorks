import java.util.Scanner;

public class q8billing {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double grand_total = 0;
		while(true)
		{
			System.out.println("enter the item code:");
			int code = sc.nextInt();
			System.out.println("enter the discription:");
			String desc = sc.next();
			System.out.println("enter the quantity");
			int qty = sc.nextInt();
			System.out.println("enter the price");
			double price = sc.nextDouble();
			double total = qty * price;
			System.out.println("enter Y to continue or N to stop");
			char choice = sc.next().charAt(0);
			grand_total+=total;
			if(choice=='Y')
			{
				continue;
			}
			else
			{	
				break;
			}	
		}	
		System.out.println("how do you want to pay? press $ for cash and c for card");
		char type = sc.next().charAt(0);
		if(type=='$')
		{
		 if(grand_total>10000)
		 {
			grand_total=grand_total-grand_total*0.1;
			System.out.println("you need to pay "+grand_total);
		 }
		 else
			 System.out.println("you need to pay "+grand_total);
		}
		if(type=='c')
		{
		 if(grand_total>10000)
		 {
			grand_total=grand_total-grand_total*0.1;
			System.out.println("you need to pay "+grand_total);
		 }
		 if(grand_total<1000&&type=='c')
		 {
			grand_total=grand_total+grand_total*0.025;
			System.out.println("you need to pay "+grand_total);
		 }
		 else
			 System.out.println("you need to pay "+grand_total);
		}
		
	}

}
