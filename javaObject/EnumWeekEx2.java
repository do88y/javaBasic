package javaObject;

public class EnumWeekEx2 {

	public static void main(String[] args) {
		/*final double pi=3.141592;
		double radius=3.0;
		double area=radius*radius*pi;
		System.out.println("���� ����=" + area);*/
		
		Week today=Week.SUNDAY;
		String name=today.name();  // SUNDAY��� ����� ���ڿ��� �ٲ��ش�.
		System.out.println(name);
		int ordinal=today.ordinal();  // ordinal�̶�� ����� ��ġ���� ��Ÿ�� ��
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.FRIDAY;
		int result1=day1.compareTo(day2);  // ���� �Ͱ� ���� ���� ��ġ���� ���̸� ���ؼ� ��Ÿ���ִ� ���� compareTo��. 1-4
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		String day="FRIDAY";
		Week weekday=Week.valueOf(day);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("�ָ��̱���");
		}else {
			System.out.println("�����̱���");
		}
		Week[] days=Week.values();
		for(Week d:days) {  // ���� for�� d�� days ���� �ϳ��� �޾ƿ´�.
			System.out.println(d);  // MONDAY���� SUNDAY���� ������.
		}
	}

}
