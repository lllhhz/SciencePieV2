package com.sciencepie.mm.activity;

import java.util.ArrayList;
import java.util.HashMap;

import com.sciencepie.mm.R;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;



public class HelpActivity extends Activity{
	private	 TextView text_hot;
	private TextView text_project;
	private TextView text_document;
	private TextView text_help;
	private ListView list_hot;
	private  ListView list_project;
	private  ListView list_document;
	private  ListView list_help;
	@Override
	public void onCreate( Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fragment_help);
         text_hot = (TextView)findViewById(R.id.text_hot);
         text_project = (TextView)findViewById(R.id.text_project);
         text_document = (TextView)findViewById(R.id.text_document);
         text_help = (TextView)findViewById(R.id.text_help);
         list_hot = (ListView)findViewById(R.id.list_hot);
         list_project = (ListView)findViewById(R.id.list_project);
         list_document = (ListView)findViewById(R.id.list_document);
         list_help = (ListView)findViewById(R.id.list_help);
		    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
			HashMap<String,String> map1 = new HashMap<String,String>();
			HashMap<String,String> map2 = new HashMap<String,String>();
			HashMap<String,String> map3 = new HashMap<String,String>();
			HashMap<String,String> map4 = new HashMap<String,String>();
			HashMap<String,String> map5 = new HashMap<String,String>();
			map1.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
			map1.put("forum_comment", "文献速递 2015.05.30");
			map2.put("forum_title", "北京大学现代农学院-助教及以上的");
			map2.put("forum_comment", "招聘信息 2015.04.30");
			map3.put("forum_title", "China Oxford Scholarship Fund");
			map3.put("forum_comment", "访问学者 2015.04.20");
			map4.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
			map4.put("forum_comment", "文献速递 2015.05.30");
			map5.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
			map5.put("forum_comment", "文献速递 2015.05.30");
			list.add(map1);
			list.add(map2);
			list.add(map3);
			list.add(map4);
			list.add(map5);
			SimpleAdapter listAdapter = new SimpleAdapter(this,list, R.layout.comment,new String[]{"forum_title","forum_comment"},new int[]{R.id.forum_title,R.id.forum_comment});
			list_hot.setAdapter(listAdapter);
		    list_project.setAdapter(listAdapter);
		    list_document.setAdapter(listAdapter);
		    list_help.setAdapter(listAdapter);
		
		text_hot.setOnClickListener(new hotClickListener());
		text_project.setOnClickListener(new projectClickListener());
		text_document.setOnClickListener(new documentClickListener());
		text_help.setOnClickListener(new helpClickListener());
		
	}
//	   public void createlist(){
//		    ListView list_hot = (ListView)findViewById(R.id.list_hot);
//		    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
//			HashMap<String,String> map1 = new HashMap<String,String>();
//			HashMap<String,String> map2 = new HashMap<String,String>();
//			HashMap<String,String> map3 = new HashMap<String,String>();
//			HashMap<String,String> map4 = new HashMap<String,String>();
//			HashMap<String,String> map5 = new HashMap<String,String>();
//			map1.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
//			map1.put("forum_comment", "文献速递 2015.05.30");
//			map2.put("forum_title", "北京大学现代农学院-助教及以上的");
//			map2.put("forum_comment", "招聘信息 2015.04.30");
//			map3.put("forum_title", "China Oxford Scholarship Fund");
//			map3.put("forum_comment", "访问学者 2015.04.20");
//			map4.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
//			map4.put("forum_comment", "文献速递 2015.05.30");
//			map5.put("forum_title", "复方中草药对尼罗罗非鱼非特异性免疫功能的影响");
//			map5.put("forum_comment", "文献速递 2015.05.30");
//			list.add(map1);
//			list.add(map2);
//			list.add(map3);
//			list.add(map4);
//			list.add(map5);
//			SimpleAdapter listAdapter = new SimpleAdapter(this,list, R.layout.comment,new String[]{"forum_title","forum_comment"},new int[]{R.id.forum_title,R.id.forum_comment});
//			list_hot.setAdapter(listAdapter);
//	   }
	   class hotClickListener implements OnClickListener{
          
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			    text_hot = (TextView)findViewById(R.id.text_hot);
		         text_project = (TextView)findViewById(R.id.text_project);
		         text_document = (TextView)findViewById(R.id.text_document);
		         text_help = (TextView)findViewById(R.id.text_help);
		         list_hot = (ListView)findViewById(R.id.list_hot);
		         list_project = (ListView)findViewById(R.id.list_project);
		         list_document = (ListView)findViewById(R.id.list_document);
		         list_help = (ListView)findViewById(R.id.list_help);
			String text;
			text=(String) text_hot.getText();
		    if (text=="- 热门讨论区")
			{
		    	text_hot.setText("+ 热门讨论区");
		    	list_hot.setVisibility(View.GONE);
		    	
		    }
		    else
		    { 
		    	text_hot.setText("- 热门讨论区");
		    	text_project.setText("+ 项目申报讨论区");
		    	text_document.setText("+ 文献速递讨论区");
		    	text_help.setText("+ 互助讨论区");
		    	list_hot.setVisibility(View.VISIBLE);
		    	list_project.setVisibility(View.GONE);
		    	list_document.setVisibility(View.GONE);
		    	list_help.setVisibility(View.GONE);
		    }
		}
	   }
	   class projectClickListener implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  text_hot = (TextView)findViewById(R.id.text_hot);
			         text_project = (TextView)findViewById(R.id.text_project);
			         text_document = (TextView)findViewById(R.id.text_document);
			         text_help = (TextView)findViewById(R.id.text_help);
			         list_hot = (ListView)findViewById(R.id.list_hot);
			         list_project = (ListView)findViewById(R.id.list_project);
			         list_document = (ListView)findViewById(R.id.list_document);
			         list_help = (ListView)findViewById(R.id.list_help);
				String text;
				text=(String) text_project.getText();
			    if (text=="- 项目申报讨论区")
				{
			    	text_project.setText("+ 项目申报讨论区");
			    	list_project.setVisibility(View.GONE);
			    	
			    }
			    else
			    { 
			    	text_hot.setText("+ 热门讨论区");
			    	text_project.setText("- 项目申报讨论区");
			    	text_document.setText("+ 文献速递讨论区");
			    	text_help.setText("+ 互助讨论区");
			    	list_hot.setVisibility(View.GONE);
			    	list_project.setVisibility(View.VISIBLE);
			    	list_document.setVisibility(View.GONE);
			    	list_help.setVisibility(View.GONE);
			    }
			}
		   }
	   class documentClickListener implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  text_hot = (TextView)findViewById(R.id.text_hot);
			         text_project = (TextView)findViewById(R.id.text_project);
			         text_document = (TextView)findViewById(R.id.text_document);
			         text_help = (TextView)findViewById(R.id.text_help);
			         list_hot = (ListView)findViewById(R.id.list_hot);
			         list_project = (ListView)findViewById(R.id.list_project);
			         list_document = (ListView)findViewById(R.id.list_document);
			         list_help = (ListView)findViewById(R.id.list_help);
				String text;
				text=(String) text_document.getText();
			    if (text=="- 文献速递讨论区")
				{
			    	text_document.setText("+ 文献速递讨论区");
			    	list_document.setVisibility(View.GONE);
			    	
			    }
			    else
			    { 
			    	text_hot.setText("+ 热门讨论区");
			    	text_project.setText("+ 项目申报讨论区");
			    	text_document.setText("- 文献速递讨论区");
			    	text_help.setText("+ 互助讨论区"); 
			    	list_hot.setVisibility(View.GONE);
			    	list_project.setVisibility(View.GONE);
			    	list_document.setVisibility(View.VISIBLE);
			    	list_help.setVisibility(View.GONE);
			    }
			}
		   }
	   class helpClickListener implements OnClickListener{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  text_hot = (TextView)findViewById(R.id.text_hot);
			         text_project = (TextView)findViewById(R.id.text_project);
			         text_document = (TextView)findViewById(R.id.text_document);
			         text_help = (TextView)findViewById(R.id.text_help);
			         list_hot = (ListView)findViewById(R.id.list_hot);
			         list_project = (ListView)findViewById(R.id.list_project);
			         list_document = (ListView)findViewById(R.id.list_document);
			         list_help = (ListView)findViewById(R.id.list_help);
				String text;
				text=(String) text_help.getText();
			    if (text=="- 互助讨论区")
				{
			    	text_help.setText("+ 互助讨论区");
			    	list_help.setVisibility(View.GONE);
			    	
			    }
			    else
			    { 
			    	text_hot.setText("+ 热门讨论区");
			    	text_project.setText("+ 项目申报讨论区");
			    	text_document.setText("+ 文献速递讨论区");
			    	text_help.setText("- 互助讨论区");
			    	list_hot.setVisibility(View.GONE);
			    	list_project.setVisibility(View.GONE);
			    	list_document.setVisibility(View.GONE);
			    	list_help.setVisibility(View.VISIBLE);
			    }
			}
		   }
}