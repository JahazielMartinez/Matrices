package com.jahazielmartinez.matrices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Determinantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinantes);
        getSupportActionBar().setTitle("Determinantes");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void det_2x2(View view) {
        Intent intent = new Intent(this, Det_2x2.class);
        startActivity(intent);
    }

    public void det_3x3(View view) {
        Intent intent = new Intent(this, Det_3x3.class);
        startActivity(intent);
    }

    public void det_4x4(View view) {
        Intent intent = new Intent(this, Det_4x4.class);
        startActivity(intent);
    }
}
