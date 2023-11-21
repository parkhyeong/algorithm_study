package ¹è¿­ÇÙ½É;

public class ¹è¿­ÀÇÆò±Õ {

	public static void main(String[] args) {
		int [] numbers= {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10};
		Solution s = new Solution();
		double result=s.solution(numbers);
		s.solution(numbers);
	}

}

class Solution {
	public double solution(int[] n) {
		double answer=0;
		
		int sum=0;
		for (int x: n) {
			sum = sum+x;
		}
		answer=(double)sum / n.length;
		return answer; 
	}
	
} 