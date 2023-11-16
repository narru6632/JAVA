package ex12inheritance;

public class DeParent
{
	//멤버변수 : 개인정보 은닉을 위해 private처리
	private String name;
	private int age;

	//생성자 : 디폴트와 인수 둘다 정의함
	public DeParent() {}
	public DeParent(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//getter메서드 : 프라이빗값 외부로 빼내기 위함
	public String getName() {
		return name;
	}
	
	/*
	아래 정의된 멤버메서드는 4가지 접근지정자를 통해 선언
	차후 자식클래스에서 접근여부 확인할것
	*/
	private void eat()//private < 하위클래스 접근불가 = 오버라이딩 불가
	{
		System.out.println("부모님이 드신다");
	}
	String sleep() {
		System.out.println("부모님이 주무신다");
		return null;
	}
	protected void walk()
	{
		System.out.println("부모님이 산책하신다");
	}
	public void exercise()
	{
		System.out.println("부모님이 운동하신다");
	}
	
	
	//정보출력용 메서드, 단순멤버 변수 출력
	public void printParent() {
		System.out.printf("성함:%s, 연세:%d", name, age);
	}
	public static void staticMethod() {
		System.out.println("부모님의 정적메서드");
	}
	
	
	
}
