package ��������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K��°��Ǯ�� {

	public static void main(String[] args) {
		
		Solution2 s = new Solution2();
		int[] num = { 1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		int[] result = s.solution(num, commands);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i<commands.length; i++) {
        	int start = commands[i][0]-1;
			int end = commands[i][1]-1;
			int find = commands[i][2]-1;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = start; j <= end; j++) {
				list.add(array[j]);
			}
        	Collections.sort(list);
        	System.out.println(list);
        	
        	answer[i] = list.get(find);
        }
        return answer;
    }

}