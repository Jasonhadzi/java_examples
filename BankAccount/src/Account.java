
public class Account {

	private String accountnumber;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public Account() {		//klassikos constractor apla gia initialize
		//to this prepei na einai the first line that is excecuted
		this("342423", 2.5, "Deafult name", "Default address", "default phone"); //gia kathe antikeimeno pou den to kanw initialize me ton 2o constructor vazw me to this aftes tis default times
		
		System.out.println("Empty Constructor called");
	}
	
	public Account( String accountnumber, double balance, String name, String email, String phone){
		System.out.println("Account Constructor with parameters called");
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.name = name;	//episis mporw na to kanw kai etsi:
	//	setName(name); alla den to protimame 
		
		this.email = email;
		this.phone = phone;
		
		
	}
	//create the 2 methods deposit
	//opou exw variables tis klassis (fields) vazw pada kai to this gi ana min exw sigxisi
	
	public void deposit(double depositAmount){
		balance += depositAmount;
		System.out.println("Deposit of: "+ depositAmount +" The current ammount is: "+ this.balance);
	}
	
	public void withdrawal(double withdrawalAmount){
		if(this.balance - withdrawalAmount < 0){
			
			System.out.println("Insufficient Funds :( Currently: " + this.balance);
		}
		else{
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of: "+ withdrawalAmount +" The current ammount is: "+ this.balance);
			
		}
		
	}
	
	
	
	public void setAccount(String accountnumber){
		this.accountnumber = accountnumber;
		
	}
	
	public String getAccount() {
		
		return this.accountnumber;
	}
	
	public void setBalance(Double balance){
		this.balance = balance;
		
	}
	
	public Double getBalance() {
		
		return this.balance;
	}
	public void setName(String name){
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
	}
	
	
	public void setEmail(String email){
		this.email = email;
		
	}
	
	public String getEmail() {
		
		return this.email;
	}
	public void setPhone(String phone){
		this.phone = phone;
		
	}
	
	public String getPhone() {
		
		return this.phone;
	}
	
	
	
	

}
