package ex12inheritance;

/*
상속
기존에 정의된 클래스에 메서드와 변수를 추가하여 새로운 클래스를 정의
부모 클래스를 자식클래스가 상속할떄는 extends키워드를 사용
*/

//부모(상위)클래스 : 사람의 일반적인 형태를 추상화
class Man{
	// 멤버 변수는 private이므로 클래스 내부에서만 접근 가능
	private String name;
	
	// 생성자는 오버로딩을 통해 2개 정의한다
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man클래스 인자 생성자 호출됨");
	}
	//멤버메서드정의
	public void tellYourName() {
		System.out.println("내 이름은 "+ name+" 입니다.");
	}
}

//자식(하위)클래스 : Man클래스를 상속받아 회사원을 추상화 한다
class BusinessMan extends Man{
	
	//멤버변수로 회사명, 직급을 선언한다
	private String company;
	private String position;
	
	
	//생성자 : 멤버변수는 2개지만 매개변수는 3개로 선언한다.
	public BusinessMan(String name, String company, String position) {
		/*
		상속받은 자식클래스는 부모클래스의 생성자를 호출하여 부모
		객체가 먼저 메모리에 생성되도록 해야한다
		super()는 부모클래스의 생성자를 호출하는 
		*/
		super(name);
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은"+company+"입니다.");
		System.out.println("직급은"+position+"입니다.");
//		System.out.println("이름은"+name+"입니다.");
		tellYourName();
	}
}


public class E01BusinessManMain
{
	public static void main(String[] args)
	{
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}
}
