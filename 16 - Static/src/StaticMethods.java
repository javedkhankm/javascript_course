
public class StaticMethods {

	public static void main(String[] args) {
		//In Java you may have several classes inside one class, but only one class can be public.
		//However, this is not a recommended practice.Therefore, better create separate classes.
		//Static method belongs to a Class. Instance method belongs to an Object or to an Instance.
		//If you are calling a static method from another class, you may call it with class name, such as 
		//Abc.staticMethodName (here Abc is the class name where that particular static method is located). 
		//However, if the static method is in the same class, then you can call it by methodName(); only.
		//Instance method is called with object / instance name and then . and then method name. Such as x.show3(). 
		//here x is an object / instance name.
		
		Abc.show1();
		Abc.show4();
		
		
		Abc x = new Abc();
		x.show2();
		x.show3();
		
	}

}

class Abc{
	
	public static void show1() {
		
		System.out.println("show1-hi");
		
		//show2(); //you can not run instance method from static method. This is why you can not call any
		//instance method from Java's main method because Java's main method is static.
		show4(); //you can call show4() because it is static.
		//from instance method you can call both methods, static and instance.
	}
	
	public void show2() {
		
		System.out.println("show2-hi");
		show1();
	}
	
	public void show3() {
		
		System.out.println("show3-hi");
		show2();
		show1();
	}
	
	public static void show4() {
		
		System.out.println("show4-hi");
	}
	
	
	
}
