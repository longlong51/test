package com.example.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.test.R;


public class MyAdapter_m3 {
	public List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("new_list",R.drawable.pic);

		map.put("uName", "���⣺���齻�������\nʱ�䣺2017.05.04\n�ص㣺ѧ��������");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic);

		map1.put("uName", "���⣺������\nʱ�䣺2017.04.05\n�ص㣺J¥����");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic);

		map2.put("uName", "���⣺������\nʱ�䣺2016.12.10\n�ص㣺��Է����");
*/
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic);

		map3.put("uName", "���⣺�����������\nʱ�䣺2016.09.04\n�ص㣺W¥����");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic);

		map4.put("uName", "���⣺���ջ���\nʱ�䣺2016.08.08\n�ص㣺L¥����");

		/*list.add(map);
		list.add(map1);
		list.add(map2);*/
		list.add(map3);
		list.add(map4);

		return list;
}
}
