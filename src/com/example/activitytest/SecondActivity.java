package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button1 = (Button) findViewById(R.id.button_2);
		Button button2 = (Button) findViewById(R.id.button_url);
		Button button3 = (Button) findViewById(R.id.button_dial);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Toast.makeText(SecondActivity.this, "close curent window", Toast.LENGTH_SHORT).show();
				finish();
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.qq.com"));
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent1 =new Intent(Intent.ACTION_DIAL);
				intent1.setData(Uri.parse("tel:10086"));
				startActivity(intent1);
			}
		});
	}
	


}
