package javaObject;

public class ArrayEx6 {

	public static void main(String[] args) {
		/*String[] names= {"��ö��","�̿���","ȫ�浿","����ȣ","�̿�ǥ"};  // string�� ������ ������ ����
		System.out.println(names[0]);*/
		if(args.length == 2) {
			int num1=Integer.parseInt(args[0]);  //Integer�� Ŭ����, parseInt�� �޼ҵ�
			int num2=Integer.parseInt(args[1]);
			int result=num1+num2;  // run ��ư ���� ���ﰢ�� ��ư->run configurations->Arguments->program Arguments�� �� �Է�
			System.out.println("�� ���� ��=" + result);
		}else {
			System.out.println("�Ű����� ���� �����ϴ�.");
		}

	}

}
