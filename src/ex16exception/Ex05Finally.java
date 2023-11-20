package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05Finally

//fianlly 절
/*
예외발생과 상관없이 try문으로 진입했을때 반드시 실행해야 할 코드가
있는경우 기술하는 블럭이다. 즉 try문으로 진입되지 않는다면 finally절은 실행되지 않는다

try-catch : 예외를 직접처리할 떄
try-catch-finally : 예외를 직접 처리 후 실행할 문장이 있을때
try-finally : 예외는 외부로 던지고 예외발생과 상관없이 실행할 문장이 있을때
 */
{
	static void runtime() throws NumberFormatException
	{
		Integer.parseInt("백");
	}
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 :");
		int age = -1;
		try {
			age = scan.nextInt();
			System.out.println("당신은 5년 후 "+(age+5)+"살 입니다.");
			return;
			//return이 있어도 finally절이 있으면 finally절은 실행하고 종료됨
			//system.exit(0) 는 finally도 무시하고 프로그램을 끝내버린다
		}
		catch(InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요");
		}
		finally {
			System.out.println("항상 실행되는 finally절 입니다.");
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		try {
			runtime();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		tryCatchFinally(); 
		
		//finally 에서 exit(0)가 실행되므로 아래 문장은 출력되지 않음		
		System.out.println("메인메소드 끝");
	}

}
