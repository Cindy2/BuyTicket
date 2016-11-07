package com.eoeandroid.buy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
/**
 * Description: 
 * <br/>Program Name:
 * <br/>Date:2015-10-01
 * @author  Cindy
 * @version  1.0
 */
public class MainActivity extends Activity {
	public Button myButton1=null;
	public Button myButton2=null;
	public Button myButton3=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView myTextView1=(TextView)findViewById(R.id.myTextView1);
		TextView myTextView2=(TextView)findViewById(R.id.myTextView2);
		TextView myTextView3=(TextView)findViewById(R.id.myTextView3);
		
		
		Button myButton1=(Button)findViewById(R.id.myButton1);
		Button myButton2=(Button)findViewById(R.id.myButton2);
		Button myButton3=(Button)findViewById(R.id.myButton3);
		
		myTextView1.setText("深圳北-潮汕：" +
				" 2015-09-17  8:00-11:50");
		myButton1.setText("预订");
		myTextView2.setText("深圳北-潮汕：" +
				" 2015-09-17 10:00-13:50");
		myButton2.setText("预订");	
		myTextView3.setText("深圳北-潮汕：" +
				" 2015-09-17 15:00-18:50");
		myButton3.setText("预订");
		//优点：此处设计它们为相同
		myButton1.setOnClickListener(new MyButtonListener());
		myButton2.setOnClickListener(new MyButtonListener());
		myButton3.setOnClickListener(new MyButtonListener());
	}		
class MyButtonListener implements OnClickListener
{
		@Override
		public void onClick(View v) {
			
			Intent intent=new Intent();
			intent.putExtra("testIntent", "恭喜您，预订成功。");
			intent.setClass(MainActivity.this,Another.class);
			MainActivity.this.startActivity(intent);
			
	    
		   
		}
		//Toast.makeText(this, "正在帮您提交...",1).show();
		
	  
		}
}			
			



