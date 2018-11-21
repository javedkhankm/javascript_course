
public class Student_Main {

	public static void main(String[] args) {
		
		Students student1 = new Students("Paul", 30, "Male", 9, "Java");
		
		System.out.println(student1.name + "|" + student1.age + "|" + student1.gender + "|" + 
		student1.session + "|" + student1.language + "|" + Students.school);
		
		student1.attendLecture();
		student1.submitAssignment();
		student1.attendLab();
		
		System.out.println("---------------------------------------");
		
		Students student2 = new Students("Mark", 50, "Male", 11, "JavaScript");
		
		System.out.println(student2.name + "|" + student2.age + "|" + student2.gender + "|" + 
		student2.session + "|" + student2.language + "|" + Students.school);
		
		student2.attendLecture();
		student2.submitAssignment();
		student2.attendLab();
		
		
		

	}

}
