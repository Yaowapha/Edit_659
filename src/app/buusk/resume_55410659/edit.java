package app.buusk.resume_55410659;


	 import android.app.Activity;
	 import android.content.Intent;
	 import android.os.Bundle;
	 import android.view.View;
	 import android.view.View.OnClickListener;
	 import android.widget.Button;
	 import android.widget.EditText;
	 import android.widget.TextView;
	 public class edit extends Activity implements OnClickListener {
		 private Button btnsubmit;
		 private EditText etxt1, etxt2, etxt3;
		 private String txt11, txt12, txt13;

		 @Override
		 protected void onCreate(Bundle savedInstanceState) {
		 setContentView(R.layout.edit_659);
		 super.onCreate(savedInstanceState);
		 ViewMatching();

		 }

		 private void ViewMatching() {
		 btnsubmit = (Button) findViewById(R.id.button1);
		 btnsubmit.setOnClickListener(this);
		 etxt1 = (EditText) findViewById(R.id.edt1);
		 etxt2 = (EditText) findViewById(R.id.edt2);
		 etxt3 = (EditText) findViewById(R.id.edt3);
		
		 }

		 @Override
		 public void onClick(View v) {
		 switch (v.getId()) {
		 case R.id.button1:
		 txt11 = (etxt1.getText().toString());
		 txt12 = (etxt2.getText().toString());
		 txt13 = (etxt3.getText().toString());
		
		 Intent R = new Intent(getApplicationContext(), MainActivity.class);
		 R.putExtra("txt11", txt11);
		 R.putExtra("txt12", txt12);
		 R.putExtra("txt13", txt13);
		
		 startActivity(R);
		 break;
		 default:
		 break;
		 }
		 }

		 }

