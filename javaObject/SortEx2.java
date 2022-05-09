package javaObject;

public class SortEx2 {

	public static void main(String[] args) {
		
		int[] scores= {78,96,80,60,70};
		String[] names= {"김철수","홍길동","이영희","박찬호","이영표"};
		
		int temp;
		String strTemp;
		
		System.out.println("** 시험 자료 출력 **");
		
		for(int i=0; i<scores.length; i++) {  // 
			System.out.println(names[i] + " - " + scores[i]);
		}
		for(int a=0; a<scores.length-1; a++) {
			for(int b=a+1; b<scores.length; b++) {
				if(scores[a] < scores[b]) {
					temp=scores[a];
					scores[a]=scores[b];
					scores[b]=temp;
					strTemp=names[a];
					names[a]=names[b];
					names[b]=strTemp;
				}
			}
		}
		
		System.out.println("** 성적순 자료 출력 **");
		
		for(int i=0; i<scores.length; i++) {
		System.out.println((i+1) + "등: " + names[i] + " - " + scores[i]); // \n->줄바꿈
		}

	}

}
