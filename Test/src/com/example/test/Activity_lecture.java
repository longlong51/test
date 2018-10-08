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

public class Activity_lecture extends Activity {

	private ListView lv;
	private MyAdapter_lecture adapter;
	private Button button_back;
	private Button button_my;
	private Button button_else;
	private Button button_self;
	private Button button_news;
/*	private Button button_enrool;
	private TextView text;*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lecture);

		initView();
		back();
		my();
		elses();
		self();
		news();
//		enrool();
	}
	/*private void enrool() {
		// TODO Auto-generated method stub
		button_enrool = (Button) findViewById(R.id.enrool);
		button_enrool.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 text =(TextView)findViewById(R.id.item1);
				Log.d("TextView",text.getText().toString());
				
			}
		});
	}*/
	private void news() {
		// TODO Auto-generated method stub
		button_news = (Button) findViewById(R.id.a4);
		button_news.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_lecture.this, Activity_news.class);
				startActivity(intent);
			}
		});
	}
	private void self() {
		// TODO Auto-generated method stub
		button_self = (Button) findViewById(R.id.a1);
		button_self.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_lecture.this, Activity_self.class);
				startActivity(intent);
			}
		});
	}
	private void elses() {
		// TODO Auto-generated method stub
		button_else = (Button) findViewById(R.id.a2);
		button_else.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_lecture.this, Activity_else.class);
				startActivity(intent);
			}
		});
	}
	private void my() {
		// TODO Auto-generated method stub
		button_my = (Button) findViewById(R.id.my);
		button_my.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_lecture.this, My.class);
				startActivity(intent);
			}
		});
	}
	private void back() {
		// TODO Auto-generated method stub
		/*
		 * Intent it = getIntent(); Bundle bun = it.getExtras();
		 */
		button_back = (Button) findViewById(R.id.back);
		button_back.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_lecture.this, MainActivity.class);
				startActivity(intent);
			}
		});
	}
	private void initView() {
		// TODO Auto-generated method stub

		lv = (ListView) this.findViewById(R.id.listView1);

		adapter = new MyAdapter_lecture();

		String[] from = new String[] { "new_list","uName" };
		int[] to = new int[] { R.id.image_list,R.id.item1 };
		List<Map<String, Object>> data = adapter.getData();
		// สýพÝิด
		SimpleAdapter simpleAdapter = new SimpleAdapter(Activity_lecture.this,
				data, R.layout.item_list, from, to);

		lv.setAdapter(simpleAdapter);

	}

}
