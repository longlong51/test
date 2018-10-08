package com.example.test;

import java.util.List;
import java.util.Map;

import com.example.db.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends Activity {
	private Button button_back;
//	private Spinner spinner1;
	private MyAdapter adapter;
	private Button button_delete1;
	private EditText edit_user1;
	private Button button_delete2;
	private EditText edit_user2;
	private Button button_delete3;
	private EditText edit_user3;
	private Button button_delete4;
	private EditText edit_user4;
	private Button button_delete5;
	private EditText edit_user5;
	private Button button_register;
	private static String TAG = "DBHLPER";
	/**
	 * @param args
	 */
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		bt_back();
		bt_delete1();
		bt_delete2();
		bt_delete3();
		bt_delete4();
		bt_delete5();
//		intview();
		register();
		/*
		 * Intent it = getIntent(); Bundle bun = it.getExtras();
		 */

	}

	private void register() {
		// TODO Auto-generated method stub
		edit_user1=(EditText) this.findViewById(R.id.username);
		edit_user2=(EditText) this.findViewById(R.id.password);
		edit_user3=(EditText) this.findViewById(R.id.resetpassword);
		edit_user4=(EditText) this.findViewById(R.id.school_edit);
		edit_user5=(EditText) this.findViewById(R.id.institute_edit);
		button_register = (Button) findViewById(R.id.register);
		button_register.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Object[] a={
						edit_user1.getText().toString(),
						edit_user2.getText().toString(),
						edit_user3.getText().toString(),
						edit_user4.getText().toString(),
						edit_user5.getText().toString()};
				if(edit_user2.getText().toString().equals(edit_user3.getText().toString()) )
				{
					manager ma=new manager(Register.this); 
				    ma.insertService(a);
					ma.findAllService();
					Log.i(TAG, "inserted");	
					Toast.makeText(Register.this,"注册成功" ,1).show();}
					
				else
					Toast.makeText(Register.this,"两次密码不同" ,1).show();
			}
		});
	}

	private void bt_back() {
		// TODO Auto-generated method stub
		button_back = (Button) findViewById(R.id.back);
		button_back.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();

				/*
				 * Bundle bun = new Bundle();
				 * 
				 * intent.putExtras(bun);
				 */
				intent.setClass(Register.this, MainActivity.class);
				startActivity(intent);
			}
		});
	}

	private void bt_delete5() {
		// TODO Auto-generated method stub
		button_delete5 = (Button) findViewById(R.id.bt_institute_clear);
		edit_user5 = (EditText) findViewById(R.id.institute_edit);
		button_delete5.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user5.setText("");
			}

		});
	}

	private void bt_delete4() {
		// TODO Auto-generated method stub
		button_delete4 = (Button) findViewById(R.id.bt_school_clear);
		edit_user4 = (EditText) findViewById(R.id.school_edit);
		button_delete4.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user4.setText("");
			}

		});
	}

	private void bt_delete3() {
		// TODO Auto-generated method stub
		button_delete3 = (Button) findViewById(R.id.bt_pwd_clear1);
		edit_user3 = (EditText) findViewById(R.id.resetpassword);
		button_delete3.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user3.setText("");
			}

		});
	}

	private void bt_delete2() {
		// TODO Auto-generated method stub
		button_delete2 = (Button) findViewById(R.id.bt_pwd_clear);
		edit_user2 = (EditText) findViewById(R.id.password);
		button_delete2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user2.setText("");
			}

		});
	}

	private void bt_delete1() {
		// TODO Auto-generated method stub
		button_delete1 = (Button) findViewById(R.id.bt_username_clear);
		edit_user1 = (EditText) findViewById(R.id.username);
		button_delete1.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user1.setText("");
			}

		});
	}

	/*private void intview() {
		// TODO Auto-generated method stub
//		spinner1 = (Spinner) this.findViewById(R.id.spinner1);

		adapter = new MyAdapter();
		
		 * List<String> list = adapter.getData();
		 * 
		 * ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(
		 * MainActivity.this, android.R.layout.simple_spinner_item, list);
		 * spinner1.setAdapter(spinnerAdapter);
		 
		String[] from = new String[] { "uName" };
		int[] to = new int[] { R.id.item1 };
		List<Map<String, Object>> data = adapter.getData();
		// 数据源
		SimpleAdapter simpleAdapter = new SimpleAdapter(Register.this, data,
				R.layout.item, from, to);

		spinner1.setAdapter(simpleAdapter);

	}
*/
}