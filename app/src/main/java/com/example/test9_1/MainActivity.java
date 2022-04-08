package com.example.test9_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2;
    MyView myview1;
    MyView2 myview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        myview1 = (MyView) findViewById(R.id.myview1);
        myview2 = (MyView2) findViewById(R.id.myview2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton1.isChecked() == true){
                    myview1.setVisibility(View.VISIBLE);
                    myview2.setVisibility(View.INVISIBLE);
                }
                else{
                    myview1.setVisibility(View.INVISIBLE);
                    myview2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}