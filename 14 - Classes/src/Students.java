
public class Students {
	
	public String name;
	public int age;
	public String gender;
	public int session;
	public String language;
	public static String school = "Cybertek";
	
	
	public Students(String name, int age, String gender, int session, String language) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.session = session;
		this.language = language;

	}

	public void attendLecture() {
		
		System.out.println(name + " attending lectures at " + school);
	}
	
	public void submitAssignment() {
		
		System.out.println(name + " submitting assignment to " + school);
	}
	
	public void attendLab() {
		
		System.out.println(name + " attending lab at " + school);
	}
	
	

}
