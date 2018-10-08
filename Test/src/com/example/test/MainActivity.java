package com.example.test;

import java.util.Map;

import com.example.db.manager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button_reg;
	private Button button_reset;
	private Button button_delete;
	private Button button_delete1;
	private Button button_login;
	private EditText edit_user;
	private EditText edit_user1;
	private String key;
	public static String username;//全局变量存入登录账户

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt_reg();
		bt_reset();
		bt_delete();
		bt_delete1();
		bt_login();
	}

	private void bt_login() {
		// TODO Auto-generated method stub
		edit_user = (EditText) this.findViewById(R.id.username);
		edit_user1 = (EditText) this.findViewById(R.id.password);
		button_login = (Button) findViewById(R.id.login);
		button_login.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				manager ma = new manager(MainActivity.this);

				String[] a = { edit_user.getText().toString() };
				username = edit_user.getText().toString();
				Map<String, String> map = ma.findService(a);
				Log.i("key", map.keySet().toString());
				for (String Key : map.keySet()) {
					key = Key;
					Log.i("key", key);
				}
				if (key != null) {
					if ((edit_user1.getText().toString()).equals(map.get(key)
							.toString())) {
						Toast.makeText(MainActivity.this, "登录成功", 5).show();						
						/*
						 * Bundle bun=new Bundle(); bun.putString("user",
						 * edit_user.getText().toString());
						 * intent.putExtras(bun);
						 */
						Intent intent = new Intent();
						intent.setClass(MainActivity.this, Activity_self.class);
						startActivity(intent);
					} else
						Toast.makeText(MainActivity.this, "密码错误", 1).show();
				}

				else
					Toast.makeText(MainActivity.this, "账号不存在", 1).show();
			}
		});
	}

	private void bt_reg() {
		// TODO Auto-generated method stub
		button_reg = (Button) findViewById(R.id.register);
		button_reg.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();

				/*
				 * Bundle bun = new Bundle();
				 * 
				 * intent.putExtras(bun);
				 */
				intent.setClass(MainActivity.this, Register.class);
				startActivity(intent);
			}
		});
	}

	private void bt_reset() {
		// TODO Auto-generated method stub
		button_reset = (Button) findViewById(R.id.login_error);
		button_reset.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent();

				/*
				 * Bundle bun = new Bundle();
				 * 
				 * intent.putExtras(bun);
				 */
				intent1.setClass(MainActivity.this, ResetPassword.class);
				startActivity(intent1);
			}
		});
	}

	private void bt_delete1() {
		// TODO Auto-generated method stub
		button_delete1 = (Button) findViewById(R.id.bt_pwd_clear);
		edit_user1 = (EditText) findViewById(R.id.password);
		button_delete1.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user1.setText("");
			}

		});
	}

	private void bt_delete() {
		// TODO Auto-generated method stub
		button_delete = (Button) findViewById(R.id.bt_username_clear);
		edit_user = (EditText) findViewById(R.id.username);
		button_delete.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit_user.setText("");
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
