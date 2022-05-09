package javaObject;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] scores= {78,96,80,63,86};  // 배열의 초기화. 여러 값을 저장할 수 있는 이유는 참조타입으로 저장되기 때문에 번지수로 저장 됨. []는 타입과 변수 어느쪽에 붙여도 된다.
		for(int i=0; i<scores.length; i++) {  // index는 0부터 시작하기 때문에 <=가 아니라 <라고 입력해야 한다. scores.length는 배열의 수만큼 자동으로 넣어 줌
		System.out.println(scores[i]);  // 1씩 늘어날 때마다 4바이트 떨어진 값이 찍힌다.
		}
	}

}
