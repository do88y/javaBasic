package javaClass;

public class ClassA {
	
	// ClassA 필드
	int fieldA;
	static int field2A;
	
	// ClassA 생성자
	public ClassA() {
		System.out.println("ClassA가 생성됨");
	}
	
	// ClassA 메서드
	void methodA() {
		
		// 로컬 클래스->메서드 안에 만들어진 클래스
		class ClassD {
			int fieldD;
			public ClassD() {
				System.out.println("메서드 안에 있는 로컬 클래스 ClassD가 생성됨");
			}
			void methodD() {
				
			}
		}// ClassD
		ClassD dd=new ClassD();  // 로컬클래스는 해당 메서드 안에서 사용 가능하다.
		dd.fieldD=60;
		dd.methodD();
	}// methodA
	
	// 인스턴스 내부 클래스
	class ClassB {

		// ClassB 필드
		int fieldB;
//		static int fieldB1;  인스턴스 클래스에서는 정적필드 생성 불가능
		
		// ClassB 생성자
		public ClassB() {
			System.out.println("ClassB가 생성됨");
		}
		
		// ClassB 메서드
		void methodB() {
			
			// 외부클래스의 필드와 메서드 인스턴스 내부클래스에서 사용 가능하다. 정적 내부클래스에서는 불가능.
			// 인스턴스는 인스턴스만 받을 수 있고 정적클래스는 정적클래스만 받을 수 있다.
			fieldA=10;
			methodA();
			
		}
	}
	
	// 정적 내부 클래스
	static class ClassC {
		
		int fieldC;
		static int field2C;
		
		public ClassC() {
			System.out.println("ClassC가 생성됨");
		}
		void methodC() {
			
			field2A=20;  // static field기 때문에 ClassC에서 사용 가능
			
		}
		static void method2C() {  // 정적필드 생성 가능
			
		}
	}

}
