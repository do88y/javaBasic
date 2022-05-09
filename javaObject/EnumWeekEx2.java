package javaObject;

public class EnumWeekEx2 {

	public static void main(String[] args) {
		/*final double pi=3.141592;
		double radius=3.0;
		double area=radius*radius*pi;
		System.out.println("원의 면적=" + area);*/
		
		Week today=Week.SUNDAY;
		String name=today.name();  // SUNDAY라는 상수를 문자열로 바꿔준다.
		System.out.println(name);
		int ordinal=today.ordinal();  // ordinal이라는 상수는 위치값을 나타내 줌
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.FRIDAY;
		int result1=day1.compareTo(day2);  // 앞의 것과 뒤의 것의 위치값의 차이를 비교해서 나타내주는 것이 compareTo다. 1-4
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		String day="FRIDAY";
		Week weekday=Week.valueOf(day);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이군요");
		}else {
			System.out.println("평일이군요");
		}
		Week[] days=Week.values();
		for(Week d:days) {  // 향상된 for문 d에 days 값을 하나씩 받아온다.
			System.out.println(d);  // MONDAY부터 SUNDAY까지 찍힌다.
		}
	}

}
