package ex16exception;

import java.util.*;

public class Ex02PreDefineException4 {
	 
	static Date toDay;
	
	public static void main(String[] args)  {	
		
		System.out.println("### NullPointerException ###");
		/*
		참조변수가 null인상태에서 출력하면 toStirng()메서드를 통해
		문자열 형태의 null이 출력된다. 예외가 발생하진않는다
		*/
		System.out.println("toDay="+ toDay);
		try {		
			/*
			인스턴스 변수만 생성하고, 참조할 객체가 없는 경웅에 메서드를 호출하면
			예외가 발생한다.
			*/
			System.out.println(toDay.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
				 
	}////end of main	
	 
}