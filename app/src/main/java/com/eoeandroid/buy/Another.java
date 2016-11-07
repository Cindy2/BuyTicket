package com.eoeandroid.buy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Another extends Activity{
	private TextView myTextView4=null;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		
		Intent intent=getIntent();
		String value=intent.getStringExtra("testIntent");
		
		myTextView4=(TextView)findViewById(R.id.myTextView4);
		myTextView4.setText(value);
		
				
	}
}