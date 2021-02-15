
/**
 * Created by dev on 8/3/15.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);	//one brain and one body
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override	//overriding a method that is in the superclass
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    
    
    
    public void walk() {
    	
    	System.out.println("Dog.walk() called");
    	move(5);
    	//mporw kai super.move(5);
    }
    
    public void run() {
    	
    	System.out.println("Dog.run() called");
    	move(10);
    }
}
