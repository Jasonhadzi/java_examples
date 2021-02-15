//i could have a single class file for every Brand (mitsubishi etc)
	// i decide to write everything here to show a differrent perspective
	//this is the base class
	class Car {	
		
		private boolean engine;
		private int cylinders;
		private String name;
		private int wheels;
		
		
		
	

	public Car(int cylinders, String name) {
		
		this.cylinders = cylinders;
		this.name =name;
		this.wheels = 4;
		this.engine = true;
		
		
	}
	
	public int getCylinders() {
		
		return cylinders;
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String startEngine() {
		return "Car -> Start Engine";
		
	}
	
	public String accelerate() {
		
		return "Car -> accelerate";
	}
	
	public String brake(){
		
		return "Car -> brake";
			
	}
	
}
	
	// a class that extends Car class
	
	class Mitsubishi extends Car {
		
		//the constractor of this class uses the constractor of Car, thats why i used super(...)
		
		public Mitsubishi(int cylinders, String name){
			super(cylinders, name);
			
		}
		
		//next we override some methods
		// with the super i call the function from the base class
		@Override
		public String startEngine() {
			//return super.startEngine();
			return getClass().getSimpleName() + " -> Start Engine "; //an alternate way to show the below sentence, getSimpleName is how i get the class' name
			//return "Mitsubisi -> accelerate"; //this is the custom option i chose to return
			
		}
		@Override
		public String accelerate() {
			
			return super.accelerate();
		}
		@Override
		public String brake(){
			
			return super.brake();
				
		}
	}
	
	//with the same way i can create as much classes as i want and i can override the methods if i want to change some things
	
public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car = new Car(8,"Base Car");
		
		
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
		
		
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		
		
		
		
		
		
		
	}

}
