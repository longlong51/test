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
		
		
		// ʵ�ֶ����ݿ����
		SQLiteDatabase sdb = null;
		try {
			String sql_insert = "insert into listview(number,pic,text,type,state) values(?,?,?,?,?)";
			// ʵ�ֶ����ݿ�д�Ĳ���
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
	}//------�����¼���� -----------------------------------
	//ɾ����¼
	@Override
	public boolean delService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// ʵ�ֶԼ�¼ɾ��
		SQLiteDatabase sdb = null;
		try {
			String sql_del = "delete from listview where number=?";
			// ʵ�ֶ����ݿ�д�Ĳ���
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
	}//----- ɾ����¼���� ---------------------------
	
	/*
	 * ����number����һ����¼
	 */
	@Override
	public boolean updateService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// ʵ�ֶ����ݿ��¼�޸�
		SQLiteDatabase sdb = null;
		try {
			String sql_update = "update listview set state=0 where number=?";
			// ʵ�ֶ����ݿ�д�Ĳ���
			
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
	}//----- ���¼�¼���� ----------------------------------
	/*
	 * ����id����һ����¼
	 */
	@Override
	public boolean updatebtService(Object[] bindArgs) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		// ʵ�ֶ����ݿ��¼�޸�
		SQLiteDatabase sdb = null;
		try {
			String sql_update = "update listview set state=1 where number=?";
			// ʵ�ֶ����ݿ�д�Ĳ���
			
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
	}//----- ���¼�¼���� ----------------------------------
	@Override
	public Map<String, String> findService(String[] selectionArgs) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		Log.i("serviceach", "found" );
		// ʵ�ֶ����ݿ���ҵ�����¼
		SQLiteDatabase sdb = null;
		try {
			String sql_find = "select password from users where id=?";
			// ʵ�ֶ����ݿ�д�Ĳ���
			sdb = helper.getWritableDatabase();
			Cursor cur = sdb.rawQuery(sql_find, selectionArgs);
			
			int cols = cur.getColumnCount();//��ȡ����
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
	}//---- ���ҵ�����¼END ---------------------------------------------------
	/**
	 * ����id�������м�¼
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
	}//----- �������еļ�¼END -------------------------------------------
	/**
	 * ��������id
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
	}//----- �������еļ�¼END -------------------------------------------
}
