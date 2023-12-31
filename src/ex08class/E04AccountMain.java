package ex08class;

/*
 * 은행계좌를 추상화 해보기 
 * 멤버변수 : 예금주, 계좌번호, 잔고 
 * 멤버메서드 : 입금하다, 출금하다, 계좌잔고조회 
 * 조건1 : 입금은 무제한으로 가능
 * 조건2 : 잔고가 부족한 경우에는 출금불능처리
 */

class Account
{
	String name; //예금주
	String accountNumber; //계좌번호
	int balance; //잔고
	
	void deposit(int money) // 입금
	{
		balance += money;
		System.out.println(money + "원이 입금됨");
	}
//	public account() {}  생략되어있음
	void withdraw(int money) // 출금
	{
		if (balance >= money)
		{
			balance -= money;
			System.out.println("계좌에서" + money + "원이 출금됨");
		} else
		{
			System.out.println("잔고부족으로 출금불능");
		}
	}
	
	void showAccount() // 계좌조회
	{
		System.out.println("계좌주: " + name);
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("잔고: " + balance);
	}
	
	void init(String n, String a, int b) // 초기화 메서드
	{
		name = n;
		accountNumber = a;
		balance = b;
	}
	
}

public class E04AccountMain
{
	public static void main(String[] args)
	{
		Account account = new Account(); // 첫번째 계좌 객체 생성
		account.init("장동건", "111-21-8888", 1000); // 초기화용 메서드로 객체 초기화
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount(); // 입출금후 정보확인

		Account account2 = new Account(); // 두번째 계좌 객체 생성
		account.name = "정우성"; // 멤버 변수에 직접 접근하여 객체 초기화
		account.accountNumber = "123-45-67889"; // 첫번째 방법의 하위호환
		account.balance = 900000;
		account.showAccount();
		
		
	}

}
