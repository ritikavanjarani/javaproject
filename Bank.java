import java.util.*;
abstract class Account
{
	Scanner scan = new Scanner(System.in);
	String name;
	int acc_num;
	int with = 0;
	int bal;
	int inter; 
	int dep;
	Account(String n,int a)
	{
		this.name = n;
		this.acc_num = a;
	}
	abstract void display();
	abstract void deposit();
	abstract boolean balance();
	abstract void interest();
	abstract void withdraw();
}

class savings_acc extends Account
{
	savings_acc(String n,int a)
	{
		super(n,a);
	}

	void display()
	{
		System.out.println("\nSAVINGS ACCOUNT\nCustomer name : " +name+ "\nAccount number : " +acc_num);
	}
		
	void deposit()
	{
		System.out.printf("\nEnter the deposit = ");
		dep = scan.nextInt();
		System.out.println("\nDeposit = " +dep);
	}

	boolean balance()
	{
		bal = dep - with;
		System.out.println("Balance = " +bal);
		if(bal >= 10000)
		{
			return true;
		}
		else
		{	
			return false;
		}			
	}

	void interest()
	{
		System.out.print("Enter no of years : ");
		int years =scan.nextInt();
		inter = (5*dep*years)/100;
		System.out.println("\nInterest = " +inter);
		dep+=inter;
	}

	void withdraw()
	{
		if(balance())
		{
			System.out.printf("\nEnter the amount to withdraw = ");
			with = scan.nextInt();
			System.out.println("Balance = " +(dep-with));
		}
		else
		{
			System.out.println("Cannot withdraw money.Balance is less than 10000");
		}	
	}	
}

class current_acc extends Account
{
	current_acc(String n,int a)
	{
		super(n,a);
	}

	void display()
	{
		System.out.println("\nCURRENT ACCOUNT\nCustomer name : " +name+ "\nAccount number : " +acc_num);
	}

	void deposit()
	{
		System.out.printf("\nEnter the deposit = ");
		dep = scan.nextInt();
		System.out.println("\nDeposit = " +dep);
	}

	boolean balance()
	{
		bal = dep - with;
		System.out.println("\nBalance = " +bal);
		return true;
	}

	void interest()
	{
		System.out.println("No interest for current account");
	}

	void withdraw()
	{
		System.out.printf("\nEnter the amount to withdraw = ");
		with = scan.nextInt();
		balance();
	}	
}

class Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		savings_acc sacc = new savings_acc("Diya Janyani",895896129);
		current_acc cacc = new current_acc("Ritika Vanjarani",365671283);
		Account acc;
		acc = sacc;
		acc.display();
		acc.deposit();
		acc.balance();
		acc.interest();
		acc.withdraw();
		acc = cacc;
		acc.display();
		acc.deposit();
		acc.balance();
		acc.interest();
		acc.withdraw();
	}
}
