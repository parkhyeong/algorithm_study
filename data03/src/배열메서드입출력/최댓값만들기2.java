package �迭�޼��������;

import java.util.ArrayList;
import java.util.Arrays;

import �迭�⺻.Print;

public class �ִ񰪸����2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		//1, 2, -3, 4, -5
		//���� ��� �� ����(-)�� �����ϰ� �ִ� ��� 
		//�� ���� ������ �� �ִ� ã�� 
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //�ı���
		//Print.arr(numbers);
		int last = numbers[numbers.length - 1]; //4
		int last2 = numbers[numbers.length - 2]; //3
		int post = last * last2;
		
		int first = numbers[0];
		int first2 = numbers[1];
		int pre = first * first2;
		
		//System.out.println(pre + " " + post);
		int answer = 0;
		//pre�� post�߿��� �� ū ���� answer�� ����!
		if (pre >= post) {
			answer = pre;
		} else {
			answer = post;
		}
		return answer;
	}
}