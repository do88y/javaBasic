package javaClass;
// �簢���� ���� �� Ŭ����
public class Rectangle {
	// �ʵ� �տ� private�� ���̸� ĸ��ȭ(��������)�� �ȴ�.
	private int width;  // �ʺ�
	private int height;  // ����
	
	// ������
	public Rectangle(int width, int height) throws Exception{  // �ʱ�ȭ ������ ���� ������ ���� ���� ������ exception�� ����� �ش�.
		if(width <= 0 || height <=0) {  // 0 ������ ��� exception ���
			throw new Exception("�ʺ�� ���̴� �÷��� ���̾�� �մϴ�.");
		}
		this.width=width;
		this.height=height;
	}
	
	// source->generate getters and setters->getter ���� �� generate �ϸ� get~ ���� ��
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}
	

	// ���� �� ���� �����ϰ� ���� �� setter ���
	public void setWidth(int width) throws Exception{
		if(width <=0) {  // setter�� ������ ������ ���� ���� throw ���� �� �ش�.
			throw new Exception("�ʺ�� �÷��� ���̾�� �մϴ�.");
		}
		this.width = width;
	}

	public void setHeight(int height) throws Exception{
		if(height <=0) {
			throw new Exception("���̴� �÷��� ���̾�� �մϴ�.");
		}
		this.height = height;
	}

	// �簢�� ���� ���ϴ� �޼���
	int getArea() {  // �Ű������� �� �ʿ����� �ʰ� ���� �� �ִ�.
//		int area=width*height;  �ٷ� �Ѱ��ָ� �Ǳ� ������ ���� �� �ʿ� ���� �ٷ� return ���ش�.
		return width*height;
	}
}
