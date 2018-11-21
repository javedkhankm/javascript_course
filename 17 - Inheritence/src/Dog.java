
public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		
		System.out.println("Dog.chew() called");
	}
	
	public void walk() {
		
		System.out.println("Dog.walk() called");
	}
	
	@Override //for over riding you must have inheritance or keyword extends. This is the only condition.
	//Overriding means to use exactly the same parent class method in child class. Java in such case
	//over rides the method.
	public void eat() {
		
		System.out.println("Dog.eat() called");
		super.eat();//this will call the eat method of parent class. This is to avoid over riding.
		chew();//calling chew method. This method is in the same class. So just call the method by calling
		//its name.
	}
	
	
	public void run() {
		
		System.out.println("Dog.run() called");
		super.move(50);
	}

}
