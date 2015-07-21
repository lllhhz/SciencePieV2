package com.sciencepie.mm.activity;

import com.sciencepie.mm.R;
import com.sciencepie.mm.fragment.CommonFragmentPagerAdapter;
import com.sciencepie.mm.fragment.TestFragment;
import com.sciencepie.mm.listener.CommonCallback;
import com.sciencepie.mm.view.MyScrollHeaderView;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;



public class InformationActivity extends FragmentActivity{
	
	    private MyScrollHeaderView mScrollHeader;
	    private ViewPager mViewPager;
	    private FragmentManager mFm;
	    private CommonFragmentPagerAdapter mPagerAdapter;
		@Override
		public void onCreate( Bundle savedInstanceState)
		{

			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.fragment_information);
			mScrollHeader = (MyScrollHeaderView) findViewById(R.id.information_scroll_header);
			mScrollHeader.addScrollHeaderItem(this,getResources().getStringArray(R.array.news_header_strings));
			mViewPager = (ViewPager) findViewById(R.id.fragment_viewpager);
			mFm = this.getSupportFragmentManager();
			TestFragment test1 = new TestFragment();
			TestFragment test2 = new TestFragment();
			TestFragment test3 = new TestFragment();
			TestFragment test4 = new TestFragment();
			TestFragment test5 = new TestFragment();
			mPagerAdapter = new CommonFragmentPagerAdapter (mFm,new Fragment[]{test1,test2,test3,test4,test5});
			mViewPager.setAdapter(mPagerAdapter);
			mViewPager.setCurrentItem(0);
			mScrollHeader.setMyScrollCallback(new CommonCallback(){

				@Override
				public void callback(Object obj) {
					// TODO Auto-generated method stub
					int id = (Integer) obj;
					mViewPager.setCurrentItem(id);

				}
				
			});
			
			mScrollHeader.setCurrentTab(0);
			mViewPager.setOnPageChangeListener(new OnPageChangeListener(){

				@Override
				public void onPageScrollStateChanged(int arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onPageScrolled(int arg0, float arg1, int arg2) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onPageSelected(int position) {
					// TODO Auto-generated method stub
					mScrollHeader.setCurrentTab(position);
				}
				
			});
			

		}
		
		
	}