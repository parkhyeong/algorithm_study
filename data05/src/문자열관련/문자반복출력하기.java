package ���ڿ�����;

import java.util.ArrayList;
import java.util.Arrays;

public class ���ڹݺ�����ϱ� {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String n = "hello";
		String result = s.solution(n,5);
		System.out.println(result);
	}
}

class Solution9 {
	public String solution(String n, int k) {
		char [] c =n.toCharArray();
		String answer="";
		for (int i = 0; i < c.length; i++) {
			for (int j=0; j<k; j++)
				answer=answer+c[i];
		}
		return answer;
	}
}