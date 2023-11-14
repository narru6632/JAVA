package ex08class;

class Person{
	//멤버 변수
	// 클래스에서 주로 속성(데이터)를 표현한다
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	// 멤버메서드
	// 넓은지역(클래스)에서 생성된 멤버변수는 좁은지역(멤버메서드)에서 사용할 수 있으므로
	// 별도의 전달 없이 아래와 같이 출력문에서 사용할 수 있다.
	// 주로 .(닷)을 이용해 호출함
	void eat() {
		System.out.printf("%s이(가)식사를 한다=\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s이(가) 잠자고 있다\n",
				age, name);
	}
}

public class E01PersonMain
{
	public static void main(String[] args)
	{
//		Person클래스를 통해 객체(인스턴스)를 생성한다. 생성시 할당된 주소값을 반환,
//		좌측의 참조변수(person)가 그 값을 저장한다
		Person person = new Person();// new Person<<인스턴스화라고 표현함
									// new 'Person' << 객체
		
//		1.객체의 참조변수를 통해 멤버메서드를 호출
		person.eat();
		person.sleep();
		
//		2.객체 생성 직후 참조변수를 저장하지 않고도 멤버변수를 부를 수 있다.
		new Person().eat();
		new Person().sleep();
	}
	
}
