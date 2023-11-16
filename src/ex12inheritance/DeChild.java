package ex12inheritance;


//하위클래스 : DeParent의 기능을 상속해 확장
public class DeChild extends DeParent
{
	//하위가 확장한 멤버변수
	String stNumber;
	
	public DeChild(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	public void study() {
		System.out.println(getName() + "이(가) 공부한다.");
	}//private변수 값이 필요해 상위 클래스에 만들어 놨던 getter메서드 호출
	
	//@@@@@@@@@@@@오버라이딩 아님@@@@@@@@@@@@@
	//:부모클래스에서 private선언해두어 보이지 않아 오버라이딩 대상이 아니게됨
	//자식쪽이 새로 확장한 메서드로 보면 됨
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	@Override
	public String sleep() {
		System.out.println("학생이 잔다");
		return null;
	}
	public int walk(int age) {//매개변수가 바뀌어서 오버라이딩이 아닌 오버로딩
		System.out.println("나이가 "+age+"살인 학생이 산책한다.");
		return 0;
	}
	
	@Override
	public void exercise() {
		System.out.println("학생이 운동한다.");
	}
	
	@Override
	public void printParent() {
		super.printParent();
		System.out.printf(", 학번:%s\n", stNumber);
	}
	
	
	//static 메서드는 오버라이딩의 대상이 될 수 없다
	//클래스 외부(메서드 영역)에 미리 로딩되므로 오버라이딩 대상이 아님
	//따로 호출해서 쓸것
	public static void staticMethod() {
		System.out.println("학생의 정적메서드");
	}
}
