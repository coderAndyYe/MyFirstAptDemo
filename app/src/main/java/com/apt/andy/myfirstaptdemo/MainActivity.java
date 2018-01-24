package com.apt.andy.myfirstaptdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apt.andy.annotation.TestAnnotation;

@TestAnnotation
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
