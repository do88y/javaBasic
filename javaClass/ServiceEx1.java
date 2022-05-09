package javaClass;

import java.lang.reflect.Method;

public class ServiceEx1 {

	public static void main(String[] args) {
		Method[] methods=Service.class.getDeclaredMethods();  // getDeclaredMethods�� ���� ���� Ŭ���� �ȿ� �ִ� ������ methods�� �Ѿ��
		for(Method m:methods) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {  // isAnnotationPresent�� PrintAnnotation�� ���� �Ǿ����� ����� ��
				PrintAnnotation print=m.getAnnotation(PrintAnnotation.class);
						System.out.println("***" + m.getName() + "***");
						for(int i=0; i<print.number(); i++) {
							System.out.print(print.value());  // #�� 20�� ������
						}
				System.out.println();
			}
			try {
				// invoke->�޼��� ȣ���ϴ� ���
				m.invoke(new Service());  // ���� �������� �ֱ� ������ try catch�� �ǹ������� �䱸�Ѵ�.
			}catch(Exception e) {
				System.out.println("�޼��� ó�� ����");
			}
				
		}  // for��

	}

}
