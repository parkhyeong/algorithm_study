package ���α׷��ӽ��Թ�;

import java.util.Scanner;

public class �粿ġ {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int result = s.solution(64,6); // 70
		System.out.println(result);
	}

}

class Solution5 {
	public int solution(int n, int k) {
		int answer=0;
		int total= n/10; //����� ������ �ִ� ���� ����
		
		answer=n*12000+(k-total)*2000;

		return answer;
	}
}