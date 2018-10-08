package com.example.test;

import java.util.List;
import java.util.Map;

import com.example.db_listview.manager1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class My extends Activity {
	private Button button_back;
	private Button button_b5;
	private Button button_b1;
	private Button button_b3;
	private Button button_b4;
	private TextView text_use;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my);
		text_use = (TextView) this.findViewById(R.id.te);
		text_use.setText(MainActivity.username);// 将登录账户赋值给textview
		// text_use();
		back();
		b5();
		b1();
		b3();
		b4();
		// edit_use();
	}

	private void b4() {
		// 添加数据到listview表
		// TODO Auto-generated method stub
		button_b4 = (Button) findViewById(R.id.b4);
		button_b4.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Object[] a = { 6, R.drawable.pic1,
						"主题：三峡之春\n时间：2017.06.04\n地点：求索报告厅", 2, 1 };
				manager1 ma = new manager1(My.this);
				ma.insertService(a);
				ma.findAllService();
				Log.i("my", "inserted");
				Toast.makeText(My.this, "插入成功", 1).show();
			}
		});
	}

	/*
	 * private void text_use() { // TODO Auto-generated method stub text_use =
	 * (TextView)this.findViewById(R.id.te); // 取出Intent里的Extras数据 Intent
	 * intent=getIntent(); Bundle bundle = intent.getExtras(); // 取出Bundle中的数据
	 * String username= bundle.getString("user"); Log.i("my",username);
	 * text_use.setText(username); }
	 */

	private void b3() {
		// TODO Auto-generated method stub
		button_b3 = (Button) findViewById(R.id.b3);
		button_b3.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(My.this, M3.class);
				startActivity(intent);
			}
		});
	}

	private void b1() {
		// TODO Auto-generated method stub
		button_b1 = (Button) findViewById(R.id.b1);
		button_b1.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(My.this, M1.class);
				startActivity(intent);
			}
		});
	}

	private void b5() {
		// TODO Auto-generated method stub
		button_b5 = (Button) findViewById(R.id.b5);
		button_b5.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(My.this, ResetPassword.class);
				startActivity(intent);
			}
		});
	}

	private void back() {
		// TODO Auto-generated method stub
		button_back = (Button) findViewById(R.id.back);
		button_back.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(My.this, Activity_self.class);
				startActivity(intent);
			}
		});
	}

}
