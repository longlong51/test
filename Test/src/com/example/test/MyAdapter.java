package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter {

	public List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("uName", "��Ͽ��ѧ");

		Map<String, Object> map1 = new HashMap<String, Object>();

		map1.put("uName", "������ѧ");

		Map<String, Object> map2 = new HashMap<String, Object>();

		map2.put("uName", "�廪��ѧ");

		Map<String, Object> map3 = new HashMap<String, Object>();

		map3.put("uName", "�㽭��ѧ");

		Map<String, Object> map4 = new HashMap<String, Object>();

		map4.put("uName", "��ɽ��ѧ");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}

}
