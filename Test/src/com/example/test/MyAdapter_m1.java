package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.db_listview.manager1;
import com.example.model.Button_enroll;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter_m1 extends BaseAdapter {
	/*
	 * public List<ActionEntity> getData() { // TODO Auto-generated method stub
	 * //List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	 * List<ActionEntity> list = new ArrayList<ActionEntity>();
	 * 
	 * ActionEntity item1 = new ActionEntity();
	 * 
	 * item1.setPic(R.drawable.pic);
	 * item1.setText("主题：读书交流分享会\n时间：2017.05.04\n地点：学术报告厅");
	 * 
	 * Map<String, Object> map = new HashMap<String, Object>();
	 * map.put("new_list",R.drawable.pic);
	 * 
	 * map.put("uName", "主题：读书交流分享会\n时间：2017.05.04\n地点：学术报告厅");
	 * 
	 * Map<String, Object> map1 = new HashMap<String, Object>();
	 * map1.put("new_list",R.drawable.pic);
	 * 
	 * map1.put("uName", "主题：辩论赛\n时间：2017.04.05\n地点：J楼教室");
	 * 
	 * Map<String, Object> map2 = new HashMap<String, Object>();
	 * map2.put("new_list",R.drawable.pic);
	 * 
	 * map2.put("uName", "主题：篮球赛\n时间：2016.12.10\n地点：欣苑篮球场");
	 * 
	 * Map<String, Object> map3 = new HashMap<String, Object>();
	 * map3.put("new_list",R.drawable.pic);
	 * 
	 * map3.put("uName", "主题：软件开发讲座\n时间：2016.09.04\n地点：W楼教室");
	 * 
	 * Map<String, Object> map4 = new HashMap<String, Object>();
	 * map4.put("new_list",R.drawable.pic);
	 * 
	 * map4.put("uName", "主题：团日活动答辩\n时间：2016.08.08\n地点：L楼教室");
	 * 
	 * list.add(map); list.add(map1); list.add(map2); list.add(map3);
	 * list.add(map4);
	 * 
	 * return list; }
	 */
	private List<Button_enroll> mEnroll;// 数据    
	private LayoutInflater mInflater;// LayoutInflater 加载布局
	private Button button_cancel;
	private Context context;
	private MyAdapter_m1 adapter;

	// 自定义构造器，接收数据和加载布局的LayoutInflater对象。
	public MyAdapter_m1(Context context, List<Button_enroll> mEnroll,
			LayoutInflater mInflater) {
		this.mEnroll = mEnroll;
		this.mInflater = mInflater;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mEnroll.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(final int position, View convertView,
			ViewGroup viewGroup) {
		// TODO Auto-generated method stub
		// ViewHolder创建对象。        
		final ViewHolder viewHolder;
		// 获得该Item下的活动对象。
		final Button_enroll enroll = mEnroll.get(position);

		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_list_m1, null);
			viewHolder = new ViewHolder();
			viewHolder.button_cancel = (Button) convertView
					.findViewById(R.id.button_cancel);
			viewHolder.image_list = (ImageView) convertView
					.findViewById(R.id.image_list);
			viewHolder.text_item1 = (TextView) convertView
					.findViewById(R.id.item1);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.image_list.setImageResource(enroll.getPic());
		viewHolder.text_item1.setText(enroll.getText());
		if(viewHolder.button_cancel.getText().toString().equals("取消报名"))
		viewHolder.button_cancel.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "已取消报名", 1).show();

				Object[] num = { enroll.getNumber()+"" };
				Log.i("num", "number" + num);
				viewHolder.button_cancel.setText("报名");
				manager1 ma = new manager1(context);
				ma.updateService(num);

			}
		});
		else
			viewHolder.button_cancel.setOnClickListener(new View.OnClickListener() {

				@Override
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Toast.makeText(context, "报名成功", 1).show();

					Object[] num = { enroll.getNumber()+"" };
					Log.i("num", "number" + num);
					viewHolder.button_cancel.setText("取消报名");
					manager1 ma = new manager1(context);
					ma.updatebtService(num);
				}
			});
		return convertView;
	}

	class ViewHolder {
		Button button_cancel;
		ImageView image_list;
		TextView text_item1;
	}

}
