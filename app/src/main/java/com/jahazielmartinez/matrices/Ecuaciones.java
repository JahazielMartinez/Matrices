package com.jahazielmartinez.matrices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ecuaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuaciones);
        getSupportActionBar().setTitle("Sistema De Ecuaciones");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void dos_por_dos(View view) {
        Intent intent = new Intent(this, SistemaEcuaciones2x2.class);
        startActivity(intent);
    }

    public void tres_por_tres(View view) {
        Intent intent = new Intent(this, SistemaEcuaciones3x3.class);
        startActivity(intent);
    }
}
