package 프로그래머스입문;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		System.out.println(s.solution(15));
	}

}

class Solution7 {
	public int solution(int n) {
		int answer;
		answer=n/6;
		if(n%7!=0) {
			answer++;
		}
		return answer;
	}
	
}
