package ex05method;

//소수 구하는 함수 만들어 1~100까지의 소수 목록 뽑아내기

public class QuFindPrimeNumber {
	static boolean isPrimeNumber(int num) {
		boolean result;
		int i = 2;
		while(true) {
			if(num%i == 0 ) {
				if(num==i) {
					result = true;
					break;
				}
				else {
					result = false;
					break;
				}					
			}
			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("1~100까지의 소수 목록");
		for(int i=2; i<=100; i++) {
			if(isPrimeNumber(i)==true) {
				System.out.println(i);
			}
		}
		
	}
}
