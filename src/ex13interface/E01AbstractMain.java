package ex13interface;

//추상클래스(abstract class)
//오버라이딩목적 제작
/*
상속을 목적으로 제작되므로 객체생성을 허용하지 않음
클래스의 상속관계에서 설계도와 같은 역할
추상클래스는 대부분 추상메서드를 포함
객체생성은 할 수 없으나 그 외 참조변수, 상속등의 모든 기능을 사용할 수 있다
*/

//추상메서드
//역시 오버라이딩 목적으로 제작
//메서드의 실행부가 없으므로 {}대신 ;를 붙여 마무리함
//상속받은 클래스는 추상메서드를 오버라이딩 해야함



//1. 추상메서드를 포함하지 않은 추상클래스 << 오버라이딩  = 선택사항
abstract class AbsClass1{
	public static final int MAX_INT = Integer.MAX_VALUE;
	//ㄴin로 표현가능 한 최대값을 반환하는 Wrapper클래스의 상수
	void instanceMethod() {}
	//ㄴ멤버메서드
	static void staticMethod() {}
	//ㄴ정적 멤버메서드
}


class AbsClassChild1 extends AbsClass1{
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	} // 부모에 추상메서드가 없으므로 위 오버라이딩은 삭제해도 무관함(에러x)
}


//2. 추상메서드가 포함된 클래스 < 반드시 abstract class 로 선언
abstract class AbsClass2{
	abstract void absMethod(int number);
	//추상메서드<<{}없음
}
class AbsClassChild2 extends AbsClass2{ 
	@Override // 추상메서드 상속받았으니 abstract로 선언해야하나
	void absMethod(int number) { // 그러면 객체생성이 막히므로 이를 피하자면
		System.out.println("필수 오버라이딩");//추상메서드를 오버라이딩하면 됨
	}
	void newMethod() {
		System.out.println("확장한 메서드");
	}
}

public class E01AbstractMain
{
	public static void main(String[] args)
	{
//		AbsClass1 absClass1 = new AbsClass1(); <<추상클래스라 객체생성불가
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		((AbsClassChild2)absClass2).newMethod(); //자식메서드에 접근하기위한 다운캐스팅		
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값:"+AbsClass1.MAX_INT);
		
		
	}
}
