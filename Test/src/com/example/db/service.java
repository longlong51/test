package com.example.db;

import java.util.List;
import java.util.Map;

public interface service {
	

	
	//��,ɾ,��,��
	
	public boolean addService(Object[] bindArgs);

	public boolean delService(Object[] bindArgs);
	
	public boolean updateService(Object[] bindArgs);
	
	public Map<String,String> findService(String[] selectionArgs);
	
	public List<Map<String,String>> findAllService(String[] selectionArgs);
	
	public List<Map<String,String>> findAllidService(String[] selectionArgs);
}
