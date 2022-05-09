package JavaBase;

public class SwitchEx3 {

	public static void main(String[] args) {
		char ch='a';
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("apple 선택 완료");
				break;
			case 'B':
			case 'b':
				System.out.println("banana 선택 완료");
				break;
			case 'G':
			case 'g':
				System.out.println("grape 선택 완료");
				break;
			default:
				System.out.println("아직 준비 못했습니다");
				break;
		}

	}

}
