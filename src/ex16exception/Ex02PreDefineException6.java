package ex16exception;

public class Ex02PreDefineException6 {
	 
	public static void main(String[] args)  {	
  
		Object object = new Object(); 
		//오브젝트 클래스가 단독적으로 생성된 경우
		//다른클래스와 상속관계가 없으므로 형변환을 할 수 없다.
		try {
			//지금 Object와 상속관계가 아니므로
			//형변환이 불가능한 경우
			String strObject = (String)object;
		}
		catch(ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==ClassCastException발생후==");
			
		System.out.println("끝~~~");
		
		System.out.println("===========================================");
		
		
		//Object클래스를 상속 받아서 진행
		String str = "형변환되나요?";
		boolean castFlag = myClassCasting(str);
		if(castFlag==true)
			System.out.println("됩니다요..");
		else
			System.out.println("안되네요..ㅜㅜ;");
				 
	}////end of main	
	
	//String객체가 인수로 전달되면서 매개변수를 통해 Object로 자동형변환 되므로
	//여기에서 상속관계가 확인된다. 매개변수 o는 원래 String타입이었으므로
	//instanceof를 통해 String임을 확인할 수 있고 이 경우에는 다운캐스팅이 가능
	
	public static boolean myClassCasting(Object o) {
		if(o instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}
}
