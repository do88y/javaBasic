package JavaBase;

public class ForEx11 {

	public static void main(String[] args) {
		System.out.println("�������� �ܿ���");
		for(int dan=2; dan<=9; dan++) {
			System.out.println("** " + dan + "��  **");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " X " + i + " = " + dan*i);
			}  // ����  for��
			System.out.println();
		}  // �ܺ� for��

	}
}
