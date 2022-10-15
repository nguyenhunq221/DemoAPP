package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //khai bao bien toan cuc
    TextView txtNoidung;
    Button btnClick;
    EditText edittxt;
    Button BtnClick2;
    Button btnRandom;
    TextView txtRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        txtNoidung=(TextView)  findViewById(R.id.textView);
        btnClick=(Button) findViewById(R.id.button);
        edittxt=(EditText)findViewById(R.id.edittxt);
        BtnClick2=(Button)findViewById(R.id.button_edittext);
        btnRandom=(Button)findViewById(R.id.button_random);
        txtRandom=(TextView)findViewById(R.id.txt_random);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNoidung.setText("Nguyen Khac Hung");
            }
        });
            BtnClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String noiDung=edittxt.getText().toString();
                    Toast.makeText(MainActivity.this,noiDung,Toast.LENGTH_LONG).show();
                }
            });
            btnRandom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Random random=new Random();
                    int number = random.nextInt(100);
                    txtRandom.setText(number+"");

            }
        });
    }
}