package JavaBase;

public class SwitchEx3 {

	public static void main(String[] args) {
		char ch='a';
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("apple ���� �Ϸ�");
				break;
			case 'B':
			case 'b':
				System.out.println("banana ���� �Ϸ�");
				break;
			case 'G':
			case 'g':
				System.out.println("grape ���� �Ϸ�");
				break;
			default:
				System.out.println("���� �غ� ���߽��ϴ�");
				break;
		}

	}

}
