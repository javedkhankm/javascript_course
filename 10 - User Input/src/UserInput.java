import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
//		System.out.println("Enter a byte value");
//		
//		byte b1 = scanner.nextByte();
//		
//		System.out.println("Enter a short value");
//		short s1=scanner.nextShort();
//		
		System.out.println("Enter a int value");
		int i1=scanner.nextInt();
//		
//		System.out.println("Enter a boolean value");
//		boolean bool=scanner.nextBoolean();
//		
//		System.out.println(b1 + "|" + s1 + "|" + i1 + "|" + bool);
		
		scanner.nextLine(); //Whenever you use nextByte, nextBoolean, nextShort and after these if you try
		//String str = scanner.nextLine();, you will not be able to enter the string value. So in this case
		//you better add scanner.nextLine();
		
		System.out.println("Enter your name");
		
		String str = scanner.nextLine();
		
		System.out.println("My name is : " + str);
		
		scanner.close(); //Its a recommended practice to close the object "scanner" after you have used and
		//you do not need it anymore.
		
		
		
		
		

	}

}
