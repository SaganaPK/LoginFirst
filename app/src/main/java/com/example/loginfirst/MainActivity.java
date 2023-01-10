package com.example.loginfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    EditText loginid1;
    MaterialButton nextbtn1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginid1 = findViewById(R.id.loginid);
        nextbtn1 = findViewById(R.id.nextbtn);

      //  String id = loginid.getText().toString();
        nextbtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String Loginid = loginid1.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Login", Loginid);
                startActivity(intent);
                finish();
            }
        });

    }
}