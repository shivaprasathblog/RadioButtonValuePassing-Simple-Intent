package com.example.radiobuttonvaluepassingintent_simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends Activity 
{
	RadioButton r1;
	Button b1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		r1=(RadioButton)findViewById(R.id.radioButton1);
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				
				Intent i =new Intent(MainActivity.this,Activity2.class);
				
				String radiovalue=r1.getText().toString();
				
				i.putExtra("key_radio",radiovalue);
				
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
