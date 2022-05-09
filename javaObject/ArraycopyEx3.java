package javaObject;

public class ArraycopyEx3 {

	public static void main(String[] args) {
		String[] str1= {"성소연","이가현","윤은영"};
		String[] str2=new String[5];

		System.arraycopy(str1, 0, str2, 0, str1.length);
		
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i] + "  ");
		}

	}

}
