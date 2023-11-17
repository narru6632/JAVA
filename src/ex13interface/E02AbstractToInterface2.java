package ex13interface;

//프로젝트 전체에서 기준의 역할을 함
interface IPersonalNumberStorageAbs {
	
	/*
	해당 클래스는 추상 메서드를 포함하고 있으므로 하위에서 상속받게 되면
	반드시 추상메서드를 오버라이딩한다
	*/
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}

/*
DTO(=Data Trnasfer Object) : 데이터를 저장하고 전송하기 위한 용도의 객체를 말함.
 	Vo(Value Object)로 표현하기도 한다. 해당프로그램에선 한 사람의 정보를 저장
 	하는 용도로 사용된다
*/
//구분하기 쉽게 DTO/Dto붙여주기(대소문자 상관없으나 통일되도록)
class PersonalInfoVO{
	
	//이름과 주민번호를 멤버변수로 정의();
	private String name;
	private String juminNum;
	
	//멤버 변수 선언 후 자동생성
	//아래줄 우클릭-source- ~~~Generate Constructor using field~~선택
	// ㄱ 알아서 이렇게 만들어줌
	public PersonalInfoVO(String name, String juminNum)
	{
		super();
		this.name = name;
		this.juminNum = juminNum;
	}
	//getter / setter 메서드 : DTO객체에서 private로 선언된 변수 접근/입력을 위해 사용
	//아래줄 우클릭-source- ~~~Generate getter and setter~~선택
	//필요한거 체크 후 생성, 일일히 치면 오류나고 찾기힘듬
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getJuminNum()
	{
		return juminNum;
	}

	public void setJuminNum(String juminNum)
	{
		this.juminNum = juminNum;
	}
}
//상속을 통해 추상메서드를 포함하게 되므로 반드시 아래와 같이 오버라이딩을
//해야한다. 이는 필수사항이며 어길 시 에러가 발생함


class PersonalNumberStorageImpl implements IPersonalNumberStorageAbs{
	
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}
	
	@Override
	public String searchPersonalInfo(String juminNum) {
		//저장된 객체의 갯수만큼 반복
		for(int i=0; i<numOfPerInfo;i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
			{
				return personalArr[i].getName();
			}
		}
		return null;
	}
	
}




public class E02AbstractToInterface2
{
	public static void main(String[] args)
	{	//정보저장용 객체 생성
		PersonalNumberStorageImpl storage = 
				new PersonalNumberStorageImpl(10);
		//2개의 정보를 추가
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		//정보검색 및 확인
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("901024-1090333"));
		//ㄴ 정보없음 -> null로 출력
	
	}
}
