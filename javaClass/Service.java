package javaClass;
// 어노테이션 적용 클래스
public class Service {
	
	@PrintAnnotation
	public void corona() {
		 System.out.println("코로나 박멸!!");
	 }
	
	@PrintAnnotation("*")
	public void corona2() {
		System.out.println("오미크론 박멸!!");
	}
		
	@PrintAnnotation(value="$", number=30)
	public void corona3() {
		System.out.println("변이코로나 박멸!!");
		}
		
}
