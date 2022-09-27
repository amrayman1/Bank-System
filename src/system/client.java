package system;

public class client {
	private String Name;
	private int NationalID;
	private String Address;
	private String Phone;
	Account account ;

	public client() {
		Name = "" ; 
		NationalID = 00000000000000 ; 
		Address  = "" ; 
		Phone = "" ;
		account = null ; 
	}
	

	public client(String name, int nationalID, String address,  String phone , Account acc) {
		super();
		Name = name;
		NationalID = nationalID;
		Address = address;
		Phone = phone;
		account = acc ; 
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNationalID() {
		return NationalID;
	}

	public void setNationalID(int nationalID) {
		NationalID = nationalID;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public  String getPhone() {
		return Phone;
	}

	public void setPhone( String phone) {
		Phone = phone;
	}
	


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "client [Name=" + Name + ", NationalID=" + NationalID + ", Address=" + Address + ", Phone=" + Phone
				+ ", account=" + account + "]";
	}
	
}