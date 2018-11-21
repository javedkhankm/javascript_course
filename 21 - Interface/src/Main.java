
public class Main {

	public static void main(String[] args) {

		//DeskPhone mikePhone = new DeskPhone(303030303, true);
		
		ITelephone mikePhone = new DeskPhone(303030303, true);
		
		mikePhone.powerOn();
		
		mikePhone.callPhone(303030303);
		
		mikePhone.answer();

	}

}
