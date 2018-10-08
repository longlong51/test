package com.example.db_listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class serviceach1 implements service1 {
	private DbHelper1 helper = null;
	
	public serviceach1(Context context){
		helper = new DbHelper1(context);
	}

	public boolean addService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		Log.i("serviceach1", "inserted" + bindArgs.length);
		
		
		// 实现对数据库添加
		SQLiteDatabase sdb = null;
		try {
			String sql_insert = "insert into listview(number,pic,text,type,state) values(?,?,?,?,?)";
			// 实现对数据库写的操作
			sdb = helper.getWritableDatabase();
			sdb.execSQL(sql_insert, bindArgs);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (sdb != null)
				sdb.close();
		}
		return b;
	}//------插入记录结束 -----------------------------------
	//删除记录
	@Override
	public boolean delService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// 实现对记录删除
		SQLiteDatabase sdb = null;
		try {
			String sql_del = "delete from listview where number=?";
			// 实现对数据库写的操作
			sdb = helper.getWritableDatabase();
			sdb.execSQL(sql_del, bindArgs);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (sdb != null)
				sdb.close();
		}
		
		return b;
	}//----- 删除记录结束 ---------------------------
	
	/*
	 * 根据number更新一条记录
	 */
	@Override
	public boolean updateService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// 实现对数据库记录修改
		SQLiteDatabase sdb = null;
		try {
			String sql_update = "update listview set state=0 where number=?";
			// 实现对数据库写的操作
			
			sdb = helper.getWritableDatabase();
			sdb.execSQL(sql_update, bindArgs);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (sdb != null)
				sdb.close();
		}
		
		return b;
	}//----- 更新记录结束 ----------------------------------
	/*
	 * 根据id更新一条记录
	 */
	@Override
	public boolean updatebtService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// 实现对数据库记录修改
		SQLiteDatabase sdb = null;
		try {
			String sql_update = "update listview set state=1 where number=?";
			// 实现对数据库写的操作
			
			sdb = helper.getWritableDatabase();
			sdb.execSQL(sql_update, bindArgs);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (sdb != null)
				sdb.close();
		}
		
		return b;
	}//----- 更新记录结束 ----------------------------------
	@Override
	public Map<String, String> findService(String[] selectionArgs) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		Log.i("serviceach", "found" );
		// 实现对数据库查找单条记录
		SQLiteDatabase sdb = null;
		try {
			String sql_find = "select password from users where id=?";
			// 实现对数据库写的操作
			sdb = helper.getWritableDatabase();
			Cursor cur = sdb.rawQuery(sql_find, selectionArgs);
			
			int cols = cur.getColumnCount();//获取列数
			for(;cur.moveToNext();){
				for(int i = 0; i < cols; i++){
					String colName = cur.getColumnName(i);//
					String colValue = cur.getString(cur.getColumnIndex(colName));
					if(colValue == null){
						colValue = "";						
					}
					map.put(colName, colValue);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (sdb != null)
				sdb.close();
		}		
		
		return map;
	}//---- 查找单条记录END ---------------------------------------------------
	/**
	 * 根据id查找所有记录
	 */
	@Override
	public List<Map<String, String>> findAllService(String[] selectionArgs) {
		// TODO Auto-generated method stub
		Map<String, String> map = null;
		List<Map<String, String>> listMaps = new ArrayList<Map<String,String>>();
		
		SQLiteDatabase sdb = null;
		String sql_findAlls = "select * from listview";
		try {
			sdb = helper.getWritableDatabase();
			Cursor cur = sdb.rawQuery(sql_findAlls, selectionArgs);
			int cols = cur.getColumnCount();
			for(; cur.moveToNext();){
				map = new HashMap<String, String>();
				for(int i = 0; i < cols; i++){
					String colName = cur.getColumnName(i);
					String colValue = cur.getString(cur.getColumnIndex(colName));
					if(colValue == null){
						colValue = "";
					}
					map.put(colName, colValue);
				}
				listMaps.add(map);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sdb != null)
				sdb.close();
		}
		return listMaps;
	}//----- 查找所有的记录END -------------------------------------------
	/**
	 * 查找所有id
	 */
	@Override
	public List<Map<String,String>> findAllidService(String[] selectionArgs) {
		// TODO Auto-generated method stub
		Map<String, String> map = null;
		List<Map<String, String>> listMaps = new ArrayList<Map<String,String>>();
		
		SQLiteDatabase sdb = null;
		String sql_findAlls = "select id from users";
		try {
			sdb = helper.getWritableDatabase();
			Cursor cur = sdb.rawQuery(sql_findAlls, selectionArgs);
			int cols = cur.getColumnCount();
			for(; cur.moveToNext();){
				map = new HashMap<String, String>();
				for(int i = 0; i < cols; i++){
					String colName = cur.getColumnName(i);
					String colValue = cur.getString(cur.getColumnIndex(colName));
					if(colValue == null){
						colValue = "";
					}
					map.put(colName, colValue);
				}
				listMaps.add(map);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sdb != null)
				sdb.close();
		}
		return listMaps;
	}//----- 查找所有的记录END -------------------------------------------
}
