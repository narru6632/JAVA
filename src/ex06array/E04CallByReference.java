package ex06array;

public class E04CallByReference // 참조값 호출
{
	public static void main(String[] args)
	{
		
		//메서드 호출시 참조값만 전달해서 다른지역에서도 동일한 메모리(힙영역)을 참조할수 있게
//		하는 호출방식, 참조값만 전달되므로 프로그램의 퍼포먼스(성능)향상 + 메모리 절약
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap전 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		callByReference(arr);
		
		System.out.println("[메인메소드]-Swap후 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" "); // 배열은 그대로라도 함수에서 참조(주소)값을 참조하여 값을
											//바꾸어 놓았으므로 배열 데이터값이 바뀐다
		}
	}
	
	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		System.out.println("[callByReference메소드]-Swap후 출력");
		for(int i=0; i<ref.length;i++) {
			System.out.println(ref[i]+" ");
		}
	}
	
	
	
}
