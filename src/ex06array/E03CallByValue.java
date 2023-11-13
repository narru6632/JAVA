package ex06array;

public class E03CallByValue // 값 호출
{
	public static void main(String[] args)
	{
		/*
		 * call by Value = 값에 의한 호출 메서드 호출과 관련된 개념으로
		 * 매개변수를 통해 값을 전달할때 메모리의 복사를 통해 값이
		 * 전달된다 그래서 다른지역의 메서드에서 값의 변경이 있더라도 호출한
		 * 메서드의 값에는 전혀 영향을 미치지 않는다. 메모리적 관점에서 보면
		 * 스택영역에만 사용하는 케이스로 main과 호출된 메서드는 서로 
		 * 다른지역이므로 서로에게 전혀 영향을 미치지 않는다
		 */
		int first=100, second = 200;
		
		System.out.println("[main메소드안-호출전]"+
				"first="+first+", second="+second);
		callByValue(first,second);
		
		System.out.println("[main메소드안-호출후]"+
				"first="+first+", second="+second);
		
		
	}
	
	public static void callByValue(int fNum, int sNum)
	{
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("[callByValue메소드안]"
				+"first="+fNum+",second="+sNum);
	}
	
	/*
	 * 처음 출력되는 first = 메인메서드의 first 
	 * 두번째 호출되는 first = callByValue메서드안의 fNum
	 * 세번째 호출되는 first = 메인메서드의 first
	 */
	
	
	
}
