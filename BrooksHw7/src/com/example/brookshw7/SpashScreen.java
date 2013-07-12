package com.example.brookshw7;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.content.*;

public class SpashScreen extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spash_screen);
        
        Handler h = new Handler();
        h.postDelayed(new HomeScreenActivator(), 5000);
    }
	
	class HomeScreenActivator implements Runnable {
		
		public void run() {
			
			startActivity(new Intent( getApplication(), HomeScreen.class));
			
			finish();
		}
	}
}
