package javaClass;

public class DokdoAccountEx1 {
	public static void main(String[] args) {
		DokdoAccount chulsu=new DokdoAccount("111-22-5555", "��ö��", 0, 0);
		chulsu.deposit(10000);
		System.out.println("�ܾ�: " + chulsu.balance);
		System.out.println("����������: " + chulsu.point);
		chulsu.deposit(50000);
		System.out.println("�ܾ�: " + chulsu.balance);
		System.out.println("����������: " + chulsu.point);
	}

}
