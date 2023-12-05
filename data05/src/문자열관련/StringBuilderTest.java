package 문자열관련;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s="pongpong";
		String s2="pongpong";
		System.out.println(s==s2); //주소비교
		System.out.println(s.equals(s2));
		s2="hahahaha";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		StringBuilder sb = new StringBuilder("pongpong");
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb==sb2);
		sb.append("hahaha");
		System.out.println(sb);
		String result = sb.toString();
		System.out.println(result);
		sb.replace(0, 3, "ttt");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
