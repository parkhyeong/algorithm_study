package ��������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class �������ǥ���� {

	public static void main(String[] args) {
		
		String[] all= {"ȫ�浿","��浿","ȫ�浿","��浿","ȫ�浿","�ڱ浿"};
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < all.length; i++) {
			map.put(all[i], map.getOrDefault(all[i],0)+1);
		}
		System.out.println(map);
		//1. ��ü ��� ����Ʈ 		
		Set<String> keys =map.keySet();
		System.out.println(keys);
		//2. �� ����� ����� �� ǥ���� ŉ���ߴ°�?
		System.out.println();
		//3. ���� ���� ���� ��ǥ�� �ߴ°�? �� ǥ�ΰ�?
		//HashMap�� �̿��ϰ�, getOrDefault���
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(String key: keys) {
			values.add(map.get(key));
		}
		int max= Collections.max(values);
		System.out.println(max);
		for(String key: keys) {
			if(map.get(key)==3) {
				System.out.println(key);
			}
		}
	}

}
