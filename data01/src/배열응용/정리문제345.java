package 배열응용;

import javax.swing.plaf.SliderUI;

public class 정리문제345 {

	public static void main(String[] args) {
		String s1 ="참좋다";
		String s2="진짜좋다";
		
		if(s1.equals(s2)) {
			System.out.println("두 문자열은 같습니다.");
		}
		else {
			System.out.println("두 문자열은 다릅니다.");
		}
		if (s1.length()>s2.length()) {
			System.out.println("s1이 더 큽니다.");
		}
		else if (s1.length()<s2.length()){
			System.out.println("s2가 더큽니다.");
		}
		else {
			System.out.println("같습니다.");
		}
		
		String s3="나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6,21));
		String s33=s3.substring(6,21);
		System.out.println(s33.toUpperCase());
		
		String s4="2056521";
		char c= s4.charAt(0);
		if(c=='2' || c=='4') {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
	}

}
