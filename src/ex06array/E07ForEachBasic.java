package ex06array;

public class E07ForEachBasic
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("기본for문을 이용한 합계: "+sum);
		
		sum = 0;
		
		for(int e: arr) { //for_each문, 배열복사, 반복할 변수 e가 배열 arr 각각의 요소가 됨
			System.out.print(e+" "); // 복사시 주소값을 따로 할당받으므로 수정해도 원본에 영향x
				sum += e;
		}
		System.out.println("\nfor_each문을 이용한 합계: "+sum);
		
		System.out.println("배열arr의 요소값 1 증가시키기");
		for(int b : arr) {
			b++;
			System.out.print(b+" "); //1증가된 값이 출력됨
		}
		System.out.println();
		System.out.println("배열 arr의 요소 재출력하기");
		for(int c : arr) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		System.out.println("2차원 배열을 foreach문으로 출력하기");
		int[][] twoDim = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400}
		};
		for(int[] a : twoDim) { //2차원용 for_each문
			for(int b : a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
