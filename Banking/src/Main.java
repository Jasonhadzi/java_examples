
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank("Alpha Bank");
		
		bank.addBranch("Thessaloniki");
		bank.addCustomer("Thessaloniki", "Jason", 300.46);
		bank.addCustomer("Thessaloniki", "Jackson", 345.79);
		bank.addCustomer("Thessaloniki", "mike", 40.45);
		
		
		bank.addBranch("Athens");
		bank.addCustomer("Athens", "Jason", 123.22);
		
		bank.addCustomerTransaction("Thessaloniki", "Jason", 200.34);
		bank.addCustomerTransaction("Thessaloniki", "Jason", 600.34);
		bank.addCustomerTransaction("Thessaloniki", "Mike", 100.34);
		
		
		bank.listCustomers("Thessaloniki", true);
		
		bank.listCustomers("Athens", true);
		
		bank.addBranch("Melborne");
		
		if(!bank.addCustomer("Melborne", "Brian", 5.33)){
			
			System.out.println("Error that branch doesnt exist");
		}
		
		if(!bank.addBranch("Thessaloniki")) {
			
			System.out.println("Thessaloniki branch alreaady exists ");
			
		}
		
		
		
	}

}
