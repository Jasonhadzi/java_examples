
public class Contact {

	//plain class
	//exei ton constractor ton aplo pou kanei apla initialise ta 2 variables opote den vazw setters
	//exei 2 getters
	//create kai a createContact method gia kathe fora pou thelw na dimiourgisw mia nea epafi
	
	
	
	private String name;
	private String phoneNumber;
	
	
	
	public Contact(String name, String phoneNumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	public static Contact createContact (String name, String phoneNumber) {
		
		return new Contact(name, phoneNumber);
		
	}

	
	public String getName() {
		
		return name;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	



	
}
