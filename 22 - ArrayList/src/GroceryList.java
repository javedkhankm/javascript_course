
import java.util.*;

public class GroceryList {
	
	//List groceryList = new ArrayList(); //created an object groceryList and it can hold any data type

	List <String> groceryList = new ArrayList <String>();// Here the object groceryList will hold only
	//String data type. Here List is interface. ArrayList is the concrete class implementing the List interface.
	
	public void addGroceryItem(String item) {
		
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		
		for (int i=0; i<groceryList.size(); i++) {
			
			System.out.println((i+1) + "." + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		
		groceryList.set(position, newItem);
			
	}
	
	public void removeGroceryItem(int position) {
		
		//String theItem = groceryList.get(position);//for removing better use the next line code.
		
		groceryList.remove(position);
	}
	
	public String findItem (String searchItem) {
		
		//boolean exsist = groceryList.contains(searchItem);
		
		int position = groceryList.indexOf(searchItem);
		
		if(position >=0) {
			
			return groceryList.get(position);
		}
		
		return null;
	}
	
	
	
	
	
	

}
