package �迭���;

import java.util.Arrays;

public class �迭�Է¹迭��ȯ_��������2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution2 s = new Solution2();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] n) {
		//�迭�� Ȧ������ ���´� 
		//�߾Ӱ��� ��ġ�� ==> �迭�ǰ���/2
		//�迭�� ���� �� 
		Arrays.sort(n);
		//�߾Ӱ��� ���ϰ� ==> answer�迭�� ù��° ��ġ�� �ִ´�. 
		int mid=n[n.length/2];
		//�߾Ӱ����� 10�� ���� �� ==> answer�迭�� �ι�° ��ġ�� �ִ´�.
		//�߾Ӱ����� 10�� �� �� ==> ==> answer�迭�� ����° ��ġ�� �ִ´�.
		//�迭�� �ϳ��� ��� ���� 
		int[] answer = {0,0,0};
		answer[0]=mid;
		answer[1]=mid+10;
		answer[2]=mid-10;
		return answer;
	}
}