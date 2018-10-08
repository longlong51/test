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

		map.put("uName", "主题：解剖学讲座\n时间：2017.03.05\n地点：S楼教室");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic2);

		map1.put("uName", "主题：电子学讲座\n时间：2017.02.25\n地点：J楼教室");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic2);

		map2.put("uName", "主题：软件工程讲座\n时间：2017.2.10\n地点：J楼教室");

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic2);

		map3.put("uName", "主题：移动应用开发讲座\n时间：2016.10.08\n地点：L楼教室");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic2);

		map4.put("uName", "主题：算法分析讲座\n时间：2016.05.19\n地点：L楼教室");

		list.add(map);
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return list;
	}
}
