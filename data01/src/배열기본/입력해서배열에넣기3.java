package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		double[] numbers= new double[5];
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=sc.nextDouble();
		}
		sc.close();
		System.out.println(Arrays.toString(numbers));
		
		int count=0;
		for(int i=0;i<numbers.length; i++) {
			if(numbers[i]==22.2) {
			System.out.println("22.2의 위치는 "+i);
			}else if(numbers[i]==33.3) {
				System.out.println("33.3의 위치는 "+ i);
				count++;
			}
		}
		System.out.println(count);
		//List<double[]> list= Arrays.asList(numbers);
		
		
	}

}
