package javaClass;

import java.lang.reflect.Method;

public class ServiceEx1 {

	public static void main(String[] args) {
		Method[] methods=Service.class.getDeclaredMethods();  // getDeclaredMethods를 쓰면 서비스 클래스 안에 있는 정보가 methods로 넘어간다
		for(Method m:methods) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {  // isAnnotationPresent은 PrintAnnotation이 적용 되었는지 물어보는 것
				PrintAnnotation print=m.getAnnotation(PrintAnnotation.class);
						System.out.println("***" + m.getName() + "***");
						for(int i=0; i<print.number(); i++) {
							System.out.print(print.value());  // #이 20개 찍힌다
						}
				System.out.println();
			}
			try {
				// invoke->메서드 호출하는 명령
				m.invoke(new Service());  // 수가 없을수도 있기 떄문에 try catch를 의무적으로 요구한다.
			}catch(Exception e) {
				System.out.println("메서드 처리 에러");
			}
				
		}  // for문

	}

}
