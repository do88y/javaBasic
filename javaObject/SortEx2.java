package javaObject;

public class SortEx2 {

	public static void main(String[] args) {
		
		int[] scores= {78,96,80,60,70};
		String[] names= {"��ö��","ȫ�浿","�̿���","����ȣ","�̿�ǥ"};
		
		int temp;
		String strTemp;
		
		System.out.println("** ���� �ڷ� ��� **");
		
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
		
		System.out.println("** ������ �ڷ� ��� **");
		
		for(int i=0; i<scores.length; i++) {
		System.out.println((i+1) + "��: " + names[i] + " - " + scores[i]); // \n->�ٹٲ�
		}

	}

}
