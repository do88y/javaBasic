package javaObject;

public class Magic {

	public static void main(String[] args) {
		int[][] magic=new int[5][5];  //masic squre ����
		int row=0;  // �� ����
		int col=magic[0].length/2;  // �� ����
		int num=1;  // �迭�� ���� ����
		magic[row][col]=num;  // �̰� ���߷Ⱦ��µ� ������ ����,,,
		for(num=2; num<magic.length*magic[0].length; num++) {
			// �밢������ �̵��Ѵ�.
			row--;
			col++;
			// ���� ����X, ���� ����X
			if(row<0 && col==magic[0].length) {  // �� ���� ���� ���� �� �ϳ��� ���� ���� �� ���� ������ ���� ���;� �Ѵ�.
				row+=2;
				col--;
			}
			//���� �������� ���� ���
			if(row<0) {
				row=magic.length-1;  // ���� �� ���ڿ��� -1 (5-1)
			}
			// ���� �������� ���� ���
			if(col==magic[0].length) {
				col=0;
			}
			// �̹� ���� �����ϴ� ���
			if(magic[row][col] != 0) {
				row+=2;
				col--;
			}
			magic[row][col]=num;
		}  // for��
		// �ֿܼ� ���
		for(int a=0; a<magic.length; a++) {
			for(int b=0; b<magic[a].length; b++) {
				System.out.print(magic[a][b] + " ");
			}
			System.out.println();
		}

	}

}
