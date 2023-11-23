package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99};
		//1. 배열의 평균을 구해서 프린트
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum+=n[i];
		}
		System.out.println((double)sum/n.length);
		
		//2. 배열의 최소값을 3개를 찾아서 더해서 프린트
		Arrays.sort(n);
		Print.arr(n);
		int small= n[0]+n[1]+n[3];
		System.out.println(small);
		
		//3. 배열의 중앙값을 구해서 프린트		
		// 홀수인 경우) 중앙값에 10을 곱해서 프린트
		// 짝수인 경우) 중앙값들을 곱해서 프린트
		if(n.length%2==0) {
			//1. 중앙위치를 찾는다, 2개
			int median = n.length/2; //뒤 위치
			int median2= n.length/2-1; // 앞 위치
			//2. 중앙위치에 있는 값들을 곱한다.
			System.out.println(n[median]*n[median2]);
		} else {
			int median = n.length/2; //뒤 위치
			System.out.println(n[median]*10);
		}
		
	}

}
