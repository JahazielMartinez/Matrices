package com.jahazielmartinez.matrices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Matrices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrices);
        getSupportActionBar().setTitle("Matrices");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void determinates(View view) {
        Intent intent = new Intent(this, Determinantes.class);
        startActivity(intent);
    }

    public void inversa(View view) {
        Intent intent = new Intent(this, InversaMatrizMenu.class);
        startActivity(intent);
    }
}
