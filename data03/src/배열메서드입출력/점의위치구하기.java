package �迭�޼��������;

public class ������ġ���ϱ� {
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
		int answer = 0;//�Ӿ��̺��� Űū ����� 
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
