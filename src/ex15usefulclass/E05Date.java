package ex15usefulclass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class E05Date
{
	/*	
	Calendar클래스를 통해 얻은 객체를 초로 변환한 후 
	매개변수로 전달된 날짜서식으로 변경한 문자열을 반환
	getTime() : 서버의 표준시인 1970-01-01부터 현재까지의 
	시간을 초 단위로 반환해준다. 이를 타임스탬프라고 표현 한다	
	*/
	public static String myDateFormat(Calendar c, String formatStr) {
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}
	
	public static void main(String[] args)
	{		
//		Calendar 클래스는 대표적인 싱글톤 객체이므로, new로 객체를
//		생성할라 수 없고 유틸리티 메서드를 통해 참조값을 얻어온다.
		Calendar calendar = Calendar.getInstance();
		//M - 월 / m - 분 /H - 12시간 시간, h- 24시간 시간
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1:"+nowStr1);
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째주 D번째날 F번째 E요일");
		System.out.println("현재2:"+nowStr2);
		
		/*
		현재 날짜를 기준으로 전/후를 구분하기 위해 add()메서드를 사용
		만약 음수를 주면 과거의 날짜를 구할 수 있다.
		*/
		calendar.add(Calendar.DATE, 3);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.YEAR, 1);
		String nowStr3 = myDateFormat(calendar,"yyyy년 MM월 dd일");
		System.out.println("1년 2개월 3일후:"+nowStr3);
		
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String future = "2023-12-25";
		System.out.println(today+" "+future);
		long result = myDiffDate(today, future); 
		System.out.println(today+"에서"+future+"까지 남은날짜:"+result);
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy-MM-dd").parse(future);
			System.out.println(formatToday+" <> "+formatFuture);
			
			diffDays = (formatFuture.getTime() - formatToday.getTime())/(24*60*60*1000);
			System.out.println(diffDays);
		}
		catch (Exception e) {}
		return diffDays;
	}
	
	
}
