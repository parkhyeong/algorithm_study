package �迭���;

import java.util.Arrays;

public class �迭�Է¹迭��ȯ_�������� {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution1 s = new Solution1();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(int[] n) {
		//�迭���� �ּҰ��� �ִ밪�� ���� ���ؼ� �������ּ���.!
		//��� �迭�� ù��° �ε������� �ּҰ�
		//��� �迭�� �ι�° �ε������� �ִ밪 
		//�迭�� �ּҰ�/�ִ밪/�߾Ӱ� ������ ����! ������ �Ѵ�.
		Arrays.sort(n); //������������ ����
		System.out.println(Arrays.toString(n));//[3, 22, 44, 66, 88]
		//int[] answer = new int[2];
		int[] answer = {0, 0};//2,3
		answer[0] = n[0];
		answer[1] = n[n.length - 1];
		return answer;
	}
}