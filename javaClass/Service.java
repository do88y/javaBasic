package javaClass;
// ������̼� ���� Ŭ����
public class Service {
	
	@PrintAnnotation
	public void corona() {
		 System.out.println("�ڷγ� �ڸ�!!");
	 }
	
	@PrintAnnotation("*")
	public void corona2() {
		System.out.println("����ũ�� �ڸ�!!");
	}
		
	@PrintAnnotation(value="$", number=30)
	public void corona3() {
		System.out.println("�����ڷγ� �ڸ�!!");
		}
		
}
