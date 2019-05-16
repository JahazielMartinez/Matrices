package com.jahazielmartinez.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Det_2x2 extends AppCompatActivity {

    /* Variables */
    EditText valora1;
    EditText valora2;
    EditText valora3;
    EditText valora4;
    TextView resultadoMatriz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_2x2);
        getSupportActionBar().setTitle("Determinante 2 x 2");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        valora1 = (EditText) findViewById(R.id.aUno);
        valora2 = (EditText) findViewById(R.id.aDos);
        valora3 = (EditText) findViewById(R.id.aTres);
        valora4 = (EditText) findViewById(R.id.aCuatro);
        resultadoMatriz = (TextView) findViewById(R.id.textResultadoDelta);

        Button limpiarCamp = (Button) findViewById(R.id.limCamp);
        limpiarCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valora1.setText("");
                valora2.setText("");
                valora3.setText("");
                valora4.setText("");
                resultadoMatriz.setText("");
            }
        });

        final LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.animation_view);
        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView.playAnimation();
            }
        });
    }

    public void resultadoDelta(View view) {
        String valoruno    = valora1.getText().toString();
        String valordos    = valora2.getText().toString();
        String valortres   = valora3.getText().toString();
        String valorcuatro = valora4.getText().toString();

        float a1 = Integer.parseInt(valoruno);
        float a2 = Integer.parseInt(valordos);
        float a3 = Integer.parseInt(valortres);
        float a4 = Integer.parseInt(valorcuatro);
        float diagonalUno = (a1 * a4);
        float diagonalDos = (a3 * a2);
        float operacionFinal = (diagonalUno - diagonalDos);

        String resultado = String.valueOf(operacionFinal);
        resultadoMatriz.setText(resultado);


    }
}
