package �迭�޼��������;

import java.util.ArrayList;
import java.util.Arrays;

public class �Ӿ��̺���Űū����� {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		//180, 120, 140
		int[] numbers = {149, 180, 192, 170};
		int height = 167;
		int result = s.solution(numbers, height);
		System.out.println(result);
	}
}

class Solution5 {
	public int solution(int[] numbers, int height) {
		int answer = 0;//�Ӿ��̺��� Űū ����� 
		for (int i=0; i<numbers.length; i++){
            if (height<numbers[i]){
                answer++;
            }
        }
		
		return answer;
	}
}