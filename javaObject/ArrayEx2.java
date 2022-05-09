package javaObject;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] scores=new int[5];  // 배열은 생성과 동시에 초기값이 정해져 있다. 번지에 장소를 마련하려면 무언가 들어있어야하기 때문.
		scores[0]=70;
		scores[2]=90;
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}
