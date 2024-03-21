package sec1;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		// Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month = today.get((Calendar.MONTH) +1);
		// 0 ~ 11 이므로 +1
		int day = today.get(Calendar.DATE);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 = today.get(Calendar.HOUR); 
		// 12 시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY); 
		// 24 시간제
		int minute = today.get(Calendar.MINUTE);
		// 분
		int second = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);
		// 밀리초 => 시간 (/1000/60/60)
		int lastDate = today.getActualMaximum(Calendar.DATE);
		int firstDate = today.getActualMaximum(Calendar.DATE);
		
		System.out.println("현재 년도 :" + year);
		System.out.println("현재 월 " + month);
		System.out.println("현재 일 " + day);

		System.out.println("오늘은" + year + "년의" + doy + "일 째 날");
		System.out.println("오늘은 현재 월의" + dom + "번째 날");
		System.out.println("오늘은 이번 주의" + dow + "번 째 주");
		
		
		String[] wk = {"일요일", "월요일","화요일","수요일","목요일","금요일","토요일"};
			System.out.println("요일은" + wk[dow-1] + "요일입니다.");
			System.out.println(hour24 + ":" + minute + ":" + second);
			if(ampm==0) {
				System.out.println("오전" + hour12 + ":" + minute + ":" + second);
			}else {
				System.out.println("오후" + hour12 + ":" + minute + ":" + second);
			}
			System.out.println("타임 존 : " + (timeZone/1000/60/60));
			System.out.println(" 이 달의 마지막 날 :" + lastDate);
			System.out.println(" 이 달의 첫번째 날 :" + firstDate);
			
		/* 이 방법도 있긴 하지만, 배열을 이용하는게 더 짧고 실용적.
		 * 
		 * switch(dow) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			
		}*/
		
	}

}
