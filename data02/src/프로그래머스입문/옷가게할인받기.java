package ���α׷��ӽ��Թ�;

public class �ʰ������ιޱ� {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		System.out.println(s.solution(15));
	}

}

class Solution6 {
	public int solution(int n) {
		int answer;
		answer=n/6;
		if(n%7!=0) {
			answer++;
		}
		return answer;
	}
	
}
