package javaClass;

public class DokdoAccountEx1 {
	public static void main(String[] args) {
		DokdoAccount chulsu=new DokdoAccount("111-22-5555", "±èÃ¶¼ö", 0, 0);
		chulsu.deposit(10000);
		System.out.println("ÀÜ¾×: " + chulsu.balance);
		System.out.println("µ¶µµ»ç¶û±â±Ý: " + chulsu.point);
		chulsu.deposit(50000);
		System.out.println("ÀÜ¾×: " + chulsu.balance);
		System.out.println("µ¶µµ»ç¶û±â±Ý: " + chulsu.point);
	}

}
