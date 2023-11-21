package common;

import java.util.Objects;

public class Teacher extends Person
{
	private String subject;

	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String toString()
	{
		return super.toString() + ", 과목:"+subject;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	/*
	Teacher객체가 나이와 과목이 같으면 동일하게 처리되도록 hashCode와 equals 메서드 사용
	
	hashCode - 객체가 가진 고유한 주소값을 정수형으로 반환
	 서로다른 객체라면 다른값을 반환하게함
	 정수형 멤버변수의 경우 그냥 사요 하면 되고
	 객체형 멤버변수의 경우 hashCode()메서드를 통해 정수값으로 반환되는 참조값을 사용하면 된다.
	*/
	@Override
	public int hashCode() {
		int returnCode1 = super.getAge() + this.subject.hashCode();
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		
		return returnCode2;
	}
	
	//equals - 객체가 가진 멤버변수의 값 비교
	//값이 같을때는 true 아닐시 false 반환
	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher)obj;
		if((teacher.getAge()==super.getAge())&&
				 teacher.subject.equals(this.subject)) {
			return true;
			}
		else {
			return false;
		}
	}
	
}
