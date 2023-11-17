package ex13interface;

//추상클래스
//오버라이딩목적 제작
//메서드의 실행부가 없으므로 {}대신 ;를 붙여 마무리함
/*
상속을 목적으로 제작되므로 객체생성을 허용하지 않음
추상클래스는 대부분 추상메서드를 오버라이딩 해야한다
클래스의 상속관계에서 설계도와 같은 역할
객체생성은 할 수 없으나 그 외 참조변수, 상속등의 모든 기능을 사용할 수 있다
*/
abstract class AbsClass1{
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	void instanceMethod() {}
	static void staticMethod() {}
}
class AbsClassChild1 extends AbsClass1{
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}
abstract class AbsClass2{
	abstract void absMethod(int number);
}
class AbsClassChild2 extends AbsClass2{
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라이딩");
	}
	void newMethod() {
		System.out.println("확장한 메서드");
	}
}

public class E01AbstractMain
{
	public static void main(String[] args)
	{
		AbsClass1 absClass1 = new AbsClass1();
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		((AbsClassChild2)absClass2).newMethod();
		
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값:"+AbsClass1.MAX_INT);
		
		
	}
}
