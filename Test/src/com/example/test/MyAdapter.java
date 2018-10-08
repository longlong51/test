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

		map.put("uName", "三峡大学");

		Map<String, Object> map1 = new HashMap<String, Object>();

		map1.put("uName", "北京大学");

		Map<String, Object> map2 = new HashMap<String, Object>();

		map2.put("uName", "清华大学");

		Map<String, Object> map3 = new HashMap<String, Object>();

		map3.put("uName", "浙江大学");

		Map<String, Object> map4 = new HashMap<String, Object>();

		map4.put("uName", "中山大学");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}

}
