package array_max;

public class array_max {

	public static void main(String[] args) {
		int []array = {10, 20, 30};
		int a = array[0];
		
		for (int i = 0; i<array.length; i++) {
			
			if (array[i]>a)
				a = array[i];
			
			//array [0] = 10 >10 --- >no a old value is 10
			//array [1] = 50 >10 --- >yes a new value is 50
			//array [2] = 30 >50 --- >no
		}
		
		System.out.println("The greatest value inside the array is " +a);
  } 
	
}
