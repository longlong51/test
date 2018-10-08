package com.example.db;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class manager {
	/*
	 * 实现数据库操作类
	 */ private DbHelper helper;
		private SQLiteDatabase db;
		private Context context;
		
		
		public manager(Context context){
			this.context = context;
			createDb();
		}	
		
		/*
		 * 以下是接口DbService的使用
		 * */
		
		public void createDb(){
			DbHelper helper = new DbHelper(context);
			helper.getWritableDatabase();
		    
		}
		
		public void insertService(Object[] o){
			serviceach dbach = new serviceach(context);
			boolean b = dbach.addService(o);
			Log.i("insert:","---"+b);
			
		}
		
		public void delService(Object[] o){
			serviceach dbach = new serviceach(context);
			
			boolean b = dbach.delService(o);
			Log.i("delete:","---"+b);
			
		}
		public void updateService(Object[] arg0){
			serviceach dbach = new serviceach(context);
			
			boolean b = dbach.updateService(arg0);
			Log.i("updateDb:","---"+b);
		}
		
		public Map<String, String> findService(String[] selectionArgs){
			serviceach dbach = new serviceach(context);
		
			Map<String, String> map = dbach.findService(selectionArgs);
			
			Log.i("findDb","--" + map.toString());
			return map;
		}
		
		public void findAllService(){
			serviceach dbach = new serviceach(context);
			//String[] selectionArgs = {"3"};
			List<Map<String, String>> list = dbach.findAllService(null);
			
			Log.i("findAllDb","--" + list.toString());
		}
		public List<Map<String,String>> findAllidService(String[] selectionArgs){
			serviceach dbach = new serviceach(context);
		
			List<Map<String,String>> map = dbach.findAllidService(selectionArgs);
			
			Log.i("findDb","--" + map.toString());
			return map;
		}
}
