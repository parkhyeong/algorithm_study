package ���ڿ�����;

public class ���ڿ��ٷ��⺻ {
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
		//���� �ƴ� ���� �����ϰ� ������ false
		//if
		//���ڷθ� �̷���� ������ true
		return answer;
	}
}