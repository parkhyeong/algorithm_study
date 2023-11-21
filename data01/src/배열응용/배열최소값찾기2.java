package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 배열최소값찾기2 {

	public static void main(String[] args) {
		Random r =new Random();
		int x[]=new int[1000];
		
		for (int i=0; i<1000; i++) {
			x[i]=r.nextInt(1000);
		}
		int max=x[0];
		
		for (int i=0; i<1000; i++) {
			if(max<x[i]) {
				max=x[i];
			}
		}
		System.out.println(max);
		Print.arr(x);
	}

}
