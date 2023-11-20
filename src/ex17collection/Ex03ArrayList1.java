package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList<String>();
		//Vector<String> list = new vector<String>();
		
		/*
		 객체저장
		 */
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
		// 4번인덱스를 건너뛰어 에러발생
		//list.add(5,"소방차");
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄소년단");
		System.out.println("중복 저장전 객체수 :"+list.size());
		
		/*
		중복저장
		*/
		System.out.println(list.add("트와이스")?"중복저장됨":"중복저장안됨");
		System.out.println("중복 저장후 객체수"+list.size());
		
		
		/*
		 출력하기
		 */
		System.out.println("\n[일반for문 사용]");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n[확장for문 사용]");
			for(String obj : list) {
		System.out.print(obj+" ");
		}
		
			
		/*
		 Iterator 사용법
		 */
		System.out.println("\n[반복자(Iterator) 사용");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
//		System.out.println("\n===================\n");
		
		/*
		덮어쓰기 사용법
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj:list) {
			System.out.println(obj+ " ");
		}
		System.out.println("\n===================\n");
		
		/*
		 삽입하기(끼워넣기)
		 */
		
		list.add(4, "블랙핑크>삽입하기");
		for(Object obj:list) {
			System.err.println(obj + " ");
		}
		System.out.println("\n===================\n");
		
		/*
		 포합여부확인
		 */
		System.out.println(list.contains("빅뱅")? "빅뱅있음" : "빅뱅없음");
		System.out.println(list.contains("블랙핑크")? "블랙핑크 있음" : "블랙핑크 없음");
		
		/*삭제방법1*/
		
		Object obj = list.remove(2);
		System.out.println("삭제된객체:"+obj);
		
		/*삭제방법2*/
		
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index="+index);
		list.remove(index);
		
		/*삭제방법*/
		System.out.println(list.remove("방탄소년단")?"삭제성공(방탄)" : "삭제실패(방탄)");
		System.out.println(list.remove("오마이걸")?"삭제성공(마이걸)":"삭제실패(마이걸)");
		System.out.println("삭제 후 출력");
		for(Object ob:list) {
			System.out.println(ob+" ");
		}
		
		/*전체삭제*/
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제 후 객체수: "+list.size());
	}

}
