package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;
//다른패키지에서 생성된 클래스는 임포트 필요

public class E01AccessModifierMain
{
	public static void main(String[] args)
	{
		
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		//동일한 패키지내에서 생성된 클래스 이므로 import 없이 호출가능
		E01AccessModifier1 one = new E01AccessModifier1();
		
//		System.out.println("one.privateVar="+one.privateVar); //private는 다른클래스에서 호출불가
		System.out.println("one.defaultVar="+one.defaultVar);
		System.out.println("one.publicVar="+one.publicVar);
//		one.privateMethod(); // 다른클래스이므로 private호출 x
		one.defaultMethod();
		one.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		///////////////////////////////////////////
		System.out.println();
		
		System.out.println("E01AccessModifer2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
//		System.out.println("two.privateVar="+two.privateVar);
//		System.out.println("two.defaultVar="+two.defaultVar);
		System.out.println("two.publicVar="+two.publicVar);
//		two.privateMethod();//다른패키지+다른클래스
//		two.defaultMethod();//다른패키지
		two.publicMethod();	//누구나 사용가능
		
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc();//다른패키지, 접근불가
		
		
		
	}
	
}
