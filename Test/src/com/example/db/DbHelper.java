package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper  extends SQLiteOpenHelper{
	private static String DB_NAME = "myuser.db";// 数据库名称
	private static int version = 2;// 数据库版本
	private static String TAG = "DBHLPER";
	
	 /* 数据表结构设置
	 */ 
	private static final String TABLE_NAME = "users";//表名
	private static final String COL_0 = "id";
	private static final String COL_1 = "password";
	private static final String COL_2 = "repassword";
	private static final String COL_3 = "school";
	private static final String COL_4 = "institute";

	
	 /*创建数据表SQL
	  CREATE TABLE 表名 (
						ID INTEGER PRIMARY KEY AUTOINCREMENT ,     
						//ID VARCHAR(30) NOT NULL, 
						NAME VARCHAR(50) NOT NULL, 
						PHONENO TEXT,
						ADDRESS TEXT );*/
/*注: SQL嵌入时要注意加空格  */
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
	
	// 当数据库创建时第一次执行,通常完成数据表的创建
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		String sql="create table users(id integer(11) primary key autoincrement,title varchar(20))";
		db.execSQL(TABLE_CREATE);
		

	}
	
	//当版本发生变化时会调用该方法
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		//String sql = "alter table users add addr varchar(64)";
		//db.execSQL(sql);

		Log.i(TAG, "-->onUpgrade()");
	}
}
