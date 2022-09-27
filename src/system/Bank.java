package system;

import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	private  String phone;
	private Account account ; 
	private SpecialAccount specialAccount ; 
	private client Client ; 
	

	public void setname(String n) {
		name = n;
	}

	public String getname() {
		return name;
	}

	public void setaddress(String add) {
		address = add;
	}

	public String getaddress() {
		return address;
	}

	public void setphone( String ph) {
		phone = ph;
	}

	public  String getphone() {
		return phone;
	}
	
	ArrayList<client> clientlist = new ArrayList<client>();
	ArrayList<Account> Accountlist = new ArrayList<Account>();

	public void addclient(client obj1, Account obj2) {
		clientlist.add(obj1);
		Accountlist.add(obj2);

	}

	public void displayaccount() {
		for (int i = 0 ;  i < clientlist.size(); ++i ) {
		System.out.println(clientlist.get(i).toString());
		System.out.println(Accountlist.get(i).toString());
		}

	}
	
	public boolean withdraw_deposit_to(int accountNumber) {
		for (int i = 0 ; i < Accountlist.size() ; ++i) {
			if (Accountlist.get(i).getaccount_number()==accountNumber) {
				Accountlist.get(i).withdraw_deposit();
				return true ; 
			}
		}
		return false ; 
		
		
	}
	public void getBalance_to(int accountNumber) {
		for (int i = 0 ; i < Accountlist.size() ; ++i) {
			if (Accountlist.get(i).getaccount_number()==accountNumber) {
				System.out.println("Your Balance=" + Accountlist.get(i).getbalance());
		}
		
	}
	}
	public boolean search(int accountNumber) {
		for (int i = 0 ; i < Accountlist.size() ; ++i) {
			if (Accountlist.get(i).getaccount_number()==accountNumber) {
				return true ; 
			}
		}
		return false ; 
		
	}
	
}