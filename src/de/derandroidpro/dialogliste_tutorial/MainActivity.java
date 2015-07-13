package de.derandroidpro.dialogliste_tutorial;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	
	public Button btn1, btn2;
	public AlertDialog.Builder dialogbuilder1;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(this);
		
		
		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1:{
			
			LayoutInflater dialoginflater = getLayoutInflater();
			View dialogview = dialoginflater.inflate(R.layout.dialog_layout, null);
			
			
			dialogbuilder1 = new AlertDialog.Builder(MainActivity.this);
			dialogbuilder1.setTitle("Dialog");
			dialogbuilder1.setIcon(R.drawable.ic_launcher);
			dialogbuilder1.setView(dialogview);
					
			btn2 = (Button)		dialogview.findViewById(R.id.button2);
			btn2.setOnClickListener(this);
					
					
					
		
			
			dialogbuilder1.create().show();
			
			break;
		}
		
		
		case R.id.button2:{
			Toast.makeText(getApplicationContext(), "btn2", Toast.LENGTH_SHORT).show();
			
			break;
		}
		
		}
		
	}

	
}
