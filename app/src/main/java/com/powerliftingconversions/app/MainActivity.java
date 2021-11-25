package com.powerliftingconversions.app;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn, btn1, btn2;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView) findViewById(R.id.textView);
        btn=(Button) findViewById(R.id.button);
        btn1=(Button) findViewById(R.id.button2);
        input = (EditText) findViewById(R.id.txtEdit);
        txt.setText("Plates Needed");
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String in = input.getText().toString();
                double num = Double.parseDouble(in);
                String output = "";
                num = num - 45; //subtract bar weight
                while(num >= 90) {
                        num = num - 90;
                        output = output + "45, ";
                }
                while(num >= 70){
                    num = num - 70;
                    output = output + "35, ";
                }
                while(num >= 50){
                    num = num - 50;
                    output = output + "25, ";
                }
                while(num >= 20){
                    num = num - 20;
                    output = output + "10, ";
                }
                while(num >= 10){
                    num = num - 10;
                    output = output + "5, ";
                }
                while(num >= 5){
                    num = num - 5;
                    output = output + "2.5.";
                }

                txt.setText(output);
            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String in = input.getText().toString();
                double num = Double.parseDouble(in);
                String output = "";
                num = num - 20; //subtract bar weight
                while(num >= 50) {
                    num = num - 50;
                    output = output + "25, ";
                }
                while(num >= 40){
                    num = num - 40;
                    output = output + "20, ";
                }
                while(num >= 30){
                    num = num - 30;
                    output = output + "15, ";
                }
                while(num >= 20){
                    num = num - 20;
                    output = output + "10, ";
                }
                while(num >= 10){
                    num = num - 10;
                    output = output + "5, ";
                }
                while(num >= 5){
                    num = num - 5;
                    output = output + "2.5, ";
                }
                while(num >= 2.5){
                    num = num - 2.5;
                    output = output + "1.25.";
                }

                txt.setText(output);
            }
        });
    }
}