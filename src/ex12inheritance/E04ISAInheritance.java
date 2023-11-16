package ex12inheritance;

//	Is-A관계
//	 Z is a X -> Z는 X의 일종이다로 표현 가능한 관계
//	ex) 노트북은 컴퓨터의 일종이다 // 로 성립되는 관계는 상속으로 표현하기 적합
class Computer
{
	String owner; //멤버변수
	
//	public Computer() {} // 디폴트 생성자, 개발자가 생성자 추가시 안생김

	public Computer(String name) // 인수 생성자 (개발자가 추가한 생성자)
	{
		owner = name;
	}

	
	//private로 지정된 멤버 메서드는 외부/상속받은 클래스에서 접근불가
	//public 메서드를 통해 간접호출하거나 protected로 선언된 메서드로 호출(상속한정)
	private void keyboardTouch()
	{
		System.out.println("키보드를 통해서 입력한 ");
	}

	private void calculate() 
	{
		System.out.println("요청된 내용을 계산한다.");
	}

	public void calculateFunc()//private 간접호출
	{
		keyboardTouch();
		calculate();
	}
}


//컴퓨터 상속한 노트북컴퓨터 (상속1회차)
class NotebookComputer extends Computer
{

	int battary; //자식클래스 기능확장을 위해 정의된 멤버변수

	public NotebookComputer(String name, int initCharge)
	{
		super(name); // 항상 super먼저 생성, 디폴트 super는 생략가능하나
					//default가 아니라 직접 지정해야할시 super위에 문장이 오면 에러발생
		battary = initCharge;
	}

	public void charging()//충전을 의미하는 멤버메서드
	{
		battary += 5;
	}

	public void movigCal()
	{
		if (battary < 1)
		{
			System.out.println("배터리가 방전되어 사용불가");
			return; // 메서드에서 리턴 = 종료
		}
		System.out.println("이동하면서 ");
//		keyboardTouch(); //private라 
//		calculate(); //호출불가능, 접근가능한 public메서드로 간접호출 필요
		calculateFunc();//그게 이것

		battary -= 1;
	}
}


//노트북의 하위 클래스인 테블릿 노트북 (상속2회차)
// 컴퓨터기능+노트북기능+펜(추가할 멤버변수)
class TableNotebook extends NotebookComputer
{

	String registPencil;//자식클래스(2)에 추가된 멤버변수

	public TableNotebook(String name, int initCharge, String pen)
	{
		super(name, initCharge);//두개의 값을 부모로 전달한다(부모생성자 호출)
		registPencil = pen;//한개는 자신의 멤버변수 초기화
	}

	public void write(String penInfo)
	{
		if (battary < 1)
		{
			System.out.println("배터리가 방전되어 사용불가");
			return; //메서드 종료
		}
		
//		A.comperTo(B) a와 v를 비교하여 같은문자열이면 0반환, 
//		1/-1이 반환되면 다른문자열로 판단하는 String클래스에 정의된 메서드
		if (registPencil.compareTo(penInfo) != 0)
		{
			System.out.println("등록된 펜이 아닙니다.");
			return; //메서드종료
		}
		
//		부모클래스에 정의된 메서드를 호출, 자식클래스는 이렇게 부모의 멤버메서드를
//		호출하여 자신의 기능처럼 사용가능
//		단, 접근가능한 접근지정자여야 한다
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -= 1;
	}
}

public class E04ISAInheritance
{
	public static void main(String[] args)
	{
		NotebookComputer noteBook = new NotebookComputer("r공유", 5);
		TableNotebook tablet = new TableNotebook("이동욱", 5, "ISE-1234");
				
		System.out.println("===노트북컴퓨터사용===");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();//배터리 차감중
		noteBook.movigCal();//방전
		noteBook.movigCal();
		noteBook.movigCal();
		
		System.out.println("==ISE-1234 펜으로 테블릿 사용==");
		tablet.write("ISE-1234");
		System.out.println("==XYZ-9876 펜으로 테블릿 사용==");
		tablet.write("XYZ-9876");
		
	}
}
