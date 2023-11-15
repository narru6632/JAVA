package ex09package;


import ex09package.study.seller.FruitSeller4;
import ex09package.study.buyer.FruitBuyer4;
/*
세번째 버전에서는 초기화 메서드를 생성자로 변경한다.
*/


public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		
		/*
		 생성자를 사용해서 객체를 생성하면 생성과 동시에 초기화 할수
		 있으므로 초기화 메서드를 사용하는 것보다 적은 코드르 작성할 수 
		 있다.
		 */
		// 판매자1 : 사과100개, 단가 1000원으로 정의
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		// 구매자 : 보유금액 10000원
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		System.out.println("판매자의 1000원짜리 사과");
		seller1.showSaleResult();  // 사과100개, 금액 0원
		System.out.println("판매자의 500원짜리 사과");
		seller2.showSaleResult();  // 사과80개, 금액 0원
		System.out.println("손님은 왕이다.");
		buyer.showBuyResult();	// 사관0개, 금액 5000원
		
		// 구매자가 판매자에게 각각의 사과를 5000원씩 지불하고 
		// 사과를 구매한다.
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		System.out.println("판매자의 1000원짜리 사과");
		seller1.showSaleResult();  // 사과95개, 금액 5000원
		System.out.println("판매자의 500원짜리 사과");
		seller2.showSaleResult();  // 사과70개, 금액 5000원
		System.out.println("손님은 왕이다.");
		buyer.showBuyResult();	// 사관15개, 금액 0원
	}
}