package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PreDefineException3
{
	public static void main(String[] args)
	{
		System.out.println("### IntputMissmatchException ###");
		Scanner sc = new Scanner(System.in);
		try {
			//정수가 아닌 문자 입력시 예외발생
			System.out.println("나이를 입력하세요 : ");
			int intAge = sc.nextInt(); // 예외발생지역
			int ageAfter10 = intAge+10;
			System.out.println("당신의 10년후 나이는 : "+ ageAfter10);
		}
		catch(InputMismatchException e){ //발생시 실행
			System.out.println("나이를 문자형태로 입력하면 안됩니다");
			System.out.println("예외메세지 : "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
