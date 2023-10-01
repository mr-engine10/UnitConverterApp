package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText;
        TextView result_textView, welcome_textView;
        Button btn;

        editText = findViewById(R.id.editText);
        result_textView = findViewById(R.id.result_textView);
        welcome_textView = findViewById(R.id.welcome_textView);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilos_entered = Double.parseDouble(editText.getText().toString());
                result_textView.setText(""+convertToPounds(kilos_entered) + " lb");
            }
        });


    }

    public double convertToPounds(double kilos){

        double pounds_result = kilos * 2.20462;
        return pounds_result;

    }
}