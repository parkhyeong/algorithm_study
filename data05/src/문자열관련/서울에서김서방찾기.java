package ���ڿ�����;

import java.util.Arrays;
import java.util.List;

public class ���￡���輭��ã�� {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String[] s2 = {"Jane","Kim"};
		String result = s.solution(s2);
		System.out.println(result);
	}

}

class Solution6{
	public String solution(String[] s2) {
		List<String> list =Arrays.asList(s2);
		int index = list.indexOf("Kim");
		String answer= "�輭���� "+index +"�� �ִ�";
		return answer;
	}
	
}
