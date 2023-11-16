package ex12inheritance;

import java.util.Iterator;

public class E08VariableArgument
{
	static int getTotal(int param) {
		int total = 0;
		total += param;
		return total;
	}
	static int getTotal(int param1, int param2) {
		int total = 0;
		total += (param1+param2);
		return total;
	}
	static int getTotal(int param1, int param2, int param3) {
		int total = 0;
		total += (param1+param2+param3);
		return total;
	}
	
//	...을 통해 param이 매개변수를 2개이상 받을 수 있는것을 명시해줌
//	또한 메서드 내에서는 배열로 반환되어
//	"매개변수명(param)".length와 같이 배열처럼 사용함
	static int getTotal(int ...param) {
		int total = 0;
		for (int i = 0; i < param.length; i++)
		{
			total += param[i];
		}
		return total;
	}
//오버로딩 없이 코드 하나로 여러 매개변수를 받을 수 있으므로
//위쪽 코드 3개 이상의 가치가 있다
	
	public static void main(String[] args)
	{
		System.out.println("getTotal(args1)호출 : "+ getTotal(10));
		System.out.println("getTotal(args1,args2)호출 : "+ getTotal(10,20));
		System.out.println("getTotal(args1,args2,args3)호출 : "+ getTotal(10,20,30));
		
		System.out.println("getTotal(매개변수6개)호출:"+
							getTotal(10,20,30,40,50,60));
//		System.out.println("getTotal(args1,args2)호출:"+
//							getTotal(10,20.3));
		//매개변수에 double값 섞여있어 호출불가
	}
}
