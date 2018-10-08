package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper  extends SQLiteOpenHelper{
	private static String DB_NAME = "myuser.db";// ���ݿ�����
	private static int version = 2;// ���ݿ�汾
	private static String TAG = "DBHLPER";
	
	 /* ���ݱ�ṹ����
	 */ 
	private static final String TABLE_NAME = "users";//����
	private static final String COL_0 = "id";
	private static final String COL_1 = "password";
	private static final String COL_2 = "repassword";
	private static final String COL_3 = "school";
	private static final String COL_4 = "institute";

	
	 /*�������ݱ�SQL
	  CREATE TABLE ���� (
						ID INTEGER PRIMARY KEY AUTOINCREMENT ,     
						//ID VARCHAR(30) NOT NULL, 
						NAME VARCHAR(50) NOT NULL, 
						PHONENO TEXT,
						ADDRESS TEXT );*/
/*ע: SQLǶ��ʱҪע��ӿո�  */
	private static final String TABLE_CREATE = 
			"CREATE TABLE IF NOT EXISTS " + TABLE_NAME  +"(" +
						COL_0 + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
						COL_1 + " TEXT,"+
						COL_2 + " TEXT,"+ 
						COL_3 + " TEXT,"+
						COL_4 + " TEXT );" ;


	
	
	
	public DbHelper(Context context) {
		super(context, DB_NAME, null, version);
		Log.d(TAG, "1-->DbHelper()");
	}
	
	// �����ݿⴴ��ʱ��һ��ִ��,ͨ��������ݱ�Ĵ���
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		String sql="create table users(id integer(11) primary key autoincrement,title varchar(20))";
		db.execSQL(TABLE_CREATE);
		

	}
	
	//���汾�����仯ʱ����ø÷���
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		//String sql = "alter table users add addr varchar(64)";
		//db.execSQL(sql);

		Log.i(TAG, "-->onUpgrade()");
	}
}
