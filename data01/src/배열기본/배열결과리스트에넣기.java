package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {

	public static void main(String[] args) {
		int[] n = {100,200, 300, 400, 500};
		
		//1. 전체 목록프린트
		Print.arr(n);
		
		//2. 300이상 값이 몇개인지 카운트해서프린트
		//3. 300이상 들어있는 위치를 arraylist에 모으세요.
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < n.length; i++) {
			if (n[i]>=300) {
				count++;
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println(list);
		
		for (int index: list) {
			n[index] = n[index]-100;
		}
		
		Print.arr(n);
		
	}

}
