package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1
{ //HashSet<E> : set계열의 컬렉션
	// 순서없이 저장됨
	// 중복저장을 비허용
	// List가 배열이라면 Set은 집합의 특성
	
	
	public static void main(String[] args)
	{
		HashSet<Object> set = new HashSet<Object>();
		//object기반으로 생성하여 모든 객체에 접근가능
		
		//초기화
		String varString1 = "JAVA"; 
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		//객체저장
		System.out.println("add결과"+set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println("[중복 저장전 객체수]"+set.size());


		//기본클래스의 객체 중복저장
		System.out.println(set.add(varString2)?"저장성공":"저장실패");
		System.out.println("[중복 저장후 객체수]"+set.size());
		
		//이터레이터를 통한 객체 출력
		// ㄴ순서없이 저장되므로 출력의 순서도 정할 수 없다
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
				Object object = itr.next();
				if(object instanceof Teacher) {
					System.out.println("Teacher객체=>"+((Teacher)object).getName());
				}
				else {
					System.out.println("저장된객체:"+object);
				}//if
			}//while
		
		//포함여부확인
		System.out.println(set.contains(varString1)? "varString1 있음":"varStinrg1 없음");
		//객체삭제  // set컬렉션은 인덱스가 없으므로 객체의 참조값을 통해 삭제
		System.out .println(set.remove(varString2)? "varString2 삭제 성공":"varStinrg2 삭제 실패");
		//전체삭제  // list 컬렉션과 동일
		set.clear();
		System.out.println("전체삭제:"+set.removeAll(set));
		System.out.println("[전체 삭제후 객체수] :"+set.size());
		
		
	}
}
