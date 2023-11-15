package ex10accessmodifier;

/*
캡슐화(encapsulation)
여러가지 업무로직을 관련있는걸 모아 하나로 묶는다 / 업무의 순서를 고려한 로직을 구성
*/


//업무가 번호순대로 시행되어야 한다고 가정
class MemberRegist{
	void doMemberRegist(){
		System.out.println("1.회원가입을 진행합니다.");
	}
}

class CongratulationPoiont{
	void doCongratulationPoiont(){
		System.out.println("3.가입축하 10포인트를 지급합니다");
	}
}

class AutoLogin{
	void doAutoLogin(){
		System.out.println("2.자동로그인");
	}
}

class FirstLoginEvent{
	void doFirstLoginEvent(){
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다.");
	}
}


/*
업무의 순서를 고려하여 관련된 메서드롤 하나의 클래스로 정의한다.
차후에는 별도의 분석없이 해당 클래스의 메서드만 호출하면 업무는
차질없이 진행될것이다.
*/
class EncapsulLogic{ // 캡슐화 로직
	
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoiont congratulationPoiont = new CongratulationPoiont();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoiont.doCongratulationPoiont();
		firstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation
{
	public static void main(String[] args)
	{
		/*
		업무의 진행순서가 중요하다고 가정 했을때 캡슐화를 하지 않으면
		순서를 지키지 않아도 코드 실행이 가능한 상태가 되어
		일이 꼬일수가 있음
		순서 상관없이 호출만 하면 진행되는 자바의 특징 때문 
		*/
		System.out.println("캡슐화 전 코드");
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginevent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoiont congratulationPoiont = new CongratulationPoiont();
		
		//1.필요한 순서대로 메서드를 호출할 수 있지만
		memberRegist.doMemberRegist();
		firstLoginevent.doFirstLoginEvent();
		congratulationPoiont.doCongratulationPoiont();
		autoLogin.doAutoLogin();
		
		System.out.println("============================");
		//2.미리 캡슐화를 해두면 필요한 순서대로 호출이 가능
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	}
}
