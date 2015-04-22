package com.example.singletouchview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final FrameLayout mLayout = (FrameLayout) findViewById(R.id.content);
		
		final Drawable d = getResources().getDrawable(R.drawable.scale);
		
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(mLayout.getChildCount() > 2) return;
				SingleTouchView singleTouchView = new SingleTouchView(MainActivity.this);
				singleTouchView.setImageDrawable(d);
				mLayout.addView(singleTouchView);
			}
		});
		
		
		
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_settings:
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://blog.csdn.net/xiaanming"));
				startActivity(intent);
				return true;
			default:
				return false;
		}
	}
	

}
