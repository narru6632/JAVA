package ex12inheritance;

/*
AnimalDog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할 것
*/
public class AnimalDog extends Animal
{
	String dogKind;
	String name;
	public AnimalDog (String species, int age, String gender, String dogKind, String name) {
		super(species, age, gender);
		//반드시 부모클래스의 객체를 먼저 생성
		//super()로 부모클래스의 생성자 메서드를 호출함
		this.dogKind = dogKind;
		this.name = name;
		//그다음 자신의 멤버변수를 초기화
	}
	void bark() {//부모 클래스의 species멤버 변수가 private라 접근이 안되므로
		System.out.printf("이름이 %s이고 종이 %s인 개가 짖는다.",this.name,getSpecies());
	}			//미리 만들어둔 public으로 선언된 getter 메서드를 이용해 접근한다
	void showDog() {
		super.showAnimal();
		System.out.println("개의 품종은 " + dogKind + "입니다");
		System.out.println("개의 이름은 " + name + "입니다");
		
	}
}

