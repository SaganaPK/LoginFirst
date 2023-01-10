package com.example.loginfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    TextView lid ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        String str = intent.getStringExtra("Login");
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity2.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity2.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });

    }
}