package ex09package.study.seller;


public class FruitSeller4{

	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	/*
	 멤버상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 일반 멤버메서드에서는 초기화할수 없다. 또한 초기값이 없는 상태로
	 선언 자체가 불가능하다.
	 하지만 생성자는 객체생성시 딱 한번만 호출되고, 개발자가 마음대로
	 호출할 수 없으므로 한번 이상 초기화되지 않음이 보장된다.
	 따라서 멤버상수는 생성자에서 초기화 할 수 있다.
	 */
	
	public FruitSeller4(int money, int appleNum, int price) {
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
	
	// 판매자의 현재상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}


