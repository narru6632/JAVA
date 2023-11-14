package ex08class;

public class PersonConstructor
{
	/*
	클래스를 객체화(인스턴스화)할 때 자동으로 호출되는 메서드
	자동으로 호출되며 개발자가 임의로 호출 x
	반환값이 없음
	그 외엔 메서드가 가지는 특징을 모두 가짐
	 */

	String name;
	int age;
	String addr;
	//생성자 메서드 형태
	//public PersonConstructor(){} 바로 아래에 있으므로 생성 불가
	
	public PersonConstructor () { // 고정된 값으로 메서드 변수를 초기화 해주는 기본생성자를 만듦
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자입니다.");
	}
	
	//생성자 1 매개변수가 없는 형태로 정의
	public PersonConstructor (String name) {
		//this<< 멤버변수와 매개변수를 구분하기 위한 용도, 클래스 그 자신을 뜻함
		//this.name = 멤버변수 / name; 매개변수
		this.name = name;
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1]입니다.");
	}
	
	//생성자2: 인자(인수)생성자로 정의함
	public PersonConstructor(String name, int age) {
//		this()는 생성자에서 다른 생성자를 호출할때 사용
//		단, 생성자 내에서만 사용할 수 있고 일반 멤버 메서드에서는 사용 불가
//		즉 아래의 코드는 매개변수가 3개인 생성자를 호출
//		해당코드는 생성자 내에서만 사용가능
//		생성자는 객체생성시 딱 한번만 호출되고 개발자가 임의로 호출할 수 없다
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2]입니다");
	}
	
	
	public PersonConstructor(String _name, int age, String addr) {
//		매개변수와 멤버변수명이 다르면 굳이 this를 사용하지 않음
		name = _name;
//		같으면 this를 사용하도록 권고됨
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3]입니다");
	}
	
//	멤버메서드 : 멤버변수 초기화를 목적으로 생성
	void initialize(String name, int age, String addr) {
//		멤버메서드는 개발자가 원할떄 언제든 호출 가능하므로
//		생성자와는 용도와 특성이 다르다, 따라서 멤버메서드에서는 생성자 호출이 불가능하다
//		일반함수에서는 사용할 수 없다
		
//		this(name, age, "미상"); // 따라서 에러발생
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}	
		//객체 확인용 멤버메서드
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n", this.name);
		System.out.printf("나이:%d\n",age);
		System.out.printf("주소:%s\n",addr);
	}
	


	
	
}
