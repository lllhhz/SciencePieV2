package com.sciencepie.mm.activity;

import java.util.ArrayList;
import java.util.List;


import com.sciencepie.mm.R;
import com.sciencepie.mm.adapter.CommPagerAdapter;
import com.sciencepie.mm.fragment.CommonFragmentPagerAdapter;
import com.sciencepie.mm.view.MyViewPager;



import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;

public class MainActivity extends FragmentActivity implements OnCheckedChangeListener{
	
	private RadioGroup main_tab_RadioGroup ;
	private MyViewPager main_viewPager ;
	private RadioButton radio_information , radio_project , radio_document , radio_help , radio_personal ;
	
	private InformationActivity mInformation;
	private ProjectActivity mProject;
	private DocumentActivity mDocument;
	private HelpActivity mHelp;
	private PersonalActivity mPersonal;

	private ArrayList<Fragment> fragmentList ;
	private List<View> mViewList = new ArrayList<View>();
	
	private LocalActivityManager mActManager;
	public static final String INFORMATION = "information";
	public static final String PERSONAL = "personal";
	public static final String DOCUMENT = "ducument";
	public static final String PROJECT = "project";
	public static final String HELP = "help";
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		mActManager = new LocalActivityManager(this,true);
		mActManager.dispatchCreate(savedInstanceState);
		InitView();
		InitViewPager();
	}
	
	public void InitView()
	{
		main_tab_RadioGroup = (RadioGroup) findViewById(R.id.main_tab_RadioGroup) ;
		main_viewPager = (MyViewPager) findViewById(R.id.main_content_viewpager);
		main_viewPager.setPagingEnabled(false);
		radio_information = (RadioButton) findViewById(R.id.main_tab_information) ;
		radio_project = (RadioButton) findViewById(R.id.main_tab_project) ;
		radio_document = (RadioButton) findViewById(R.id.main_tab_document) ;
		radio_help = (RadioButton) findViewById(R.id.main_tab_help) ;
		radio_personal = (RadioButton) findViewById(R.id.main_tab_personal) ;
		
		main_tab_RadioGroup.setOnCheckedChangeListener(this);
		
		
		
	}
	
	
	private View getView(String id,Intent intent){
		return mActManager.startActivity(id, intent).getDecorView();
	}
	
	
	
	public void InitViewPager()
	{

		mViewList.add(getView(INFORMATION,new Intent(this,InformationActivity.class)));
		mViewList.add(getView(PROJECT,new Intent(this,ProjectActivity.class)));
		mViewList.add(getView(DOCUMENT,new Intent(this,DocumentActivity.class)));
		mViewList.add(getView(HELP,new Intent(this,HelpActivity.class)));
		mViewList.add(getView(PERSONAL,new Intent(this,PersonalActivity.class)));
		
		
		
		
		CommPagerAdapter adapter = new CommPagerAdapter(mViewList);
		main_viewPager.setAdapter(adapter);
		main_viewPager.setCurrentItem(0);

        
        
        main_tab_RadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener(){

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == R.id.main_tab_information){
					main_viewPager.setCurrentItem(0);
				}else if(checkedId == R.id.main_tab_personal){
					main_viewPager.setCurrentItem(4);
				}
				else if(checkedId == R.id.main_tab_project){
					main_viewPager.setCurrentItem(1);
				}
				else if(checkedId == R.id.main_tab_document){
					main_viewPager.setCurrentItem(2);
				}
				else if(checkedId == R.id.main_tab_help){
					main_viewPager.setCurrentItem(3);
				}
			}
        	
        });
        
        
//		fragmentList = new ArrayList<Fragment>() ;
		
//		Fragment InformationFragment = new InformationFragment() ;
//		Fragment DocumentFragment = new DocumentFragment();
//		Fragment ProjectFragment = new ProjectFragment();
//		Fragment HelpFragment = new HelpFragment();
//		Fragment PersonalFragment = new PersonalFragment();
//		
//		//����Fragment����������
//		fragmentList.add(InformationFragment);
//		fragmentList.add(DocumentFragment);
//		fragmentList.add(ProjectFragment);
//		fragmentList.add(HelpFragment);
//		fragmentList.add(PersonalFragment);
		
		
		//����ViewPager��������
		//main_viewPager.setAdapter(new MyAdapter(getSupportFragmentManager() , fragmentList));
		//��ǰΪ��һ��ҳ��
		//main_viewPager.setCurrentItem(0);
		//ViewPager��ҳ��ı������
		//main_viewPager.setOnPageChangeListener(new MyListner());
	}
	


//	public class MyListner implements OnPageChangeListener
//	{
//
//		@Override
//		public void onPageScrollStateChanged(int arg0) {
//			
//		}
//
//		@Override
//		public void onPageScrolled(int arg0, float arg1, int arg2) {
//			
//		}
//
//		@Override
//		public void onPageSelected(int arg0) {
//			//��ȡ��ǰҳ�����ڸı��ӦRadioButton��״̬
//			int current = main_viewPager.getCurrentItem() ;
//			switch(current)
//			{
//			case 0:
//				main_tab_RadioGroup.check(R.id.radio_chats);
//				break;
//			case 1:
//				main_tab_RadioGroup.check(R.id.radio_contacts);
//				break;
//			case 2:
//				main_tab_RadioGroup.check(R.id.radio_discover);
//				break;
//			case 3:
//				main_tab_RadioGroup.check(R.id.radio_me);
//				break;
//			}
//		}
//	}
//	@Override
//	public void onCheckedChanged(RadioGroup arg0, int arg1) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	@Override
	public void onCheckedChanged(RadioGroup radioGroup, int CheckedId) 
	{
		//��ȡ��ǰ��ѡ�е�RadioButton��ID�����ڸı�ViewPager�ĵ�ǰҳ
		int current=0;
		switch(CheckedId)
		{
		case R.id.main_tab_information:
			current = 0 ;
			break ;
		case R.id.main_tab_project:
			current = 1 ;
			break;
		case R.id.main_tab_document:
			current = 2 ;
			break;
		case R.id.main_tab_help:
			current = 3 ;
			break ;
		case R.id.main_tab_personal:
			current = 4;
			break;
		}

	}

}
