package ex06array;

public class E05TwoDimArray01
{
	public static void main(String[] args)
	{
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		int[] arr2 = new int[5]; //1 차원배열 생성
		arr2[0] = 1;//0번 원소만 초기화
		
		for(int i=0; i<arr.length; i++) {
		System.out.println("배열2가 가진값 출력(arr):"+arr2);
		}
		for(int i=0; i<arr.length; i++) {
		System.out.println("배열의 세로크기:"+arr[i].length);
		System.out.println("배열이 가진값 출력(arr):"+arr);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기:%d\n",i,arr[i].length);
			System.out.printf("%d행의 크기:%s\n",i,arr[i]);
		}
		
		System.out.println("배열  출력하기");
		System.out.println("arr[0][1]="+arr[0][1]);
		System.out.println("arr[0][3]="+arr[0][3]); //예외발생, (주소도 데이터도 없는 곳 = 호출불가)
		
		
		
	}
}
