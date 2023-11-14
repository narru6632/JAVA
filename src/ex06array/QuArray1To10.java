package ex06array;

public class QuArray1To10 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			sum += array[i];
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("배열전체요소의합 : "+sum);
		
		
		
		
		
		
		
	}
}
