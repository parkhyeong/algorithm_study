package ���ڿ�����;

import java.util.ArrayList;
import java.util.Arrays;

public class ���ڿ������������ι�ġ�ϱ� {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String s2 = "Zbcdefg";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution4 {
	public String solution (String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);//�������� 
		System.out.println(Arrays.toString(c));
		
		//char[] --> String
		//String s = new String(c)
		String s2 = new String(c);
		
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		System.out.println(sb);
		String answer = sb.toString();
		return answer;
	}
}