package com.example.akash.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    EditText inred;
    EditText usded;
    RadioButton toUSDrb;
    RadioButton toINRrb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inred = (EditText)findViewById(R.id.inred);
        usded = (EditText)findViewById(R.id.usded);
       // toUSDrb = (RadioButton)findViewById(R.id.toUSDrb);
       // toINRrb = (RadioButton) findViewById(R.id.toINRrb);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
           }

 @Override
    public void onClick(View v) {
     Editable edb1 = inred.getText();
     Editable edb2 = usded.getText();
     String s1 = edb1.toString();
     String s2 = edb2.toString();
     if (s1.length() == 0 && s2.length() == 0) {
         inred.setError("Invalid");
         usded.setError("Invalid");
     } else if (s1.length() != 0 && s2.length() != 0) {
         inred.setError("Invalid");
         usded.setError("Invalid");
     } else if (s1.length() != 0 && s2.length() == 0) {
         String res = Convert.toUSD(s1);

         Toast t1 = Toast.makeText(this, res, Toast.LENGTH_LONG);
         t1.show();
     } else {
         String res = Convert.toINR(s2);
         Toast t1 = Toast.makeText(this, res, Toast.LENGTH_LONG);
         t1.show();


     }

 }
}




