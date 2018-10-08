package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.db_listview.manager1;
import com.example.model.Button_enroll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class M1 extends Activity {
	private ListView lv;
	private MyAdapter_m1 adapter;
	private LayoutInflater mInflater;
	private List<Button_enroll> list;
	private Button button_back;
	private Button button_enroll; 

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m1);

		initView();
		initData();
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
				intent.setClass(M1.this, My.class);
				startActivity(intent);
			}
		});
	}

	private void initView() {
		// TODO Auto-generated method stub
		// 获得ListView的对象      
		lv = (ListView) this.findViewById(R.id.listView1);
		// 获得布局加载对象
		mInflater = getLayoutInflater();

		/*
		 * adapter = new MyAdapter_m1();
		 * 
		 * String[] from = new String[] { SetPic(),setText() }; int[] to = new
		 * int[] { R.id.image_list,R.id.item1 }; List<Button_enroll> data =
		 * adapter.getData(); // 数据源 SimpleAdapter simpleAdapter = new
		 * SimpleAdapter(M1.this, data, R.layout.item_list_m1, from, to);
		 * 
		 * lv.setAdapter(simpleAdapter);
		 */
	}

	private void initData() {
		// TODO Auto-generated method stub
		list = new ArrayList<Button_enroll>();

		/*
		 * Button_enroll item1 = new Button_enroll(R.drawable.pic,
		 * "主题：读书交流分享会\n时间：2017.05.04\n地点：学术报告厅"); Button_enroll item2 = new
		 * Button_enroll(R.drawable.pic, "主题：辩论赛\n时间：2017.04.05\n地点：J楼教室");
		 * list.add(item1); list.add(item2);
		 */
		manager1 ma = new manager1(M1.this);
		Cursor cursor = ma.dw.rawQuery("select number,pic,text from listview where state=1", null);
//		获取已报名的活动的参数
		while (cursor.moveToNext()) {
			int number = cursor.getInt((cursor.getColumnIndex("number")));
			int pic = cursor.getInt((cursor.getColumnIndex("pic")));
			String text = cursor.getString(cursor.getColumnIndex("text"));
			// String type = cursor.getString(cursor.getColumnIndex("type"));
			// String state = cursor.getString(cursor.getColumnIndex("state"));
			Button_enroll st = new Button_enroll(pic,text,number); // Button_enroll存一个条目的数据
			list.add(st);// 把数据库的每一行加入数组中
		}

		// 创建自定义Adapter的对象		
		adapter = new MyAdapter_m1(M1.this,list, mInflater);
		adapter.notifyDataSetChanged();
		lv.setAdapter(adapter);
		/*lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Log.i("m1", "进来了");
				lv = (ListView) parent;
				final Button_enroll enroll = list.get(position);
				Toast.makeText(M1.this, "报名成功", 1).show();
				
				button_enroll = (Button) view.findViewById(R.id.enroll1);
				// 点击报名按钮
				button_enroll.setOnClickListener(new Button.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Toast.makeText(Activity_self.this, "报名成功", 1).show();

						Object[] num = { enroll.getNumber() };
						Log.i("num", "number" + num);
						button_enroll.setText("已报名");
						manager1 ma = new manager1(Activity_self.this);
						ma.updatebtService(num);

					}
				});
			}
		});*/
	}

	/*private int cursor(int columnIndex) {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
