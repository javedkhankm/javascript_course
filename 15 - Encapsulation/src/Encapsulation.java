
public class Encapsulation {

	public static void main(String[] args) {

		Car porsche = new Car();
		
		porsche.setModel("911");
		
		String model = porsche.getModel();//store your get method value/s in a variable. such as model
		//and then print model.
		
		System.out.println(model);
		
		//OR
		
		System.out.println(porsche.getModel());
		
		System.out.println("------------------------");// This part below is for TaskEncapsulation
		
		TaskEncapsulation mikeAccount = new TaskEncapsulation();
        mikeAccount.setAccountNumber("5555555");
        mikeAccount.setBalance(2.5);
        mikeAccount.setCustomerName("mike");
        
        mikeAccount.withdrawal(100.0);
        
        mikeAccount.deposit(150.000);
        mikeAccount.withdrawal(50.0);
        
        System.out.println(mikeAccount.getCustomerName());
		
		
		
		

	}

}
