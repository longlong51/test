package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter_else {
	public List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("new_list",R.drawable.pic1);

		map.put("uName", "���⣺��Ͽ֮��\nʱ�䣺2017.06.04\n�ص㣺����������");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic1);

		map1.put("uName", "���⣺���б���\nʱ�䣺2017.05.05\n�ص㣺L¥����");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic1);

		map2.put("uName", "���⣺������\nʱ�䣺2016.11.10\n�ص㣺��Է����");

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic1);

		map3.put("uName", "���⣺ҽѧ����\nʱ�䣺2016.10.04\n�ص㣺S¥����");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic1);

		map4.put("uName", "���⣺��ҵ���\nʱ�䣺2016.06.08\n�ص㣺E¥����");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}
}
