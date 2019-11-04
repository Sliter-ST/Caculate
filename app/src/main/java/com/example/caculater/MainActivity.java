package com.example.caculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_surface);
        Button btn_1 = (Button) findViewById(R.id.one);
        Button btn_2 = (Button) findViewById(R.id.two);
        Button btn_3 = (Button) findViewById(R.id.three);
        Button btn_4 = (Button) findViewById(R.id.four);
        Button btn_5 = (Button) findViewById(R.id.five);
        Button btn_6 = (Button) findViewById(R.id.six);
        Button btn_7 = (Button) findViewById(R.id.seven);
        Button btn_8 = (Button) findViewById(R.id.eight);
        Button btn_9 = (Button) findViewById(R.id.nine);
        Button btn_0 = (Button) findViewById(R.id.zero);
        Button btn_C = (Button) findViewById(R.id.C);
        Button btn_left = (Button) findViewById(R.id.left);
        Button btn_right = (Button) findViewById(R.id.right);
        Button btn_point = (Button) findViewById(R.id.point);
        Button btn_back = (Button) findViewById(R.id.back);
        Button btn_division = (Button) findViewById(R.id.division);
        Button btn_multiply = (Button) findViewById(R.id.multiply);
        Button btn_sub = (Button) findViewById(R.id.sub);
        Button btn_add = (Button) findViewById(R.id.add);
        Button btn_equal = (Button) findViewById(R.id.equal);
        Button btn_minus = (Button) findViewById(R.id.minus);
        Button btn_cos = (Button) findViewById(R.id.cos);
        Button btn_sin = (Button) findViewById(R.id.sin);
        Button btn_square = (Button) findViewById(R.id.square);
    }
}
