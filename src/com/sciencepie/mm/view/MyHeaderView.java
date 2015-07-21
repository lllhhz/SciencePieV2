package com.sciencepie.mm.view;

import java.net.ContentHandler;

import com.sciencepie.mm.R;
//import com.sciencepie.mm.application.MyApplication;



import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyHeaderView extends LinearLayout {

	public TextView tv=null;
	public LinearLayout headerContentView=null;
	public String [] headcontent=null;
	public Button[] headButtons=null;
	public View.OnClickListener[] onClickListeners=null;
	public ImageButton home_btn;
	public ImageButton setting;

	
	


	public MyHeaderView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.header_2, this);  
        

	}



	
	
	
	
	public MyHeaderView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.header_2, this);

	}


	
	
	

	

}
