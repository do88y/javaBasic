package javaObject;

public class Magic {

	public static void main(String[] args) {
		int[][] magic=new int[5][5];  //masic squre 문제
		int row=0;  // 행 변수
		int col=magic[0].length/2;  // 열 변수
		int num=1;  // 배열에 넣을 숫자
		magic[row][col]=num;  // 이걸 빠뜨렸었는데 오류가 났다,,,
		for(num=2; num<magic.length*magic[0].length; num++) {
			// 대각선으로 이동한다.
			row--;
			col++;
			// 행이 존재X, 열이 존재X
			if(row<0 && col==magic[0].length) {  // 두 개의 조건 묻는 건 하나의 조건 묻는 것 보다 무조건 먼저 나와야 한다.
				row+=2;
				col--;
			}
			//행이 존재하지 않을 경우
			if(row<0) {
				row=magic.length-1;  // 행의 총 숫자에서 -1 (5-1)
			}
			// 열이 존재하지 않을 경우
			if(col==magic[0].length) {
				col=0;
			}
			// 이미 값이 존재하는 경우
			if(magic[row][col] != 0) {
				row+=2;
				col--;
			}
			magic[row][col]=num;
		}  // for문
		// 콘솔에 출력
		for(int a=0; a<magic.length; a++) {
			for(int b=0; b<magic[a].length; b++) {
				System.out.print(magic[a][b] + " ");
			}
			System.out.println();
		}

	}

}
