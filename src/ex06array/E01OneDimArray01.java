package ex06array;

public class E01OneDimArray01
{
	public static void main(String[] args)
	{
		int[] numArr = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
		System.out.println("numArr의 0번방의 값: "+numArr[0]);
		System.out.println("numArr의 1번방의 값: "+numArr[1]);
		System.out.println("numArr의 2번방의 값: "+numArr[2]);
		System.out.println("배열명(numArr)="+numArr);
		System.out.println("================================");
		
		
		int[] arrNumber = new int[40];
		for(int i=0; i<arrNumber.length; i++) {
			System.out.println(i+"번방의값="+arrNumber[i]);
		}
		System.out.println("================================");
		
		//객체배열
//		기본자료형을 저장하는 배열이 아닌 객체의 참조값을 저장할 목적으로 생성된 배열
		//아파트처럼 동, 호수의 2개의 주소값이 필요함
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("================================");
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1 : 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0]=100;
		System.out.println("initArr[0]="+initArr[0]);
		
		
		System.out.println("방법2 : 배열의 선언과 동시에 초기화");
//		int[] initArr2 = new int[3] {1, 20, 300}; 
		//배열의 크기를 정해준다음, 선언까지 동시에 해주면 에러가 발생
		int[] initArray2 = new int[] {1, 20, 300};
		
		
		
		System.out.println("방법3 : 초기값만으로 선언");//배열크기는 알아서 맞춰줌
		int[] initArr3 = {11, 13, 17, 19, 23};//int new[]를 생략해버림
		int arrSum = 0;
		for(int x = 0; x<initArr3.length;x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의합은="+arrSum);
		
		
	}
}
