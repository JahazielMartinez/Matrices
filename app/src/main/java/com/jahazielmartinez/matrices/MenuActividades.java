package com.jahazielmartinez.matrices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class MenuActividades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menú");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void ecuaciones(View view) {
        Intent intent = new Intent(this, Ecuaciones.class);
        startActivity(intent);
    }

    public void matrices(View view) {
        Intent intent = new Intent(this, Matrices.class);
        startActivity(intent);
    }
}
