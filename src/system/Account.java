package system;

import java.util.Scanner;

public class Account {
	public int Balance;
	private int Account_number;
	private static int NextaccNumber =10000 ;
	
	Account(){
		Balance = 0 ; 
		Account_number = NextaccNumber++ ; 
	}
	
	public void setBalance(int balance)
	{
		Balance=balance;
	}
	public int getbalance()
	{
		return Balance;
	}
	public void setaccount_number(int account_number)
	{
		Account_number=account_number;
	}
	public int getaccount_number()
	{
		return Account_number;
	}
	public void print()
	{
		System.out.println("your account number is:"+Account_number);
		System.out.println("your balance="+Balance);
	}
	public void withdraw_deposit()
	{
		int a;
		double b;
		Scanner myscanner=new Scanner(System.in);
		System.out.println("1-withdraw"+"\n"+"2-deposit");
		a=myscanner.nextInt();
		if (a==1)
		{
			System.out.println("How much do you want to withdraw?");
			b=myscanner.nextInt();
			if ( Balance<=b &&b <=1000 && Balance>-1000)
				Balance-=b;
			else
				System.out.println("sorry You cannot withdraw");
		}
		if (a==2)
		{
			System.out.println("How much do you want to deposit?");
			b=myscanner.nextInt();
			Balance+=b;
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Account: " +
				"Balance is: " + Balance +
				", Account number: " + Account_number +
				'}';
	}
}