package javaClass;

public class ClassA {
	
	// ClassA �ʵ�
	int fieldA;
	static int field2A;
	
	// ClassA ������
	public ClassA() {
		System.out.println("ClassA�� ������");
	}
	
	// ClassA �޼���
	void methodA() {
		
		// ���� Ŭ����->�޼��� �ȿ� ������� Ŭ����
		class ClassD {
			int fieldD;
			public ClassD() {
				System.out.println("�޼��� �ȿ� �ִ� ���� Ŭ���� ClassD�� ������");
			}
			void methodD() {
				
			}
		}// ClassD
		ClassD dd=new ClassD();  // ����Ŭ������ �ش� �޼��� �ȿ��� ��� �����ϴ�.
		dd.fieldD=60;
		dd.methodD();
	}// methodA
	
	// �ν��Ͻ� ���� Ŭ����
	class ClassB {

		// ClassB �ʵ�
		int fieldB;
//		static int fieldB1;  �ν��Ͻ� Ŭ���������� �����ʵ� ���� �Ұ���
		
		// ClassB ������
		public ClassB() {
			System.out.println("ClassB�� ������");
		}
		
		// ClassB �޼���
		void methodB() {
			
			// �ܺ�Ŭ������ �ʵ�� �޼��� �ν��Ͻ� ����Ŭ�������� ��� �����ϴ�. ���� ����Ŭ���������� �Ұ���.
			// �ν��Ͻ��� �ν��Ͻ��� ���� �� �ְ� ����Ŭ������ ����Ŭ������ ���� �� �ִ�.
			fieldA=10;
			methodA();
			
		}
	}
	
	// ���� ���� Ŭ����
	static class ClassC {
		
		int fieldC;
		static int field2C;
		
		public ClassC() {
			System.out.println("ClassC�� ������");
		}
		void methodC() {
			
			field2A=20;  // static field�� ������ ClassC���� ��� ����
			
		}
		static void method2C() {  // �����ʵ� ���� ����
			
		}
	}

}
