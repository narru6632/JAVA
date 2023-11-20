package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자 정의 예외클래스
 1.Exception 클래스를 상속한다
 2.생성자에서 예외발생시 출력할 메세지를 super()를 통해 입력한다
 3.예외발생지점에서 if문으로 감지한 후 예외객체를 생성 및 throw한다
 4.catch문에서 예외객체를 받아 예외처리한다.
 */


class AgeErrorException extends Exception{
	public AgeErrorException() {
		super("나이입력이 잘못되었어요");
	}
}

public class Ex06DeveloperDefine2
{
	public static void main(String[] args)
	{
		System.out.println("나이를 입력하세요 : ");
		try {
			int age = readAge();
			System.out.println("당신의 나이는"+age+"입니다.");
		}
		catch(AgeErrorException e) {
			System.out.println("[예외발생]"+e.getMessage());
		}
	}
	
	public static int readAge() {
		int inputAge = 0;
		//문자입력시 발생되는 예외처리
		try {
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//나이를 음수로 입력한경우 즉시 예외처리(개발자정의)
		try
		{
			if(inputAge<0) {
				AgeErrorException ex = new AgeErrorException();
				throw ex;
			}
			
		} catch (AgeErrorException2 e)
		{
			System.out.println(e.getMessage());
		}
		return inputAge;
	}
	
	
	
	
	
	
	
}
