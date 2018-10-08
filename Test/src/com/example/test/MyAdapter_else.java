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

		map.put("uName", "主题：三峡之春\n时间：2017.06.04\n地点：求索报告厅");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic1);

		map1.put("uName", "主题：朗诵比赛\n时间：2017.05.05\n地点：L楼教室");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic1);

		map2.put("uName", "主题：篮球赛\n时间：2016.11.10\n地点：西苑篮球场");

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic1);

		map3.put("uName", "主题：医学讲座\n时间：2016.10.04\n地点：S楼教室");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic1);

		map4.put("uName", "主题：毕业答辩\n时间：2016.06.08\n地点：E楼教室");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}
}
