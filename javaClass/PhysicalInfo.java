package javaClass;
// ��ü������ ����ϴ� Ŭ����
public class PhysicalInfo {
	
	// �ʵ�-���� ����Ǵ� ��
	String name;  // �̸�
	int age;  // ����
	float height, weight;  // Ű�� ������
	
	// ������-��ü�� �ʱ�ȭ�� ���
	public PhysicalInfo(String name, int age, float height, float weight) {  // () ���� �Ű����->�ʵ�� �̸��� ���� ��� this�� �����Ѵ�.
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	// �޼���-�ϴ� ��
	void update(int age) {
		this.age=age;
	}
	void update(int age, float height) {  // update��� �޼��� �̸� ���� �ͣ��Ű������¡��̿����̡�������ơ��ء�������� �� �׸�
		this.age=age;  // this ���� �� �츮 �� �׸�
		this.height=height;
	}
	void update(int age, float height, float weight) {  // �޼��� �����ε�-> Ŭ���� ���� �Ȱ��� �޼��尡 �� ������ �������� �Ű������� ������ �ٸ��ų� Ÿ���� �ٸ��ų� ������ �ٸ��� ����
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}
