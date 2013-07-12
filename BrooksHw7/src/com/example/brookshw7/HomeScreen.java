package com.example.brookshw7;

import android.app.Activity;
import android.view.View;
import android.content.*;
import android.os.Bundle;
import android.widget.Button;
import android.content.*;

public class HomeScreen extends Activity {
	
	private static final int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1;
	private static final int CONFIGURE_PREFERENCES_REQUEST_CODE = 2;
	private static final int GET_JOBS_LIST_REQUEST_CODE = 3;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
		final Button btnConfigurePreferences = (Button) findViewById(R.id.ConfigurePreferences);
		btnConfigurePreferences.setOnClickListener(new Button.OnClickListener() {
			 
	    public void onClick(View v) {
	    	try {
	    		startActivityForResult(new Intent(v.getContext(), ConfigurePreferences.class), CONFIGURE_PREFERENCES_REQUEST_CODE);
	    	}
	    	catch(Exception e){

	    	}
	    }
	    });
		
		final Button btnRetrieveFromServer = (Button) findViewById(R.id.RetrieveFromServer);
		btnRetrieveFromServer.setOnClickListener(new Button.OnClickListener() {
	    public void onClick(View v) {
	    try {
	    }
	    catch (Exception e) {
	    }
	    }
	    });
		
		final Button btnManageAssignment = (Button) findViewById(R.id.ManageAssignment);
		btnManageAssignment.setOnClickListener(new Button.OnClickListener() {
	    public void onClick(View v) {
	    	try {
	    		startActivityForResult(new Intent(v.getContext(), ManageAssignment.class),
	    				MANAGE_ASSIGNMENTS_REQUEST_CODE);
	    	}
	    	catch (Exception e) {
	    		
	    	}
	    }
	    });
		
	}
		@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data){
		switch(requestCode){
		case MANAGE_ASSIGNMENTS_REQUEST_CODE:

		break;
		case CONFIGURE_PREFERENCES_REQUEST_CODE:

		break;
		case GET_JOBS_LIST_REQUEST_CODE:

		break;
		}
		
	}
}