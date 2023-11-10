package com.example.baithuchanhnhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Number extends AppCompatActivity {
    ImageView btnbackcontinue;
    ImageButton btnnextnumber;
    TextView txtphone;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        btnbackcontinue = findViewById(R.id.backsignIn);
        btnbackcontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnnextnumber = findViewById(R.id.btn_next_number);
        txtphone = findViewById(R.id.txtphonenumber);
        btnnextnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtphone.getText()==null || txtphone.length()<9)
                {
                    txtphone.setError("Phone sai hoac thieu so");
                }else{
                    startActivity(new Intent(Number.this,Verification.class));
                }
            }
        });
    }
}