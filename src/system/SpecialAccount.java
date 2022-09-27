package system;

import java.util.Scanner;

public class SpecialAccount extends Account {
	
	
	@Override
	public void withdraw_deposit() {
		int a, b;
		Scanner myscanner = new Scanner(System.in);
		System.out.println("1-withdraw" + "\n" + "2-deposit");
		a = myscanner.nextInt();
		if (a == 1) {
			System.out.println("How much do you want to withdraw?");
			b = myscanner.nextInt();
			if (Balance<=b &&b <=1000 && Balance>-1000)
				Balance -= b;
			else
				System.out.println("sorry You cannot withdraw");
		}
		if (a == 2) {
			System.out.println("How much do you want to deposit?");
			b = myscanner.nextInt();
			Balance += b;
		}
	}

}