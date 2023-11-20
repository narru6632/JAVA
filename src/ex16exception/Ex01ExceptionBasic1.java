package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1
{
	public static void main(String[] args)
	{
		/*
		 * Systax에러(구문에러)
		Int number = 10;
		if(true);
		{}
		else
		{}
		*/
		
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		
		//외부자원을 사용할때 발생하는 예외
		/*
		처리방법 1>' 예외던지기'를 수행
			main메서드에 throws IOException 이와같이 기술하면 해당 메서드 내에서는
			예외를 무ㅅ한다는 의미가 됨
		처리방법 2> 직접 try / catch문으로 직접 예외를 처리한다
		*/
		
		System.out.println("문자하나를 입력하세요:");
		try
		{
			int iChar = System.in.read();			
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
