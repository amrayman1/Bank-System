package system;

public class Commericalclient extends client {
	
	private int commericalid;	
	
	public Commericalclient() {
		
	}
	

	public Commericalclient(String name, int commericalid, String address,  String phone, Account acc) {
		super(name, commericalid, address, phone, acc);
		this.commericalid = commericalid;
	}


	public void setcommericalid(int commerical) {
		commericalid = commerical;
	}

	public int getcommericalid() {
		return commericalid;
	}

	@Override
	public String toString() {
		return "Client " + "Name: " + getName() + "Commerical ID:  " + getcommericalid() + "Address: " + getAddress() + "Phone: "
				+ getPhone() + "Account: " + getAccount().toString() ;

	}

}