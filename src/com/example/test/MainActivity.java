package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn001 = null;
	private Button btn002 = null;
	private Button btn003 = null;
	private Button btn004 = null;
	private Button btn005 = null;
	private Button btn006 = null;
	private Button btn007 = null;
	private Button btn008 = null;
	private Button btn009 = null;
	private Button btn0010 = null;
	private Button btn0011 = null;
	private Button btn0012 = null;
	private Button btn0013 = null;
	private Button btn0014 = null;
	private Button btn0015 = null;
	private Button btn0016 = null;
	private Button btn0017 = null;
	private Button btn0018 = null;
	private Button btn0019 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				  WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE |
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);//不弹出软键盘
		setContentView(R.layout.activity_main);
		
		btn001 = (Button)this.findViewById(R.id.BanzuGaikuang);
		btn002 = (Button)this.findViewById(R.id.ChengWuBaoGao1);
		btn003 = (Button)this.findViewById(R.id.DongCheAnQuan);
		btn004 = (Button)this.findViewById(R.id.DongCheMieHuo);
		btn005 = (Button)this.findViewById(R.id.FangHuoLeader);
		btn006 = (Button)this.findViewById(R.id.HardChaWei);
		btn007 = (Button)this.findViewById(R.id.HuoZaiMark);
		btn008 = (Button)this.findViewById(R.id.leader);
		btn009 = (Button)this.findViewById(R.id.MieHuoPeiZhi02);
		btn0010 = (Button)this.findViewById(R.id.MieHuoPeiZhi01);
		btn0011 = (Button)this.findViewById(R.id.RiChangBase);
		btn0012 = (Button)this.findViewById(R.id.SafeRemark);
		btn0013 = (Button)this.findViewById(R.id.SafeRemark);
		btn001.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(BanzuGiakuangActivity.class);
			}
		});
		btn002.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(ChengWUActivity.class);
			}
		});
		btn003.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(DongCheAnQuanActivity.class);
			}
		});
		btn004.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(DongcheMiehuoActivity.class);
			}
		});
		btn005.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(FangHuoLeaderActivity.class);
			}
		});
		btn006.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(HardChaWeiActivity.class);
			}
		});
		btn007.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(HuoZaiMarkActivity.class);
			}
		});
		btn008.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(LeaderActivity.class);
			}
		});
		btn009.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(MieHuoPeiZhiActivity.class);
			}
		});
		btn0010.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(MieHuoPeiZhi.class);
			}
		});
		btn0011.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(RiChangBaseActivity.class);
			}
		});
		btn0012.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(SafeRemarkActivity.class);
			}
		});
		btn0013.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				openNewIntent(SafeTaiZhangActivity.class);
			}
		});
	}

	private void openNewIntent(Class cls){
		Intent intent = new Intent();
		intent.setClass(this, cls);
		startActivity(intent);
	}
	
	
	@Override
	protected void onResume() {
		/**
		  * 设置为横屏
		  */
		if(getRequestedOrientation()!=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		}
		super.onResume();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
