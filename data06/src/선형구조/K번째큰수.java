package 선형구조;

import java.util.Arrays;
import java.util.TreeSet;

public class K번째큰수 {

	public static void main(String[] args) {
		int n1[] = {22,33,66,11,10,15};
		Arrays.sort(n1);
		System.out.println(Arrays.toString(n1));
		System.out.println(n1[n1.length]);
		System.out.println(n1[n1.length-1]);
//		System.out.println(n1[n1.length-k]);// k번째 큰수
		
		int k =3;
		int arr []= {22, 22, 44,11,11,33,55,66,77};
		TreeSet<Integer> tree =new TreeSet<Integer>();
		for (int i=0; i< arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.lower(20));
	}

}