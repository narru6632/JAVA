package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet<E> : Tree라는 자료구조를 기반으로한 Set계열의 컬렉션, 기본적인 특성을 set과 공유함 
//중복을 허용하지 않으나 순서에 따라 데이터를 저장, 순서는 사용자가 지정해줘야 한다

class MyString implements Comparable<MyString>{
	String str;
	public MyString(String str) {
		this.str = str;
	}
	public int getLength() {
		return str.length();
	}
	@Override
	public int compareTo(MyString paramStr) {  // 데이터를 정렬하기위해 오버라이딩
		if(getLength()<paramStr.getLength())
			return 1;
		else if(getLength()<paramStr.getLength())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex05TreeSetMain
{

	public static void main(String[] args)
	{
		//Java에서 제공하는 기본클래스의 경우 별도 오버라이딩 하지 않아도 된다
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		tree1.add(2);//set컬렉션이므로 중복저장 비허용
		
		System.out.println("저장된 데이터의 수 : "+tree1.size()+"개"); // 4개
		
		Iterator<Integer> itr = tree1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//////////////////////////////////////////////////////////////////////
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		//오름차순으로 정렬됨
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));
		
		Iterator<MyString> it = tree2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
