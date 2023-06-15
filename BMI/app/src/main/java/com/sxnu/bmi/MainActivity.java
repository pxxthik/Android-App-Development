package com.sxnu.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeightFt, edtHeightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llMain;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        llMain = findViewById(R.id.llMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int in = Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn = ft*12 + in;
                double totalM = (totalIn*2.53)/100;

                double bmi = wt/(totalM*totalM);

                if(bmi>25){
                    txtResult.setText("You are Over Weight");
                    llMain.setBackgroundColor(getColor(R.color.colorOver));
                }else if(bmi<18){
                    txtResult.setText("You are Under Weight");
                    llMain.setBackgroundColor(getColor(R.color.colorUnder));
                }else{
                    txtResult.setText("You are Healthy");
                    llMain.setBackgroundColor(getColor(R.color.colorHealthy));
                }
            }
        });



    }
}