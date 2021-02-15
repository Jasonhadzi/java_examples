
public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//here i am just testing if it is working :P
		
		
		Account Jason = new Account();
		
		Jason.withdrawal(100.0);	//testing my methods
		Jason.deposit(600.0);
		Jason.withdrawal(230.3);
		
		//etsi dimiourgw ena antikeimeno me ton deftero constructor
		Account Jasonakis = new Account("1234", 0.00, "Jason Hadzi", "myemail@gmail.com", "6960843675");
		System.out.println(Jasonakis.getEmail());
		
		
		VipCustomer person1 = new VipCustomer();	//edw ton dimiourgw
		
		System.out.println(person1.getVipName());	// edw kanw retrieve ena arxeio
		
		VipCustomer person2 = new VipCustomer("NIkos", 690090.00);
		
		System.out.println(person2.getVipName());	// edw kanw retrieve ena arxeio
		
		VipCustomer person3 = new VipCustomer("tim", 20000.09, "timmail@gmail.com");
		
		System.out.println(person3.getvipemail());	// edw kanw retrieve ena arxeio
	}

}
