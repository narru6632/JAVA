package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>()	;
		//Map<T>인터페이스를 이용해 구현
		//key(식별자)와  value가 짝으로 생성됨 << 검색이 편함
		//입력순서 보장 x
		
		//객체저장
		
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+map.put("name","홍길동"));
		
		int number = 20;
//		map.put("age", number); int형은 String형으로 변환할수 없으므로 타입에러 발생
		map.put("age", String.valueOf(number)); // 숫자를 문자열로 변경한 후 저장
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		System.out.println("저장된 객체수:"+map.size()); // 4
		
		//중복저장
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+
					map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장후 객체수 : "+map.size()); // 4그대로 유지
		
		//출력하기
		//1.키값을 알고있을때
		System.out.println("키값을 알때 : "+map.get("name"));
		
		//2.키값을 모를때(혹은 키값이 너무 많아서 하나씩 명시하기 힘들 때)
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		//3.이터레이터를 통한 출력
		System.out.println("[이터레이터 사용하기]");
		Set<String> keys2 = map.keySet(); // 맵전체의 키값 얻어온 후
		Iterator<String> it = keys2.iterator(); // 이터레이터 객체 생성
		while(it.hasNext()) { //키값확인 후
			String key = it.next();//키값얻기
			String value = map.get(key);//벨류값얻기
			System.out.println(String.format("%s:%s", key, value));
		}
		
		
		
		//Value만 얻어와야 할 때
		System.out.println("[value값들만 출력하기]"); 
		//values()메서드를 통해 값 추출후 확장for문으로 출력
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		//존재유무확인
		System.out.println(map.containsKey("name")? "name키값 있다":"name키값 없다");
		System.out.println(map.containsKey("account")? "account키값 있다":"account키값 없다");
		System.out.println(map.containsValue("남자")? "남키값 있다":"남자값 없다");
		System.out.println(map.containsValue("여자")? "여자값 있다":"여자값 없다");
		
		//삭제
		System.out.println("삭제된객체 : "+map.remove("age"));
		System.out.println("[age키값을 삭제 후 출력]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, map.get(key)));
		}

		//전체삭제 - removeAll()은 없고 clear()만 사용가능
		map.clear();
		System.out.println("전체삭제후 객체수:"+map.size());
		
		
		
		
	}
}
