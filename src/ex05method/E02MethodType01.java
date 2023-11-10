package ex05method;

public class E02MethodType01
{
	
	
	/*
	 * 함수(Method) = 하나의 업무를 처리하기 위한 부속품(모듈) 
	 * 1. 반드시 class 내부에 정의해야한다 
	 * 2. method안에 method를 정의할 순 없다, 에러생김 
	 * 3. 반환값이 없으면 반드시 void를 명시해야한다
	 * 4. 함수명 
	 * 5. 메서드는 변수처럼 소문자로 시작한다(카멜표기) 
	 * 6. 상수명은 전체를 대문자로 기술, 단 연결단어는_(언더바)로 구분
	 * 7. 패키지명은 전체를 소문자로 쓰고, 연결단어는.(닷)으로 구분
	 */	
	
	
	static void menuPrint() {
		System.out.println("=======메뉴를 선택하세요======");
		System.out.println("==1.열기, 2.계속하기, 3.종료==");
		System.out.println("==============================");
	}
	
	static void returnError() {
		int returnValue = 13;
		System.out.println("[Return문 이전]");
		
//		return; << 주석처리 하지 않을 시 에러발생
		
		if (returnValue%2==0)
		{
			System.out.println(returnValue + "는 짝수");
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
		
		
	}
	
	public static void main(String[] args)
	{
	menuPrint();
	returnError();
	}
	
	
	
	
	
}
