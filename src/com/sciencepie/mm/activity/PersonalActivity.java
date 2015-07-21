package com.sciencepie.mm.activity;




import com.sciencepie.mm.R;
import com.sciencepie.mm.view.CircularImage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class PersonalActivity extends Activity{
	
	private View mPersonalView,mAttention,mMessage,mCollect,mHelp,mTask,mSetting,mShare;
	private CircularImage avatar;
	private TextView score_tv,name_tv;
	
	
	
		@Override
		public void onCreate( Bundle savedInstanceState)
		{

			super.onCreate(savedInstanceState);
			
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.fragment_personal);
			initView();
			SetListener();
		}
		public void initView()
		{   
			//mPersonalView  = getLayoutInflater().inflate(R.layout.fragment_personal,null); 
			avatar =  (CircularImage) findViewById(R.id.avatar);
			name_tv = (TextView) findViewById(R.id.name);
			name_tv = (TextView) findViewById(R.id.score);
			mAttention = findViewById(R.id.my_attention);
			mMessage = findViewById(R.id.my_message);
			mCollect = findViewById(R.id.my_collect);
			mHelp = findViewById(R.id.my_help);
			mTask = findViewById(R.id.my_task);
			mSetting = findViewById(R.id.my_setting);
			mShare = findViewById(R.id.my_share);
		

			
		}
		private void SetListener()
		{
			avatar.setOnClickListener(onClickListener);
			mAttention.setOnClickListener(onClickListener);
			mMessage.setOnClickListener(onClickListener);
			mCollect.setOnClickListener(onClickListener);
			mHelp.setOnClickListener(onClickListener);
			mTask.setOnClickListener(onClickListener);
			mSetting.setOnClickListener(onClickListener);
			mShare.setOnClickListener(onClickListener);
		}
		
		private View.OnClickListener onClickListener=new OnClickListener() {

	
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.avatar:
					Toast.makeText(getApplicationContext(), "头像",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_attention:
					Toast.makeText(getApplicationContext(), "关注",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_message:
					Toast.makeText(getApplicationContext(), "消息",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_collect:
				Toast.makeText(getApplicationContext(), "收藏",
				     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_help:
					Toast.makeText(getApplicationContext(), "求助",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_task:
					Toast.makeText(getApplicationContext(), "任务",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_setting:
					Toast.makeText(getApplicationContext(), "设置",
						     Toast.LENGTH_SHORT).show();
					break;
				case R.id.my_share:
					Toast.makeText(getApplicationContext(), "分享",
						     Toast.LENGTH_SHORT).show();
					break;
				default:
					break;
				}
			}
	};
	}