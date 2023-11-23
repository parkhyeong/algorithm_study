package 배열메서드입출력;

import java.util.Arrays;

public class 배열원소의길이 {
	public static void main(String[] args) {
		Solution8 s = new Solution8();
		String[] n = { "I", "am", "a", "java programmer"};
		int[] result=s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution8 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i<strlist.length; i++){
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}