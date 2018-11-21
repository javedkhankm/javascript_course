
public class Main {

	public static void main(String[] args) {
	
//		Dog d1 = new Dog();
//		d1.speak();
//		
//		Cat c1 = new Cat();
//		c1.speak();
//		
//		Bird b1 = new Bird();
//		b1.speak();
		
		//============================//
		
//		Animal a1 = new Dog();
//		a1.speak();
//		
//		Animal a2 = new Cat();
//		a2.speak();
//		
//		Animal a3 = new Bird();
//		a3.speak();
		
		//============================//
		
		Animal a = new Dog(); //This is Polymorphism. Same Object in many forms. Created one Object "a"
		//and then this Object is pointing towards different reference points in the memory and takes
		//different forms. There should be some relationship between the classes in case of Polymorphism.
		//And that relationship is created through Inheritance.
		//If you don't want to use Polymorphism, then you need to use the above steps (commented out steps), and
		//this is not an efficient way.
		a.speak();
		
		a = new Bird();
		a.speak();
		
		a = new Cat();
		a.speak();
		
		//loop created by Kanat.
		
//		Animal animal[]=new Animal[]{new Dog(),new Cat(),new Bird()};
//        for(int i=0; i<3; i++){
//            animal[i].speak();
//        }



	}

}

//a is not an object. It is a variable of type Animal that can hold references(addresses) of Cat, 
//Dog and Bird objects because these classes are subclasses of Animal. new Cat() creates a new Cat object 
//in memory(heap) and returns a reference (memory address) of that object that we can assign to variable a. 
//a is a reference type variable.

//Dog d1; does not create a Dog object in memory. It just creates a variable of type Dog on stack. new Dog() 
//creates a Dog object in memory(heap) and returns a reference to it that you can assign to d1 i.e. d1 = new Dog();

//Create a variable of type Animal say "a". Now create an object of type Dog with "new Dog()". Assign the 
//reference(memory address) the "new Dog()" returns to "a". We can do it because Dog is an 
//Animal (parent child relationship). Now if we write a.speak() the speak() method in the Dog class will be 
//called because variable "a" holds a reference to a Dog object (is pointing to a Dog object in memory).
//Repeat the same procedure for Bird and Cat. This is polymorphism. We are creating reference type variable "a" 
//only once. But first it is pointing to a Dog object. After "a = new Cat()", it is pointing to a Cat object 
//and "a.speak()" will call the speak method in Cat class and so on.

