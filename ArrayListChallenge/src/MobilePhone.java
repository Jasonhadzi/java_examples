import java.util.ArrayList;

public class MobilePhone {

	//masterclass 
	
	
	
	
	
	private String myNumber;
	private ArrayList<Contact> myContacts;	//ArrayList of Contact type named myContacts
	
	
	public MobilePhone(String myNumber) {		//constructor opou kanw initialize to ArrayList
		// TODO Auto-generated constructor stub
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
		
	}

	//method in order to add a new contact
	//boolean returns false if contacts already exists and true if it is just created
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName())>= 0) {
			
			System.out.println("Contact is already on file");
			return false;
		}
		
		myContacts.add(contact);
		return true;
		
		
	}
	//method to updateContact
	//first the old contact that we are searching for 
	//and then the new contact that we want to update
	//if the contact doesnt exists it return false
	//if it exists this.mycontacs.set(elementwe wewanttoupdate,newitem)
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		
		int foundPostition = findContact(oldContact);
		if(foundPostition <0 ){
			System.out.println(oldContact.getName() + " , was not found.");
		return false;
		
		}
		
		this.myContacts.set(foundPostition, newContact);
		System.out.println(oldContact.getName() + " , was replaced with "+ newContact.getName());
		return true;
		
	}
	
	public boolean removeContact(Contact contact) {
		int foundPostition = findContact(contact);
		if(foundPostition <0 ){
			System.out.println(contact.getName() + " , was not found.");
		return false;
		
		}
		
		this.myContacts.remove(foundPostition);
		System.out.println(contact.getName() + " , was deleted");
		return true;
	}
	
	
	
	
	//method in order to findContact, epistrefw ena int pou einai to index tou ArrayList apo kai einai >=0
	//private because we dont want to expose it publicly
	private int findContact (Contact contact) {
		return this.myContacts.indexOf(contact);
		
	}
	
	
	//another method which overloads the previous
	//loop through all the records, extract the name out and then compare it to the name 
	//that has been passed and return the index position
	//we will use it in the modify method
	//if the name exists return the place, if not return -1
	
	private int findContact(String contactName) {
		for(int i=0; i<this.myContacts.size(); i++){
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)) {
				
				return i;
			}
			
		}
		
		return -1;
	}
	
	
	public Contact queryContact(String name) {
		
		int position = findContact(name);
		if (position >=0) {
			return this.myContacts.get(position);
			
			
		}
		return null;
	}
	
	public String queryContact(Contact contact) {
		
		if(findContact(contact) >= 0) {
			
			return contact.getName();
		}
		return null;
	}
	
	
	
	
	
	
	
	public void printContacts() {
		
		System.out.println("Contact List: ");
		for(int i=0; i<this.myContacts.size(); i++) {
			
			System.out.println((i+1) + "." + this.myContacts.get(i).getName() + "->" + 
											this.myContacts.get(i).getPhoneNumber());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
