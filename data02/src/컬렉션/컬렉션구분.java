package �÷���;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class �÷��Ǳ��� {

	public static void main(String[] args) {
		// �ߺ����ŵ� �÷��� ==> set
		HashSet bag = new HashSet();
		bag.add("����"); // element(���)
		bag.add(1000);
		bag.add(1000);
		System.out.println(bag);
		// bag - �ּҰ� �� ����.
		// HashSet�� toString()�� ����־
		// �ּҸ��� hashset�� ����ִ� ������ String���� �������.
		System.out.println(bag.size());

		
		ArrayList list = new ArrayList();
		list.add("�ڵ�����"); //Object <-- String
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0);//String <-- Object
		int time = (int)list.get(1);
		System.out.println(time + 1);
		
		//<Ÿ��Ŭ������>�� ��ü������ �� ��������!
		ArrayList<String> name = new ArrayList<String>();
		name.add("ȫ�浿");
		name.add("��浿");
		String s2 = name.get(0);
		
		ArrayList<Integer> food = new ArrayList<>();
		food.add(18000);
		food.add(12000);
		int in = food.get(0);
		food.add(0, 10000);//�����ε�(������)
		//�ڹٿ����� �Է����°� �ٸ��� 
		//�޼��� �̸� �����ϰ� �ᵵ �ȴ�.
		boolean result = food.contains(12000);
		System.out.println(result);
		int in2 = food.indexOf(12000);
		System.out.println(in2);
		food.set(0, 11000);
		food.clear();
		System.out.println(food);
		
		HashMap<Integer,String> tel = new HashMap<>();
		tel.put(1, "����");
		tel.put(2, "ģ��");
		System.out.println(tel);
		
	}
}