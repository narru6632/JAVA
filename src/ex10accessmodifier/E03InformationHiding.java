package ex10accessmodifier;


class FruitSeller6{
	
	private int numOfApple;
	private int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller6(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	 
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer6{
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer6(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	 
	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);		
	}
}

public class E03InformationHiding {

	public static void main(String[] args) {
		
		
		
		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);
		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		System.out.println("판매자의 1000원짜리 사과");
		seller1.showSaleResult(); 
		System.out.println("판매자의 500원짜리 사과");
		seller2.showSaleResult();  
		System.out.println("손님은 왕이다.");
		buyer.showBuyResult();	
		
		
//		아래의 코드는 문법적으로 오류/가 없으나
//		지불금액과 구매한 사관의 관계가 전혀 맞지않는 논리적
//		오류가 발생함, 즉 코드(메서드)로 구현한 법칙이 무너진다
//		객체지향 프로그램에서는 이런 오류를 막기위해 멤버변수에 대한
//		'정보은닉'을 권장하고있다
//		멤버변수의 외부접근을 원천적으로 차단하고 멤버메서드를 
//		통해서만 접근하게 하여 프로그래밍의 논리적오류를 차단하는 역할
//		
		
		
		//각각의 판매자에게 천원을 지불하고 사과를 구매한다
		buyer.buyApple(seller1, 1000); //1000에 1개 구매
		buyer.buyApple(seller2, 1000); // 500에 2개 구매
		
//		seller1.myMoney +=1000; // 판매자 1에게 1,000지불
//		seller1.numOfApple -= 50; //50개 구매
//		buyer.numOfApple += 50; // 50개 증가
//		
//		seller2.myMoney +=1000; // 판매자 2에게 1000원을 지불
//		seller2.numOfApple -=700; // 70개 구매 
//		buyer.numOfApple += 70; // 70개 증가
		//하지만 구매자의 금액은 차감되지않음
		
		System.out.println("구매행위가 일어난 후의 상태");
		System.out.println("첫번째 판매자1");
		seller1.showSaleResult();  
		System.out.println("두번째 판매자2");
		seller2.showSaleResult();  
		System.out.println("손님은 왕이다.");
		buyer.showBuyResult();	// 사관15개, 금액 0원
	}
}