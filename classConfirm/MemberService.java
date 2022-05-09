package classConfirm;

public class MemberService {
	//메서드
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout(String id) {
		if(id.contentEquals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
