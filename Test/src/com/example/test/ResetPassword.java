package com.example.test;

import com.example.db.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends Activity {
	private Button button_back;
	private Button button_delete1;
	private EditText edit_user1;
	private Button button_delete2;
	private EditText edit_user2;
	private Button button_delete3;
	private EditText edit_user3;
	private Button button_reset;

	/**
	 * @param args
	 */
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resetpassword);
		back();
		bt_delete1();
		bt_delete2();
		bt_delete3();
		reset();
	}

	private void reset() {
		// TODO Auto-generated method stub
		edit_user1=(EditText) this.findViewById(R.id.username);
		edit_user2=(EditText) this.findViewById(R.id.password);
		edit_user3=(EditText) this.findViewById(R.id.resetpassword);
		button_reset = (Button) findViewById(R.id.repassword);
		button_reset.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Object[] a={
						edit_user1.getText().toString(),
						edit_user2.getText().toString(),
						edit_user3.getText().toString(),
						edit_user1.getText().toString()};
						
				if(edit_user2.getText().toString().equals(edit_user3.getText().toString()) )
				{
					manager ma=new manager(ResetPassword.this); 
				    ma.updateService(a);
					ma.findAllService();
					Log.i("TAG", "updated");	
					Toast.makeText(ResetPassword.this,"修改成功" ,1).show();}
					
				else
					Toast.makeText(ResetPassword.this,"两次密码不同" ,1).show();
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

				/*
				 * Bundle bun = new Bundle();
				 * 
				 * intent.putExtras(bun);
				 */
				intent.setClass(ResetPassword.this, MainActivity.class);
				startActivity(intent);
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
}
