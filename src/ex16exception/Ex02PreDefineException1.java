package ex16exception;

import java.util.InputMismatchException;

public class Ex02PreDefineException1
{
	public static void main(String[] args)
	{
		//배열의 인덱스를 벗어난 경우 발생
		System.out.println("### ArrayIndexOutOfBoundsExceiption ###");
		
		//크기가 2인 배열
		int[] intArr = new int[2];
		
		
		//예외발생 지역을 try문으로 묶어준다
//		예외가 발생되면 JVM(자바가상머신)은 해당예외에 관련된 객체를 만들어
//		프로그램쪽으로 전달(throw)한다, 이떄 catch절에서 예외객체를 잡아주는것을 예외처리라고함
//		
		try {
			intArr[0] = 100;
			System.out.println("0번방은:"+intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은:"+intArr[0]);
			intArr[2] = 300;
			System.out.println("이방은??:"+intArr[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			// JVM이 throw한 예외객체를 catch절에서 잡아 처리함
			System.out.println("예외가 발생했어요");
			System.out.println("예외발생메세지"+e.getMessage());
			e.printStackTrace();
		}
		
		//예외처리를 해도 실행의 흐름이 중단되진 않으므로 아래문장들 정상출력됨
		System.out.println("0번방 재출력:"+intArr[0]);
		System.out.println("### ArrayIndxOutOfBoundsException 발생 후 ###");
		
		
		
		
		
	}
}
