package com.example.assignment2;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;



public class Login_Form extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);


        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.button2);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

               openActivity2();
            }
        });
    }

   public void openActivity2()
   {
       Intent intent=new Intent(this,Login_Form.class);
       startActivity(intent);
   }

}
