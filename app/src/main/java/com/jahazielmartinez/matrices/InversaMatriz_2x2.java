package com.jahazielmartinez.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class InversaMatriz_2x2 extends AppCompatActivity {

    /* Variables */
    EditText valora11;
    EditText valora12;
    EditText valora21;
    EditText valora22;
    TextView texta11;
    TextView texta12;
    TextView texta21;
    TextView texta22;
    TextView textResIn11;
    TextView textResIn12;
    TextView textResIn21;
    TextView textResIn22;
    TextView textConst11;
    TextView textConst12;
    TextView textConst21;
    TextView textConst22;

    TextView resultadoDet;
    TextView resultadoInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversa_matriz_2x2);
        getSupportActionBar().setTitle("InversaMatriz 2x2");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        valora11 = (EditText) findViewById(R.id.a11);
        valora12 = (EditText) findViewById(R.id.a12);

        valora21 = (EditText) findViewById(R.id.a21);
        valora22 = (EditText) findViewById(R.id.a22);

        texta11 = (TextView) findViewById(R.id.textViewa11);
        texta12 = (TextView) findViewById(R.id.textViewa12);

        texta21 = (TextView) findViewById(R.id.textViewa21);
        texta22 = (TextView) findViewById(R.id.textViewa22);

        textResIn11 = (TextView) findViewById(R.id.textInvDet11);
        textResIn12 = (TextView) findViewById(R.id.textInvDet12);

        textResIn21 = (TextView) findViewById(R.id.textInvDet21);
        textResIn22 = (TextView) findViewById(R.id.textInvDet22);

        resultadoDet = (TextView) findViewById(R.id.textResultadoDet);
        resultadoInv = (TextView) findViewById(R.id.textResultadoInv);

        Button limpiarCamp = (Button) findViewById(R.id.limCamp);
        limpiarCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valora11.setText("");
                valora12.setText("");
                valora21.setText("");
                valora22.setText("");
                resultadoDet.setText("");
                resultadoInv.setText("");
                texta11.setText("");
                texta12.setText("");
                texta21.setText("");
                texta22.setText("");
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

    public void resultadoDeterm(View view) {
        String valoraUno = valora11.getText().toString();
        String valoraDos = valora12.getText().toString();

        String valoraDosUno = valora21.getText().toString();
        String valoraDosDos = valora22.getText().toString();

        float a11 = Integer.parseInt(valoraUno);
        float a12 = Integer.parseInt(valoraDos);

        float a21 = Integer.parseInt(valoraDosUno);
        float a22 = Integer.parseInt(valoraDosDos);

        float diagonalUno = (a11 * a22) - (a21 * a12);

        /* Cambiando Signos*/
        float cambSiga12 = a12 * -1;
        float cambSiga21 = a21 * -1;

        String resultado = String.valueOf(diagonalUno);
        resultadoDet.setText(resultado);
        resultadoInv.setText(resultado);

        String adjunta_a11 = String.valueOf(a22);
        texta11.setText(adjunta_a11);
        String adjunta_a12 = String.valueOf(cambSiga12);
        texta12.setText(adjunta_a12);
        String adjunta_a21 = String.valueOf(cambSiga21);
        texta21.setText(adjunta_a21);
        String adjunta_a22 = String.valueOf(a11);
        texta22.setText(adjunta_a22);
    }
}
