package 프로그래머스입문;

public class 옷가게할인받기 {

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
