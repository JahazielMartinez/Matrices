package com.jahazielmartinez.matrices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InversaMatrizMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversa_matriz_menu);
        getSupportActionBar().setTitle("Inversa");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void inv2x2(View view) {
        Intent intent =new Intent (this, InversaMatriz_2x2.class);
        startActivity(intent);
    }

    public void inv3x3(View view) {
        Intent intent = new Intent(this, InversaMatriz_3x3.class);
        startActivity(intent);
    }

    public void inv4x4(View view) {
        Intent intent = new Intent(this, InversaMatriz_4x4.class);
        startActivity(intent);
    }
}
