
public class VipCustomer {

	private String vipname;
	private double creditlimit;
	private String vipemail;
	
	public VipCustomer() {	//1st constructor	calls the 3rd onw with default values
		this("Default name",10000000.0, "Deafault email");
		
		
	}
	
	public VipCustomer(String vipname, double creditlimit){	//pass on 2 values it receives and add a default value for the 3rd
		
		this(vipname, creditlimit, "myemail@gmail.com");
					
	}
	
	public VipCustomer(String vipname, double creditlimit, String vipemail) {
		
		this.creditlimit = creditlimit;
		this.vipname = vipname;
		this.vipemail = vipemail;
		
	}

	
	public String getVipName() {
		
		return this.vipname;
	}
	public double getcreditlimit() {
		
		return this.creditlimit;
	}
	public String getvipemail() {
		
		return this.vipemail;
	}
	
}
