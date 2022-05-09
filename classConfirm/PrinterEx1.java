package classConfirm;

public class PrinterEx1 {

	public static void main(String[] args) {
		Printer printer=new Printer();  // 매개변수 선언-> 매개변수를 선언하지 않고도 출력하려면 정적 뭐시기로 만들어야해서 클래스의 매개변수에 static을 붙인다
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
