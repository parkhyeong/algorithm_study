package �迭�޼��������;

import java.util.Arrays;

public class ���̽��Ƹ޸�ī�� {

	public static void main(String[] args) {
		Solution7 s= new Solution7();
		int[] result=s.solution(10000);
		System.out.println(Arrays.toString(result));
	}
}

class Solution7{
	public int[] solution(int money) {
		int count= money/5500;
		int change=money%5500;
		int[] answer= {count,change};
		return answer;
	}
}