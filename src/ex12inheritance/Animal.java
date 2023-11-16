package ex12inheritance;

/*
Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.

*/
public class Animal
{
	private String species; // 특별한 연산이 없다면 대부분의 멤버변수는 String으로정의
	public int age;
	public String gender;

	public Animal(String species, int age, String gender) // 생성자
	{
		//super(); // 함수 자동생성시 Object클래스로부터 자동으로 상속받음, 생략가능 
		this.species = species;
		this.age = age;
		this.gender = gender;
	}

	void showAnimal() // 현재 상태를 출력하는 멤버메서드
	{
		System.out.println("동물의 종류는 " + species + "입니다");
		System.out.println("동물의 나이는 " + age + "살 입니다");
		System.out.println("동물의 성별은 " + gender + "입니다");
	}
	
	//private 멤버 변수 species는 자식클래스에서 접근이 안되므로
	// getter 메서드로 출력할수 있게 장치해준다 (값설정은 setter메서드)
	public String getSpecies() {
		return species;
	}
}

