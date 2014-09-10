package app.buusk.resume_55410659;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private Button btn1, btn2;
	private TextView txt11, txt12, txt13;
	private String show1,show2,show3;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ViewMatching();
		}
	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btnedit);
		btn2 = (Button) findViewById(R.id.btnimg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		txt11 = (TextView) findViewById(R.id.txt1);
		txt12 = (TextView) findViewById(R.id.txt2);
		txt13 = (TextView) findViewById(R.id.txt3);
		
		show1 = getIntent().getStringExtra("txt11");
		show2 = getIntent().getStringExtra("txt12");
		show3 = getIntent().getStringExtra("txt13");
		
		txt11.setText(show1);
		txt12.setText(show2);
		txt13.setText(show3);
	

	}
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnedit:

	Intent i = new Intent(getApplicationContext(), edit.class);
	startActivity(i);
	break;
	case R.id.btnimg:

	Intent j = new Intent(getApplicationContext(), ImageActivity.class);
	startActivity(j);

	break;

	default:
	break;
	}
	}
	}