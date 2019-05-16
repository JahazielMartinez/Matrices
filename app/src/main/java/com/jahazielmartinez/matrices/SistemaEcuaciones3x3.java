package com.jahazielmartinez.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SistemaEcuaciones3x3 extends AppCompatActivity {

    /* Variables Ecuacion Uno*/
    EditText valorX;
    EditText valorY;
    EditText valorZ;
    EditText valorUno;
    TextView resultadoX;

    /* Variables Ecuacion Dos*/
    EditText valorX2;
    EditText valorY2;
    EditText valorZ2;
    EditText valorDos;
    TextView resultadoY;

    /* Variables Ecuacion Tres */
    EditText valorX3;
    EditText valorY3;
    EditText valorZ3;
    EditText valorTres;
    TextView resultadoZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_ecuaciones3x3);
        getSupportActionBar().setTitle("3 x 3");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        /* Declarando ID */
        valorX     = (EditText) findViewById(R.id.valorX);
        valorY     = (EditText) findViewById(R.id.valorY);
        valorZ     = (EditText) findViewById(R.id.valorZ);
        valorUno   = (EditText) findViewById(R.id.valorUno);
        resultadoX = (TextView) findViewById(R.id.textResultadoX);

        valorX2    = (EditText) findViewById(R.id.valorX2);
        valorY2    = (EditText) findViewById(R.id.valorY2);
        valorZ2    = (EditText) findViewById(R.id.valorZ2);
        valorDos   = (EditText) findViewById(R.id.valorDos);
        resultadoY = (TextView) findViewById(R.id.textResultadoY);

        valorX3    = (EditText) findViewById(R.id.valorX3);
        valorY3    = (EditText) findViewById(R.id.valorY3);
        valorZ3    = (EditText) findViewById(R.id.valorZ3);
        valorTres  = (EditText) findViewById(R.id.valorTres);
        resultadoZ = (TextView) findViewById(R.id.textResultadoZ);

        /* Limpiar Campos */
        Button limpiarCam = (Button) findViewById(R.id.limCamp);
        limpiarCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorX.setText("");
                valorY.setText("");
                valorZ.setText("");
                valorUno.setText("");
                resultadoX.setText("");
                valorX2.setText("");
                valorY2.setText("");
                valorZ2.setText("");
                valorDos.setText("");
                resultadoY.setText("");
                valorX3.setText("");
                valorY3.setText("");
                valorZ3.setText("");
                valorTres.setText("");
                resultadoZ.setText("");
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

        String valorx   = valorX.getText().toString();
        String valory   = valorY.getText().toString();
        String valorz   = valorZ.getText().toString();
        String valoruno = valorUno.getText().toString();
        float x1 = Integer.parseInt(valorx);
        float y1 = Integer.parseInt(valory);
        float z1 = Integer.parseInt(valorz);
        float r1 = Integer.parseInt(valoruno);

        /* Ecuacion Dos */
        String valorx2   = valorX2.getText().toString();
        String valory2   = valorY2.getText().toString();
        String valorz2   = valorZ2.getText().toString();
        String valordos  = valorDos.getText().toString();
        float x2 = Integer.parseInt(valorx2);
        float y2 = Integer.parseInt(valory2);
        float z2 = Integer.parseInt(valorz2);
        float r2 = Integer.parseInt(valordos);

        /* Ecuacion Tres */
        String valorx3    = valorX3.getText().toString();
        String valory3    = valorY3.getText().toString();
        String valorz3    = valorZ3.getText().toString();
        String valortres  = valorTres.getText().toString();
        float x3 = Integer.parseInt(valorx3);
        float y3 = Integer.parseInt(valory3);
        float z3 = Integer.parseInt(valorz3);
        float r3 = Integer.parseInt(valortres);

        /* Despejes de variables X , Y , Z */
        float d = (x1*y2*z3)+(y1*z2*x3)+(z1*x2*y3)-(z1*y2*x3)-(x1*z2*y3)-(y1*x2*z3);
        float despejeX = (r1*y2*z3)+(y1*z2*r3)+(z1*r2*y3)-(z1*y2*r3)-(r1*z2*y3)-(y1*r2*z3);
        float despejeY = (x1*r2*z3)+(r1*z2*x3)+(z1*x2*r3)-(z1*r2*x3)-(x1*z2*r3)-(r1*x2*z3);
        float despejeZ = (x1*y2*r3)+(y1*r2*x3)+(r1*x2*y3)-(r1*y2*x3)-(x1*r2*y3)-(y1*x2*r3);

        float dx = despejeX / d;
        float dy = despejeY / d;
        float dz = despejeZ / d;

        String resultadoDespejeX = String.valueOf(dx);
        resultadoX.setText(resultadoDespejeX);

        String resultadoDespejeY = String.valueOf(dy);
        resultadoY.setText(resultadoDespejeY);

        String resultadoDespejeZ = String.valueOf(dz);
        resultadoZ.setText(resultadoDespejeZ);
    }

    public void botonY(View view) {

    }

    public void botonZ(View view) {

    }
}
