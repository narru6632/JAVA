package ex06array;

public class E06Arraylnit
{
	public static void main(String[] args)
	{
		System.out.println("배열 선언후 초기화 하지 않은상태");
		int[] arr = new int[3];
		System.out.println("arr[0]="+arr[0]); //0출력
		
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0]="+arr2[0][0]);//0출력
		
		System.out.println("배열 선언과 동시에 초기화 한 상태");
		int[] arrDim = {1, 2, 3};
		System.out.println("arrDim[0]="+arrDim[0]);//1출력
		
		int[][] arrDim2 = { //2차원 배열은 가장 큰 행에 크기가 맞춰 지므로 
				{1},  //  [1],[null] 부족한 자리는 null로 채워져 
				{2,3} //  [2],[3] 의 형태가 된다
		};
		System.out.println("arrDim[0][0]="+arrDim2[0][0]);
		System.out.println("arrDim[0][0]="+arrDim2[0][1]); // null값있는 곳이라 런타임에러발생
		
	}
}
