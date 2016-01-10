package com.example.voicetotext_2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash);
		
		Thread timer = new Thread()
		{
			public void run(){
				try{
					sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally{
					Intent i = new Intent(getApplicationContext(),MainActivity.class);
					startActivity(i);
				}
			}
		};
		timer.start();

	}

}
