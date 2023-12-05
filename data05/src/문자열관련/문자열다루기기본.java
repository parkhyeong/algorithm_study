package 문자열관련;

public class 문자열다루기기본 {
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String s2 ="a234";
		boolean result=s.solution(s2);
		System.out.println(result);
	}
}

class Solution5 {
	public boolean solution(String x) {
		char[] c= x.toCharArray();
		boolean answer= true;
		if(x.length()==4 || x.length() ==6) {
			for (int i=0; i<c.length; i++) {
				if(c[i]<'0'|| c[i]>'9') {
					answer=false;
				}
			}
		}
		
        else {
            answer=false;
        }
		//숫자 아닌 것을 포함하고 있으면 false
		//if
		//숫자로만 이루어져 있으면 true
		return answer;
	}
}