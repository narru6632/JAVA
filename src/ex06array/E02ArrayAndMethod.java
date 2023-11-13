package ex06array;

public class E02ArrayAndMethod
{
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		//선언과 동시에 초기화
		int[] ref;
		//선언만 함
		System.out.println("초기화 직후 출력");
		
		System.out.println("arr변수:"+arr); //참조값(주소) 확인
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " "); // 1,2,3,4,5 출력
		}
		System.out.println();

		ref = addAllArray(arr, 7);//ref가 함수 addAllArray의 영향을 받아 같은주소값을 배정받고
									//해당 주소 객체값을 +7 해버린다

		System.out.println("메소드 호출후 출력");
		for (int i = 0; i < ref.length; i++)
		{
			System.out.print(ref[i] + " "); // ref 8,9,10,11,12 출력
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " "); // arr 8,9,10,11,12 출력
		}
	}

	static int[] addAllArray(int[] ar, int addVal)
	{
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] += addVal;
		}
		return ar;
	}

}
