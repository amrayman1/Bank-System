/* Name: Yasser Eid Abd El-Samd     Date: 22/2/2020
         Salah Mohamed Salah*/
package system;

import java.util.Scanner;

public class system {
	

	public static void main(String[] args) {
		Bank bank = new Bank() ;
		int x ; 
		
		do {
		int  y, c, i ;
		String name, address, p;
		Scanner myscanner = new Scanner(System.in);
		Account account = new Account();
		SpecialAccount specialAccount = new SpecialAccount();
		System.out.println("1-client" + "\n2-commerical client" + "\n3- All Accounts "  + "\n4-Doing process "+ "\n5-Exit " );
		x = myscanner.nextInt();
		if (x == 1) {
			
			// if he choice client 
			System.out.println("enter your name:");
			name = myscanner.nextLine();
			name = myscanner.nextLine();
			
			System.out.println("enter your National ID:");
			i = myscanner.nextInt();
			
			System.out.println("enter your address:");
			address = myscanner.nextLine();
			address = myscanner.nextLine();
			
			System.out.println("enter your phone:");
			p = myscanner.next();
	
			client Client = new client(name,i,address,p,account);
			// m is client / z is account 
			bank.addclient(Client, account);
			
		} else if (x == 2) {
			// if he choice commercial client 
			System.out.println("enter your name:");
			name = myscanner.nextLine();
			name = myscanner.nextLine();
			
			System.out.println("enter your comerical ID:");
			i = myscanner.nextInt();
			
			System.out.println("enter your address:");
			address = myscanner.nextLine();
			address = myscanner.nextLine();
			
			System.out.println("enter your phone:");
			p = myscanner.next();

			Commericalclient commercialClient = new Commericalclient(name,i,address,p,specialAccount);
			// h is commercial client / n is special account
			bank.addclient(commercialClient, specialAccount);
		}
		else if (x == 3 ) {
			bank.displayaccount();
		}
		else if (x== 4 ) {
			System.out.println("Enter your account number ");
			int accountNumber = myscanner.nextInt() ; 
			do {

				System.out.println("what do you want to do?\n" + "1-withdraw or deposit \n" + "2-Balance\n"
						 + "3-Back");
				c = myscanner.nextInt();
				if (c == 1)
					if(bank.withdraw_deposit_to(accountNumber))
						{System.out.println("Done");}
					else {
						System.out.println("not found");
					}
				
				if (c == 2)
					 bank.getBalance_to(accountNumber);
				if (c == 3)
					break;
				
			} while (c != 3);
			
			
		}
		}while(x!=5) ; 

	}
}