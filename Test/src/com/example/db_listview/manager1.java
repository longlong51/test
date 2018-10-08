package com.example.db_listview;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class manager1 {
	/*
	 * 实现数据库操作类
	 */ private DbHelper1 helper;
		private SQLiteDatabase db;
		private Context context;
		public static SQLiteDatabase dw;
		
		public manager1(Context context){
			this.context = context;
			createDb();
		}	
		
		/*
		 * 以下是接口DbService的使用
		 * */
		
		public void createDb(){
			DbHelper1 helper = new DbHelper1(context);
			dw=helper.getWritableDatabase();
		    
		}
		
		public void insertService(Object[] o){
			serviceach1 dbach = new serviceach1(context);
			boolean b = dbach.addService(o);
			Log.i("insert:","---"+b);
			
		}
		
		public void delService(Object[] o){
			serviceach1 dbach = new serviceach1(context);
			
			boolean b = dbach.delService(o);
			Log.i("delete:","---"+b);
			
		}
		public void updateService(Object[] arg0){
			serviceach1 dbach = new serviceach1(context);
			
			boolean b = dbach.updateService(arg0);
			Log.i("updateDb:","---"+b);
		}
		public void updatebtService(Object[] arg0){
			serviceach1 dbach = new serviceach1(context);
			
			boolean b = dbach.updatebtService(arg0);
			Log.i("updateDb:","---"+b);
		}
		
		public Map<String, String> findService(String[] selectionArgs){
			serviceach1 dbach = new serviceach1(context);
		
			Map<String, String> map = dbach.findService(selectionArgs);
			
			Log.i("findDb","--" + map.toString());
			return map;
		}
		
		public void findAllService(){
			serviceach1 dbach = new serviceach1(context);
			//String[] selectionArgs = {"3"};
			List<Map<String, String>> list = dbach.findAllService(null);
			
			Log.i("findAllDb","--" + list.toString());
		}
		public List<Map<String,String>> findAllidService(String[] selectionArgs){
			serviceach1 dbach = new serviceach1(context);
		
			List<Map<String,String>> map = dbach.findAllidService(selectionArgs);
			
			Log.i("findDb","--" + map.toString());
			return map;
		}
}
