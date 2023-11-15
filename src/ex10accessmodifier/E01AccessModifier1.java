package ex10accessmodifier;

class DefaultClass1{
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메서드 호출");
	}
}

public class E01AccessModifier1
{
	//멤버 변수 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	//동일 클래스 내에서는 private도 모두 사용가능하므로
	//접근지정자의 제약을 받지 않는다
	//멤버 메서드
	private void privateMethod() {
		privateVar = 100; //사용가능
		System.out.println("privateMethod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 200; //사용가능
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateVar = 300; //사용가능
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
	
	
}
