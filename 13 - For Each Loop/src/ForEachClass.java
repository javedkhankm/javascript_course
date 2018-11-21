
public class ForEachClass {

	public static void main(String[] args) {
		
		int [] marks = {125, 132, 95, 116, 110};
		int highest_marks = maximum(marks);
		System.out.println(highest_marks);

	}
	
	public static int maximum (int[] array) {
		
		int max = array [0];
		
		for (int num : array) {
			
			if(num>max) {
				
				max = num;
			}
			
		}
		
		return max;
	}

}
