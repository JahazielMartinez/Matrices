package com.jahazielmartinez.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class InversaMatriz_3x3 extends AppCompatActivity {

    /* Variables */
    EditText valora11;
    EditText valora12;
    EditText valora13;
    EditText valora21;
    EditText valora22;
    EditText valora23;
    EditText valora31;
    EditText valora32;
    EditText valora33;
    TextView texta11;
    TextView texta12;
    TextView texta13;
    TextView texta21;
    TextView texta22;
    TextView texta23;
    TextView texta31;
    TextView texta32;
    TextView texta33;
    TextView textTransa11;
    TextView textTransa12;
    TextView textTransa13;
    TextView textTransa21;
    TextView textTransa22;
    TextView textTransa23;
    TextView textTransa31;
    TextView textTransa32;
    TextView textTransa33;
    TextView textResIn11;
    TextView textResIn12;
    TextView textResIn13;
    TextView textResIn21;
    TextView textResIn22;
    TextView textResIn23;
    TextView textResIn31;
    TextView textResIn32;
    TextView textResIn33;
    TextView textConst11;
    TextView textConst12;
    TextView textConst13;
    TextView textConst21;
    TextView textConst22;
    TextView textConst23;
    TextView textConst31;
    TextView textConst32;
    TextView textConst33;

    TextView resultadoDet;
    TextView resultadoInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversa_matriz_3x3);
        getSupportActionBar().setTitle("InversaMatriz 3x3");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        valora11 = (EditText) findViewById(R.id.a11);
        valora12 = (EditText) findViewById(R.id.a12);
        valora13 = (EditText) findViewById(R.id.a13);

        valora21 = (EditText) findViewById(R.id.a21);
        valora22 = (EditText) findViewById(R.id.a22);
        valora23 = (EditText) findViewById(R.id.a23);

        valora31 = (EditText) findViewById(R.id.a31);
        valora32 = (EditText) findViewById(R.id.a32);
        valora33 = (EditText) findViewById(R.id.a33);

        texta11 = (TextView) findViewById(R.id.textViewa11);
        texta12 = (TextView) findViewById(R.id.textViewa12);
        texta13 = (TextView) findViewById(R.id.textViewa13);

        texta21 = (TextView) findViewById(R.id.textViewa21);
        texta22 = (TextView) findViewById(R.id.textViewa22);
        texta23 = (TextView) findViewById(R.id.textViewa23);

        texta31 = (TextView) findViewById(R.id.textViewa31);
        texta32 = (TextView) findViewById(R.id.textViewa32);
        texta33 = (TextView) findViewById(R.id.textViewa33);

        textTransa11 = (TextView) findViewById(R.id.textViewTransa11);
        textTransa12 = (TextView) findViewById(R.id.textViewTransa12);
        textTransa13 = (TextView) findViewById(R.id.textViewTransa13);

        textTransa21 = (TextView) findViewById(R.id.textViewTransa21);
        textTransa22 = (TextView) findViewById(R.id.textViewTransa22);
        textTransa23 = (TextView) findViewById(R.id.textViewTransa23);

        textTransa31 = (TextView) findViewById(R.id.textViewTransa31);
        textTransa32 = (TextView) findViewById(R.id.textViewTransa32);
        textTransa33 = (TextView) findViewById(R.id.textViewTransa33);

        textResIn11 = (TextView) findViewById(R.id.textInvDet11);
        textResIn12 = (TextView) findViewById(R.id.textInvDet12);
        textResIn13 = (TextView) findViewById(R.id.textInvDet13);

        textResIn21 = (TextView) findViewById(R.id.textInvDet21);
        textResIn22 = (TextView) findViewById(R.id.textInvDet22);
        textResIn23 = (TextView) findViewById(R.id.textInvDet23);

        textResIn31 = (TextView) findViewById(R.id.textInvDet31);
        textResIn32 = (TextView) findViewById(R.id.textInvDet32);
        textResIn33 = (TextView) findViewById(R.id.textInvDet33);

        textConst11 = (TextView) findViewById(R.id.const11);
        textConst12 = (TextView) findViewById(R.id.const12);
        textConst13 = (TextView) findViewById(R.id.const13);
        textConst21 = (TextView) findViewById(R.id.const21);
        textConst22 = (TextView) findViewById(R.id.const22);
        textConst23 = (TextView) findViewById(R.id.const23);
        textConst31 = (TextView) findViewById(R.id.const31);
        textConst32 = (TextView) findViewById(R.id.const32);
        textConst33 = (TextView) findViewById(R.id.const33);

        resultadoDet = (TextView) findViewById(R.id.textResultadoDet);
        resultadoInv = (TextView) findViewById(R.id.textResultadoInv);


        Button limpiarCamp = (Button) findViewById(R.id.limCamp);
        limpiarCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valora11.setText("");
                valora12.setText("");
                valora13.setText("");
                valora21.setText("");
                valora22.setText("");
                valora23.setText("");
                valora31.setText("");
                valora32.setText("");
                valora33.setText("");
                resultadoDet.setText("");
                resultadoInv.setText("");
                texta11.setText("");
                texta12.setText("");
                texta13.setText("");
                texta21.setText("");
                texta22.setText("");
                texta23.setText("");
                texta31.setText("");
                texta32.setText("");
                texta33.setText("");
                textTransa11.setText("");
                textTransa12.setText("");
                textTransa13.setText("");
                textTransa21.setText("");
                textTransa22.setText("");
                textTransa23.setText("");
                textTransa31.setText("");
                textTransa32.setText("");
                textTransa33.setText("");
                textResIn11.setText("");
                textResIn12.setText("");
                textResIn13.setText("");
                textResIn21.setText("");
                textResIn22.setText("");
                textResIn23.setText("");
                textResIn31.setText("");
                textResIn32.setText("");
                textResIn33.setText("");
                textConst11.setText("");
                textConst12.setText("");
                textConst13.setText("");
                textConst21.setText("");
                textConst22.setText("");
                textConst23.setText("");
                textConst31.setText("");
                textConst32.setText("");
                textConst33.setText("");
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
        String valoraTres = valora13.getText().toString();

        String valoraDosUno = valora21.getText().toString();
        String valoraDosDos = valora22.getText().toString();
        String valoraDosTres = valora23.getText().toString();

        String valorTresUno = valora31.getText().toString();
        String valorTresDos = valora32.getText().toString();
        String valorTresTres = valora33.getText().toString();

        float a11 = Integer.parseInt(valoraUno);
        float a12 = Integer.parseInt(valoraDos);
        float a13 = Integer.parseInt(valoraTres);

        float a21 = Integer.parseInt(valoraDosUno);
        float a22 = Integer.parseInt(valoraDosDos);
        float a23 = Integer.parseInt(valoraDosTres);

        float a31 = Integer.parseInt(valorTresUno);
        float a32 = Integer.parseInt(valorTresDos);
        float a33 = Integer.parseInt(valorTresTres);

        float diagonalUno = (a11 * a22 * a33) + (a21 * a32 * a13) + (a31 * a12 * a23)- (a21 * a12 * a33) - (a11 * a32 * a23) - (a31 * a22 * a13);

        float det_a11 = (a22 * a33) - (a32 * a23);
        float det_a12 = (a21 * a33) - (a31 * a23);
        float det_a13 = (a21 * a32) - (a31 * a22);

        float det_a21 = (a12 * a33) - (a32 * a13);
        float det_a22 = (a11 * a33) - (a31 * a13);
        float det_a23 = (a11 * a32) - (a31 * a12);

        float det_a31 = (a12 * a23) - (a22 * a13);
        float det_a32 = (a11 * a23) - (a21 * a13);
        float det_a33 = (a11 * a22) - (a21 * a12);

        /* Cambiando Signos*/
        float cambSiga12 = det_a12 * -1;
        float cambSiga21 = det_a21 * -1;
        float cambSiga23 = det_a23 * -1;
        float cambSiga32 = det_a32 * -1;


        String resultado = String.valueOf(diagonalUno);
        resultadoDet.setText(resultado);
        resultadoInv.setText(resultado);

        String adjunta_a11 = String.valueOf(det_a11);
        String adjunta_a12 = String.valueOf(cambSiga12);
        String adjunta_a13 = String.valueOf(det_a13);

        String adjunta_a21 = String.valueOf(cambSiga21);
        String adjunta_a22 = String.valueOf(det_a22);
        String adjunta_a23 = String.valueOf(cambSiga23);

        String adjunta_a31 = String.valueOf(det_a31);
        String adjunta_a32 = String.valueOf(cambSiga32);
        String adjunta_a33 = String.valueOf(det_a33);

        texta11.setText(adjunta_a11);
        texta12.setText(adjunta_a12);
        texta13.setText(adjunta_a13);

        texta21.setText(adjunta_a21);
        texta22.setText(adjunta_a22);
        texta23.setText(adjunta_a23);

        texta31.setText(adjunta_a31);
        texta32.setText(adjunta_a32);
        texta33.setText(adjunta_a33);

        textTransa11.setText(adjunta_a11);
        textTransa12.setText(adjunta_a21);
        textTransa13.setText(adjunta_a31);
        textTransa21.setText(adjunta_a12);
        textTransa22.setText(adjunta_a22);
        textTransa23.setText(adjunta_a32);
        textTransa31.setText(adjunta_a13);
        textTransa32.setText(adjunta_a23);
        textTransa33.setText(adjunta_a33);


        textResIn11.setText(resultado);
        textResIn12.setText(resultado);
        textResIn13.setText(resultado);
        textResIn21.setText(resultado);
        textResIn22.setText(resultado);
        textResIn23.setText(resultado);
        textResIn31.setText(resultado);
        textResIn32.setText(resultado);
        textResIn33.setText(resultado);

        textConst11.setText(adjunta_a11);
        textConst12.setText(adjunta_a21);
        textConst13.setText(adjunta_a31);
        textConst21.setText(adjunta_a12);
        textConst22.setText(adjunta_a22);
        textConst23.setText(adjunta_a32);
        textConst31.setText(adjunta_a13);
        textConst32.setText(adjunta_a23);
        textConst33.setText(adjunta_a33);
    }
}
