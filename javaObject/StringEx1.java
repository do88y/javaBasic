package javaObject;

public class StringEx1 {

	public static void main(String[] args) {
		String str1="��ö��";
		String str2="��ö��";
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������ ����");  // ���� ������ �ƴ�
		}else {
			System.out.println("str1�� str2�� ������ �ٸ�");
		}
		if(str1.equals(str2)) {  // equals�� �� ������ ���� ���ڿ��� �����ͼ� ����
			System.out.println("���� ���ڿ���");
		}else {
			System.out.println("�ٸ� ���ڿ���");
		}
		String str3=new String("��ö��");  // new��� ��ɹ��� ������ ������ ���ο� �ּҿ� �����
		String str4=new String("��ö��");
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������ ����");  // 
		}else {
			System.out.println("str1�� str2�� ������ �ٸ�");
		}
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ���");
		}else {
			System.out.println("�ٸ� ���ڿ���");
		}
		
	}

}
