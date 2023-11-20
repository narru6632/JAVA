package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E06LocalDateTime
{
	
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜 : "+ localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("현재시간 : "+ localTime);
		
		//시간날짜둘다ㄱ
		LocalDateTime moment = LocalDateTime.now();
		System.out.println("지금 : "+ moment);
		
		//날짜와 시간의 서식 적용
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); 
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초"); 
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern
				("오늘의 M월의 W번째주, d번째날, F번째 E요일");
		
		System.out.println("서식 1: " + moment.format(format1));
		System.out.println("서식 2: " + moment.format(format2));
		System.out.println("서식 3: " + moment.format(format3));
		
		//특정날짜 지정
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		System.out.println("크리스마스 : " + xMas.format(format1));
		
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths()+"개월"+period.getDays()+"일 남음");
		
		System.out.println(ChronoUnit.MONTHS.between(localDate, xMas)+"개월 남음");
		System.out.println(ChronoUnit.DAYS.between(localDate, xMas)+"일 남음");
		
		System.out.println("5일전 : "+moment.minusDays(5));
		System.out.println("3일후 : "+moment.plusDays(2));
		System.out.println("2개월후 : "+moment.plusMonths(2));
		System.out.println("1년후 : "+moment.plusYears(1));
		System.out.println("1년 2개월 3일후 : "+moment.plusYears(1).plusMinutes(2).plusDays(3));
		
		
		
		
		
		
		
		
		
		
	}

}
