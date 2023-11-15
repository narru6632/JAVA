package ex08class;

class CalculatorEx{
	double result;
	int countadd;
	int countmin;
	int countmul;
	int countdiv;
	
	public void init() {
		countadd = 0;
		countmin = 0;
		countmul = 0;
		countdiv = 0;
	}
	
	double add (double num1, double num2) {
		result = num1+num2;
		countadd++;
		return result;
	}
	double min (double num1, double num2) {
		result = num1-num2;
		countmin++;
		return result;
	}
	double mul (double num1, double num2) {
		result = num1*num2;
		countmul++;
		return result;
	}
	double div (double num1, double num2) {
		result = num1/num2;
		countdiv++;
		return result;
	}
	void showOpCount() {
		System.out.println("덧셈횟수 : "+countadd);
		System.out.println("뺄셈횟수 : "+countmin);
		System.out.println("곱셈횟수 : "+countmul);
		System.out.println("나눗셈횟수 : "+countdiv);
	}
}




public class QuSimpleCalculator {
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	
}
