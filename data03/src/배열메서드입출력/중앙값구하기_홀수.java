package �迭�޼��������;

import java.util.ArrayList;
import java.util.Arrays;

import �迭�⺻.Print;

public class �߾Ӱ����ϱ�_Ȧ�� {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		//0, 31, 24, 10, 1, 9
		int[] numbers = {0, 31, 24, 10, 1, 9, 11};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution3 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //�ı���
		//�߾Ӱ��� ���� �� ��ġ�� -> ����/2
		Print.arr(numbers);
		int median = numbers.length / 2;
		int answer = numbers[median];
		return answer;
	}
}