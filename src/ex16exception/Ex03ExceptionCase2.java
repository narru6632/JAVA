package ex16exception;

import java.io.IOException;

public class Ex03ExceptionCase2
{
	static void compileFunc()
	{
		//예외처리방법2
		/*
		예외가 발생한 지점에서 예외를 직접처리, 개발시 가장 많이 사용
		try-catch문을 통해 예외가 발생할 수 있는 지점을명시적으로알수있음
		*/
		
		//강사님이 뭘 잘못했는지 예외가 발생하지 않음
		try {
			System.out.println("하나의 문자를 입력하세요:");
			int userChr = System.in.read();
			System.out.println("입력한 문자는 : "+(char)userChr);
		}
		catch(IOException e) {
			e.printStackTrace();//직접처리
		}
	}
	public static void main(String[] args)
	{
		compileFunc();
	}
}
