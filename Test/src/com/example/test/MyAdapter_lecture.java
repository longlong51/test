package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter_lecture {
	public List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("new_list",R.drawable.pic2);

		map.put("uName", "���⣺����ѧ����\nʱ�䣺2017.03.05\n�ص㣺S¥����");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic2);

		map1.put("uName", "���⣺����ѧ����\nʱ�䣺2017.02.25\n�ص㣺J¥����");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic2);

		map2.put("uName", "���⣺������̽���\nʱ�䣺2017.2.10\n�ص㣺J¥����");

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic2);

		map3.put("uName", "���⣺�ƶ�Ӧ�ÿ�������\nʱ�䣺2016.10.08\n�ص㣺L¥����");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic2);

		map4.put("uName", "���⣺�㷨��������\nʱ�䣺2016.05.19\n�ص㣺L¥����");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}
}
