package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.WindowManager;

public class HardChaWeiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				  WindowManager.LayoutParams.FLAG_FULLSCREEN);//����ȫ��
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE |
              WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);//�����������
		setContentView(R.layout.hard_chawei);
	}
	@Override
	protected void onResume() {
		/**
		  * ����Ϊ����
		  */
		if(getRequestedOrientation()!=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		}
		super.onResume();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hard_cha_wei, menu);
		return true;
	}

}
