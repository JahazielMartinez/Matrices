package com.jahazielmartinez.matrices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SistemaEcuaciones2x2 extends AppCompatActivity {

    /* Variables Ecuacion Uno*/
    EditText valorX;
    EditText valorY;
    EditText valorUno;
    TextView resultadoX;

    /* Variables Ecuacion Dos*/
    EditText valorX1;
    EditText valorY2;
    EditText valorDos;
    TextView resultadoY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_ecuaciones2x2);
        getSupportActionBar().setTitle("2 x 2");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        valorX     = (EditText) findViewById(R.id.valorX);
        valorY     = (EditText) findViewById(R.id.valorY);
        valorUno   = (EditText) findViewById(R.id.valorUno);
        resultadoX = (TextView) findViewById(R.id.textResultadoX);

        valorX1    = (EditText) findViewById(R.id.valorX1);
        valorY2    = (EditText) findViewById(R.id.valorY2);
        valorDos   = (EditText) findViewById(R.id.valorDos);
        resultadoY = (TextView) findViewById(R.id.textResultadoY);

        Button limpiarCam = (Button) findViewById(R.id.limCamp);
        limpiarCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorX.setText("");
                valorY.setText("");
                valorUno.setText("");
                resultadoX.setText("");
                valorX1.setText("");
                valorY2.setText("");
                valorDos.setText("");
                resultadoY.setText("");
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

    public void botonX(View view) {
        /* Ecuacion 1 */
        String valorx = valorX.getText().toString();
        String valory = valorY.getText().toString();
        String valoruno = valorUno.getText().toString();

        float a = Integer.parseInt(valorx);
        float b = Integer.parseInt(valory);
        float c = Integer.parseInt(valoruno);

        /* Ecuacion 2 */
        String valorx1 = valorX1.getText().toString();
        String valory2 = valorY2.getText().toString();
        String valordos = valorDos.getText().toString();

        float d = Integer.parseInt(valorx1);
        float e = Integer.parseInt(valory2);
        float f = Integer.parseInt(valordos);

        float despejeY = ((f * a) - (d * c)) / ((e * a) - (d * b));
        float despejeX = (c - (b * despejeY)) / a;

        String resultadoDespejeX = String.valueOf(despejeX);
        resultadoX.setText(resultadoDespejeX);

        String resultadoDespejeY = String.valueOf(despejeY);
        resultadoY.setText(resultadoDespejeY);
    }

    public void botonY(View view) {

    }
}
