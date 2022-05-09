package javaObject;

public class StringEx1 {

	public static void main(String[] args) {
		String str1="김철수";
		String str2="김철수";
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");  // 값이 같은게 아님
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		if(str1.equals(str2)) {  // equals는 그 번지에 가서 문자열을 가져와서 비교함
			System.out.println("같은 문자열임");
		}else {
			System.out.println("다른 문자열임");
		}
		String str3=new String("김철수");  // new라는 명령문이 있으면 무조건 새로운 주소에 저장됨
		String str4=new String("김철수");
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");  // 
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		if(str1.equals(str2)) {
			System.out.println("같은 문자열임");
		}else {
			System.out.println("다른 문자열임");
		}
		
	}

}
