package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.db_listview.manager1;
import com.example.model.Button_enroll;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_self extends Activity {
	private String TAG = "Activity_self";

	private ListView lv;
	private MyAdapter_self adapter;
	private Button button_back;
	private Button button_my;
	private Button button_else;
	private Button button_lecture;
	private Button button_news;
	private LayoutInflater mInflater;
	private List<Button_enroll> list;
	private Button button_enroll;

	// private String username;
	/*
	 * private Button button_enrool; private TextView text;
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_self);

		// username();
		initView();
		initData();
		back();
		my();
		elses();
		lecture();
		news();
		// enrool();
	}

	/*
	 * private void username() { // TODO Auto-generated method stub //
	 * 取出Intent里的Extras数据 Intent intent=getIntent(); Bundle bundle =
	 * intent.getExtras(); // 取出Bundle中的数据 username= bundle.getString("user");
	 * Log.i("self",username); }
	 */
	/*
	 * private void enrool() { // TODO Auto-generated method stub button_enrool
	 * = (Button) findViewById(R.id.enrool);
	 * button_enrool.setOnClickListener(new Button.OnClickListener() {
	 * 
	 * @Override public void onClick(View arg0) { // TODO Auto-generated method
	 * stub text =(TextView)findViewById(R.id.item1);
	 * Log.d("TextView",text.getText().toString());
	 * 
	 * } }); }
	 */
	private void news() {
		// TODO Auto-generated method stub
		button_news = (Button) findViewById(R.id.a4);
		button_news.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_self.this, Activity_news.class);
				startActivity(intent);
			}
		});
	}

	private void lecture() {
		// TODO Auto-generated method stub
		button_lecture = (Button) findViewById(R.id.a3);
		button_lecture.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_self.this, Activity_lecture.class);
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
				intent.setClass(Activity_self.this, Activity_else.class);
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

				/*
				 * Bundle bund =new Bundle(); bund.putString("user", username);
				 * intent.putExtras(bund);
				 */

				intent.setClass(Activity_self.this, My.class);
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
				intent.setClass(Activity_self.this, MainActivity.class);
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
		 * adapter = new MyAdapter_self();
		 * 
		 * String[] from = new String[] { "new_list","uName" }; int[] to = new
		 * int[] { R.id.image_list,R.id.item1 }; List<Map<String, Object>> data
		 * = adapter.getData(); // 数据源 SimpleAdapter simpleAdapter = new
		 * SimpleAdapter(Activity_self.this, data, R.layout.item_list, from,
		 * to);
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
		manager1 ma = new manager1(Activity_self.this);
		Cursor cursor = ma.dw
				.rawQuery(
						"select number,pic,text from listview where state=0 and type=1",
						null);
		// 获取未报名活动的参数
		while (cursor.moveToNext()) {
			int number = cursor.getInt((cursor.getColumnIndex("number")));
			int pic = cursor.getInt((cursor.getColumnIndex("pic")));
			String text = cursor.getString(cursor.getColumnIndex("text"));
			// String type = cursor.getString(cursor.getColumnIndex("type"));
			// String state = cursor.getString(cursor.getColumnIndex("state"));
			Button_enroll st = new Button_enroll(pic, text, number); // Button_enroll存一个条目的数据
			list.add(st);// 把数据库的每一行加入数组中
		}

		// 创建自定义Adapter的对象

		adapter = new MyAdapter_self(Activity_self.this, list);
		adapter.notifyDataSetChanged();
		lv.setAdapter(adapter);

	/*	lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) { // TODO Auto-generated method stub
				Log.i(TAG, "进来了");
				lv = (ListView) parent;
				final Button_enroll enroll = list.get(position);
				Intent intent = new Intent();
				Bundle bun = new Bundle();
				bun.putInt("number", enroll.getNumber());
				intent.putExtras(bun);
				Toast.makeText(Activity_self.this, "进入报名", 1).show();

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

					}//点击item后才能点击按钮，按钮变化也是不准确
				});
			}
		});*/

	}

}
