
public class Honda extends Car {
	
	private Engine engine; //This statement is equivalent to Engine engine = new Engine(); 
	//or equivalent to private int door; <--- example. <---- this is dealing with primitive data type.
	//However, private Engine engine; is dealing with non-primitive data type or reference type.
	//In Engine engine = new Engine();, Engine engine is reference side and new Engine() is object side.
	
	//Since Honda class has an object of Engine class as its data member (Honda class has an instance 
	//variable of type Engine), the code inside Honda class has access to Engine class properties and can 
	//call the Engine class methods through that Engine class object.
	
	//A reference type is a data type that’s based on a class rather than on one of the primitive types 
	//that are built in to the Java language. When you create an object from a class, Java allocates the 
	//amount of memory the object requires to store the object. Then, if you assign the object to a variable, 
	//the variable is actually assigned a reference to the object, not the object itself. This reference is 
	//the address of the memory location where the object is stored.
	
	
	
	public Honda(String color, int maxSpeed, Engine engine) {
		super(color, maxSpeed);
		this.engine = engine;
		
	}
	
	public void startHonda() {
		
		engine.start();
	}

	
	
	

}
