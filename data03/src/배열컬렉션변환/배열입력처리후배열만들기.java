package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr= {11, 22, 33, 44, 55, 66, 77, 88,99};
		//위 목록 중 3의 배수인 숫자들만 모아보자.
		//결과를 배열에 모아서 출력!!!
		//==>몇 개인지 모를때(가변) --> collecct
		ArrayList<Integer> list =new ArrayList<>();
		//위 목록 중 3의 배수인 숫자들만 모아보자!
		//for(배열 순회) + if문(3의 배수 조건) ==> list에 모으자
		for(int x: arr) {
			if(x %3==0) {
				list.add(x);
			}
		}
		//2. 몇개 인지 세어보고, list목록도 프린트!
		int size = list.size();
		System.out.println(size);
		System.out.println(list);
		
		int[] answer= new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]= list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
