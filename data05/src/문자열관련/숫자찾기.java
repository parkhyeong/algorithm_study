package 문자열관련;

public class 숫자찾기 {
	public static void main(String[] args) {
		Solution1 s= new Solution1();
		int num=29183;
		int k=1;
		int result = s.solution(num, k);
		System.out.println(result);
	}
}

class Solution1 {
    public int solution(int num, int k) {
    	String s = String.valueOf(num);
    	String k2=String.valueOf(k);
    	int index = s.indexOf(k2);
    	System.out.println(index);
        int answer = -1;
        if(index>0) {
        	answer=index+1;
        }
        return answer;
    }
}