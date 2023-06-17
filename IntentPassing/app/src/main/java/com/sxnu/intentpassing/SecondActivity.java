package com.sxnu.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtRollNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();

        Intent secondIntent = getIntent();
        String title = secondIntent.getStringExtra("title");
        int rollNumber = secondIntent.getIntExtra("rollNumber", -1);

        String setRollNumber = txtRollNumber.getText().toString() + rollNumber;
        txtRollNumber.setText(setRollNumber);
        getSupportActionBar().setTitle(title);

    }

    private void init(){
        txtRollNumber = findViewById(R.id.txtRollNumber);
    }
}