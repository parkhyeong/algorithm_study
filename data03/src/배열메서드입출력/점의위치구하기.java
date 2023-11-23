package 배열메서드입출력;

public class 점의위치구하기 {
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		//180, 120, 140
		int[] numbers = {1,2};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution6 {
	public int solution(int[] dot) {
		int answer = 0;//머쓱이보다 키큰 사람수 
		if (dot[0]>0 && dot[1]>0) {
			answer=1;
		}
		else if (dot[0]<0 && dot[1]>0) {
			answer=2;
		}
		else if (dot[0]<0 && dot[1]<0) {
			answer=3;
		}
		else if (dot[0]>0 && dot[1]<0) {
			answer=4;
		}
		
		return answer;
	}
}
