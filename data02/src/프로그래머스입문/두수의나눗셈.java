package 프로그래머스입문;

public class 두수의나눗셈 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		
		System.out.println(s.solution(3,2));
	}
}

class Solution3{
	public int solution(double num1, double num2) {
		int answer=(int)((double)num1/(int)num2*1000);
		return answer;
	}
}
