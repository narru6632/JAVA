package ex12inheritance;

//class A{}
//class B extends A{}
/*
  => 이 경우 클래스 A, B에는 생성자를 정의하지 않았으므로 디폴트
  생성자가 컴파일러에 의해 추가된다. 따라서 위 코드는 정상적으로 
  실행되고 객체 또한 문제없이 생성할 수 있다.
  아래는 위의 코드를 컴파일 했을때의 모습이다  
 */
//class A{
//	public A(){	} //생략되어있는 디폴트 생성자
//}
//class B extends A{
//	public B() { //
//		super(); // 생략되어있는 디폴트 생성자 및 부모클래스의
//	}			 // 생성자를 호출하는 super(), 
//				//	디폴트생성자와 세트이므로 지금은 생략가능
//	
//	
//	
//class C {
//	public C(int x) {} // 개발자가 직접 정의한 인자생성자
//}
//class D extends C
//{
//	public D(int y) {
//		super(y); // 부모의 인자 생성자를 호출하는 
//		//super()는 반드시 기술해야한다. 개발자가 직접 생성자를 정의하게 되면
//		//디폴트 생성자는 추가되지 않으므로 super(y)와 같이 반드시 부모의
//		//인자 생성자를 호출하는 문장을 삽입해야한다. 생략불가능
//	}
//}
class Account{
	
	private int money;
	//상속관계에 있더라도 하위클래스에선 private에 접근이 불가능
	public Account(int init) {
		money = init;
	}//직접 생성자를 정의했기때문에 디폴트 생성자가 추가되지않음
	
	
	//입금처리 - protected로 선언되었으므로 상속관계에서 접근 가능함
	protected void depositMoney(int _money) {
		if(_money<0) {
			System.out.println("마이너스 금액은 입금처리 불가합니다");
			return;
		}
		money += _money;
	}
	protected int getAccMoney() { // private인 money에 간접전근하기 위한 메서드
		return money;
	}
}


//부모클래스인 Account를 상속받아 정의한 자식클래스
class SavingAccount extends Account{
	/*
	인자생성자에서 부모의 생성자를 호출하기 위한 super(xxx)를 사용
	이때 매개변수가 하나의 부모클래스의 생성자가 호출된다.
	현재 부모클래스에서 인자가 하나인 생성자가 유일하므로 
	 만약 아래와 같이 호출하지 않으면 에러가 발생한다. ㄱ 
	*/
	public SavingAccount(int initVal) {//하위클래스 생성자에서 필요한 매개변수를 받아
		super(initVal);// super로 상위클래스 초기화를 시켜버린다
	}
	public void saveMoney(int money) {
		//super.money += money; << 부모쪽 private 접근불가 에러발생
		depositMoney(money); // protected로 선언된 멤버메서드를 이용해 간접 출력해야한다
	}
	public void showAccountMoney() {
//		System.out.println("지금까지의 누적금액:"+ money);
		System.out.println("지금까지의 누적금액:"+getAccMoney()); //위와동일
	}
}

public class E02PrivateInheritanceMain
{
	public static void main(String[] args)
	{
		// 자식클래스를 통해 객체를 생성한다.
		SavingAccount sa = new SavingAccount(10000);
		
		
		/*
		private 멤버이므로 상속받은 하위클래스의 참조변수를 통해서는
		접근할 수 없다. 은닉된 정보이므로 "not visible"이라는 에러
		메세지를 볼수있다.
		 */
//		sa.money = 100000; 
		sa.saveMoney(5000);
		sa.showAccountMoney();
		sa.saveMoney(-1000);
		sa.showAccountMoney();
		
		Account account = new Account(1000);
//		account.money=1000; private라 직접 접근불가능 에러 
		
		
		
		/*
		Account클래스는 개발자가 매개변수를 하나 가진 생성자를 호출
		했으므로 아래와 같이 객체를 생성할 수 없다. 해당 문장은 매개
		변수가 없는 디폴트생성자를 호출하기 때문이다. 
		디폴트 생성자를 호출하면 에러가 없어집니다. << 이게 무슨말?
		 */
//		Account account2 = new Account();
	}
	
}
