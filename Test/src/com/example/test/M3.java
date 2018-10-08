package com.example.test;

import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class M3 extends Activity{
	private ListView lv;
	private MyAdapter_m3 adapter;
	private Button button_back;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m3);

		initView();
		back();
	}
	private void back() {
		// TODO Auto-generated method stub
		button_back = (Button) findViewById(R.id.back);
		button_back.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(M3.this, My.class);
				startActivity(intent);
			}
		});
	}
	private void initView() {
		// TODO Auto-generated method stub

		lv = (ListView) this.findViewById(R.id.listView1);

		adapter = new MyAdapter_m3();

		String[] from = new String[] { "new_list","uName" };
		int[] to = new int[] { R.id.image_list,R.id.item1 };
		List<Map<String, Object>> data = adapter.getData();
		// สýพÝิด
		SimpleAdapter simpleAdapter = new SimpleAdapter(M3.this,
				data, R.layout.item_list_m3, from, to);

		lv.setAdapter(simpleAdapter);

	}
}
