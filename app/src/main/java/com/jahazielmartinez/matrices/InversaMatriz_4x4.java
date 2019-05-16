package com.jahazielmartinez.matrices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class InversaMatriz_4x4 extends AppCompatActivity {

    /* Variables */
    EditText valora11;
    EditText valora12;
    EditText valora13;
    EditText valora14;
    EditText valora21;
    EditText valora22;
    EditText valora23;
    EditText valora24;
    EditText valora31;
    EditText valora32;
    EditText valora33;
    EditText valora34;
    EditText valora41;
    EditText valora42;
    EditText valora43;
    EditText valora44;
    TextView texta11;
    TextView texta12;
    TextView texta13;
    TextView texta14;
    TextView texta21;
    TextView texta22;
    TextView texta23;
    TextView texta24;
    TextView texta31;
    TextView texta32;
    TextView texta33;
    TextView texta34;
    TextView texta41;
    TextView texta42;
    TextView texta43;
    TextView texta44;
    TextView textTransa11;
    TextView textTransa12;
    TextView textTransa13;
    TextView textTransa14;
    TextView textTransa21;
    TextView textTransa22;
    TextView textTransa23;
    TextView textTransa24;
    TextView textTransa31;
    TextView textTransa32;
    TextView textTransa33;
    TextView textTransa34;
    TextView textTransa41;
    TextView textTransa42;
    TextView textTransa43;
    TextView textTransa44;
    TextView textResIn11;
    TextView textResIn12;
    TextView textResIn13;
    TextView textResIn14;
    TextView textResIn21;
    TextView textResIn22;
    TextView textResIn23;
    TextView textResIn24;
    TextView textResIn31;
    TextView textResIn32;
    TextView textResIn33;
    TextView textResIn34;
    TextView textResIn41;
    TextView textResIn42;
    TextView textResIn43;
    TextView textResIn44;
    TextView textConst11;
    TextView textConst12;
    TextView textConst13;
    TextView textConst14;
    TextView textConst21;
    TextView textConst22;
    TextView textConst23;
    TextView textConst24;
    TextView textConst31;
    TextView textConst32;
    TextView textConst33;
    TextView textConst34;
    TextView textConst41;
    TextView textConst42;
    TextView textConst43;
    TextView textConst44;
    TextView resultadoDet;
    TextView resultadoInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversa_matriz_4x4);
        getSupportActionBar().setTitle("InversaMatriz 4x4");
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        valora11 = (EditText) findViewById(R.id.a11);
        valora12 = (EditText) findViewById(R.id.a12);
        valora13 = (EditText) findViewById(R.id.a13);
        valora14 = (EditText) findViewById(R.id.a14);

        valora21 = (EditText) findViewById(R.id.a21);
        valora22 = (EditText) findViewById(R.id.a22);
        valora23 = (EditText) findViewById(R.id.a23);
        valora24 = (EditText) findViewById(R.id.a24);

        valora31 = (EditText) findViewById(R.id.a31);
        valora32 = (EditText) findViewById(R.id.a32);
        valora33 = (EditText) findViewById(R.id.a33);
        valora34 = (EditText) findViewById(R.id.a34);

        valora41 = (EditText) findViewById(R.id.a41);
        valora42 = (EditText) findViewById(R.id.a42);
        valora43 = (EditText) findViewById(R.id.a43);
        valora44 = (EditText) findViewById(R.id.a44);

        texta11 = (TextView) findViewById(R.id.textViewa11);
        texta12 = (TextView) findViewById(R.id.textViewa12);
        texta13 = (TextView) findViewById(R.id.textViewa13);
        texta14 = (TextView) findViewById(R.id.textViewa14);

        texta21 = (TextView) findViewById(R.id.textViewa21);
        texta22 = (TextView) findViewById(R.id.textViewa22);
        texta23 = (TextView) findViewById(R.id.textViewa23);
        texta24 = (TextView) findViewById(R.id.textViewa24);

        texta31 = (TextView) findViewById(R.id.textViewa31);
        texta32 = (TextView) findViewById(R.id.textViewa32);
        texta33 = (TextView) findViewById(R.id.textViewa33);
        texta34 = (TextView) findViewById(R.id.textViewa34);

        texta41 = (TextView) findViewById(R.id.textViewa41);
        texta42 = (TextView) findViewById(R.id.textViewa42);
        texta43 = (TextView) findViewById(R.id.textViewa43);
        texta44 = (TextView) findViewById(R.id.textViewa44);

        textTransa11 = (TextView) findViewById(R.id.textViewTransa11);
        textTransa12 = (TextView) findViewById(R.id.textViewTransa12);
        textTransa13 = (TextView) findViewById(R.id.textViewTransa13);
        textTransa14 = (TextView) findViewById(R.id.textViewTransa14);

        textTransa21 = (TextView) findViewById(R.id.textViewTransa21);
        textTransa22 = (TextView) findViewById(R.id.textViewTransa22);
        textTransa23 = (TextView) findViewById(R.id.textViewTransa23);
        textTransa24 = (TextView) findViewById(R.id.textViewTransa24);

        textTransa31 = (TextView) findViewById(R.id.textViewTransa31);
        textTransa32 = (TextView) findViewById(R.id.textViewTransa32);
        textTransa33 = (TextView) findViewById(R.id.textViewTransa33);
        textTransa34 = (TextView) findViewById(R.id.textViewTransa34);

        textTransa41 = (TextView) findViewById(R.id.textViewTransa41);
        textTransa42 = (TextView) findViewById(R.id.textViewTransa42);
        textTransa43 = (TextView) findViewById(R.id.textViewTransa43);
        textTransa44 = (TextView) findViewById(R.id.textViewTransa44);

        textResIn11 = (TextView) findViewById(R.id.textInvDet11);
        textResIn12 = (TextView) findViewById(R.id.textInvDet12);
        textResIn13 = (TextView) findViewById(R.id.textInvDet13);
        textResIn14 = (TextView) findViewById(R.id.textInvDet14);

        textResIn21 = (TextView) findViewById(R.id.textInvDet21);
        textResIn22 = (TextView) findViewById(R.id.textInvDet22);
        textResIn23 = (TextView) findViewById(R.id.textInvDet23);
        textResIn24 = (TextView) findViewById(R.id.textInvDet24);

        textResIn31 = (TextView) findViewById(R.id.textInvDet31);
        textResIn32 = (TextView) findViewById(R.id.textInvDet32);
        textResIn33 = (TextView) findViewById(R.id.textInvDet33);
        textResIn34 = (TextView) findViewById(R.id.textInvDet34);

        textResIn41 = (TextView) findViewById(R.id.textInvDet41);
        textResIn42 = (TextView) findViewById(R.id.textInvDet42);
        textResIn43 = (TextView) findViewById(R.id.textInvDet43);
        textResIn44 = (TextView) findViewById(R.id.textInvDet44);

        textConst11 = (TextView) findViewById(R.id.const11);
        textConst12 = (TextView) findViewById(R.id.const12);
        textConst13 = (TextView) findViewById(R.id.const13);
        textConst14 = (TextView) findViewById(R.id.const14);

        textConst21 = (TextView) findViewById(R.id.const21);
        textConst22 = (TextView) findViewById(R.id.const22);
        textConst23 = (TextView) findViewById(R.id.const23);
        textConst24 = (TextView) findViewById(R.id.const24);

        textConst31 = (TextView) findViewById(R.id.const31);
        textConst32 = (TextView) findViewById(R.id.const32);
        textConst33 = (TextView) findViewById(R.id.const33);
        textConst34 = (TextView) findViewById(R.id.const34);

        textConst41 = (TextView) findViewById(R.id.const41);
        textConst42 = (TextView) findViewById(R.id.const42);
        textConst43 = (TextView) findViewById(R.id.const43);
        textConst44 = (TextView) findViewById(R.id.const44);

        resultadoDet = (TextView) findViewById(R.id.textResultadoDet);
        resultadoInv = (TextView) findViewById(R.id.textResultadoInv);


        Button limpiarCamp = (Button) findViewById(R.id.limCamp);
        limpiarCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valora11.setText("");
                valora12.setText("");
                valora13.setText("");
                valora14.setText("");
                valora21.setText("");
                valora22.setText("");
                valora23.setText("");
                valora24.setText("");
                valora31.setText("");
                valora32.setText("");
                valora33.setText("");
                valora34.setText("");
                valora41.setText("");
                valora42.setText("");
                valora43.setText("");
                valora44.setText("");
                resultadoDet.setText("");
                resultadoInv.setText("");
                texta11.setText("");
                texta12.setText("");
                texta13.setText("");
                texta14.setText("");
                texta21.setText("");
                texta22.setText("");
                texta23.setText("");
                texta24.setText("");
                texta31.setText("");
                texta32.setText("");
                texta33.setText("");
                texta34.setText("");
                texta41.setText("");
                texta42.setText("");
                texta43.setText("");
                texta44.setText("");
                textTransa11.setText("");
                textTransa12.setText("");
                textTransa13.setText("");
                textTransa14.setText("");
                textTransa21.setText("");
                textTransa22.setText("");
                textTransa23.setText("");
                textTransa24.setText("");
                textTransa31.setText("");
                textTransa32.setText("");
                textTransa33.setText("");
                textTransa34.setText("");
                textTransa41.setText("");
                textTransa42.setText("");
                textTransa43.setText("");
                textTransa44.setText("");
                textResIn11.setText("");
                textResIn12.setText("");
                textResIn13.setText("");
                textResIn14.setText("");
                textResIn21.setText("");
                textResIn22.setText("");
                textResIn23.setText("");
                textResIn24.setText("");
                textResIn31.setText("");
                textResIn32.setText("");
                textResIn33.setText("");
                textResIn34.setText("");
                textResIn41.setText("");
                textResIn42.setText("");
                textResIn43.setText("");
                textResIn44.setText("");
                textConst11.setText("");
                textConst12.setText("");
                textConst13.setText("");
                textConst14.setText("");
                textConst21.setText("");
                textConst22.setText("");
                textConst23.setText("");
                textConst24.setText("");
                textConst31.setText("");
                textConst32.setText("");
                textConst33.setText("");
                textConst34.setText("");
                textConst41.setText("");
                textConst42.setText("");
                textConst43.setText("");
                textConst44.setText("");
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
        String valoraCuatro = valora14.getText().toString();

        String valoraDosUno = valora21.getText().toString();
        String valoraDosDos = valora22.getText().toString();
        String valoraDosTres = valora23.getText().toString();
        String valoraDosCuatro = valora24.getText().toString();

        String valorTresUno = valora31.getText().toString();
        String valorTresDos = valora32.getText().toString();
        String valorTresTres = valora33.getText().toString();
        String valoraTresCuatro = valora34.getText().toString();

        String valorCuatroUno = valora41.getText().toString();
        String valorCuatroDos = valora42.getText().toString();
        String valorCuatroTres = valora43.getText().toString();
        String valoraCuatroCuatro = valora44.getText().toString();

        float a11 = Integer.parseInt(valoraUno);
        float a12 = Integer.parseInt(valoraDos);
        float a13 = Integer.parseInt(valoraTres);
        float a14 = Integer.parseInt(valoraCuatro);

        float a21 = Integer.parseInt(valoraDosUno);
        float a22 = Integer.parseInt(valoraDosDos);
        float a23 = Integer.parseInt(valoraDosTres);
        float a24 = Integer.parseInt(valoraDosCuatro);

        float a31 = Integer.parseInt(valorTresUno);
        float a32 = Integer.parseInt(valorTresDos);
        float a33 = Integer.parseInt(valorTresTres);
        float a34 = Integer.parseInt(valoraTresCuatro);

        float a41 = Integer.parseInt(valorCuatroUno);
        float a42 = Integer.parseInt(valorCuatroDos);
        float a43 = Integer.parseInt(valorCuatroTres);
        float a44 = Integer.parseInt(valoraCuatroCuatro);

        float matrizUno = (a22 * a33 * a44) + (a32 * a43 * a24) + (a42 * a23 * a34)- (a32 * a23 * a44) - (a22 * a43 * a34) - (a42 * a33 * a24);
        float matrizDos = (a21 * a33 * a44) + (a31 * a43 * a24) + (a41 * a23 * a34)- (a31 * a23 * a44) - (a21 * a43 * a34) - (a41 * a33 * a24);
        float matrizTres = (a21 * a32 * a44) + (a31 * a42 * a24) + (a41 * a22 * a34)- (a31 * a22 * a44) - (a21 * a42 * a34) - (a41 * a32 * a24);
        float matrizCuatro = (a21 * a32 * a43) + (a31 * a42 * a23) + (a41 * a22 * a33)- (a31 * a22 * a43) - (a21 * a42 * a33) - (a41 * a32 * a23);
        float resultadoFinal = a11 * (matrizUno) - a12 * (matrizDos) + a13 * (matrizTres) -a14 * (matrizCuatro);

        float det_a11 = (a22*a33*a44) + (a32*a43*a24) + (a42*a23*a34) - (a32*a23*a44) - (a22*a43*a34) - (a42*a33*a24);
        float det_a12 = (a21*a33*a44) + (a31*a43*a24) + (a41*a23*a34) - (a31*a23*a44) - (a21*a43*a34) - (a41*a33*a24);
        float det_a13 = (a21*a32*a44) + (a31*a42*a24) + (a41*a22*a34) - (a31*a22*a44) - (a21*a42*a34) - (a41*a32*a24);
        float det_a14 = (a21*a32*a43) + (a31*a42*a23) + (a41*a22*a33) - (a31*a22*a43) - (a21*a42*a33) - (a41*a32*a23);

        float det_a21 = (a12*a33*a44) + (a32*a43*a14) + (a42*a13*a34) - (a32*a13*a44) - (a12*a43*a34) - (a42*a33*a14);
        float det_a22 = (a11*a33*a44) + (a31*a43*a14) + (a41*a13*a34) - (a31*a13*a44) - (a11*a43*a34) - (a41*a33*a14);
        float det_a23 = (a11*a32*a44) + (a31*a42*a14) + (a41*a12*a34) - (a31*a12*a44) - (a11*a42*a34) - (a41*a32*a14);
        float det_a24 = (a11*a32*a43) + (a31*a42*a13) + (a41*a12*a33) - (a31*a12*a43) - (a11*a42*a33) - (a41*a32*a13);

        float det_a31 = (a12*a23*a44) + (a22*a43*a14) + (a42*a13*a24) - (a22*a13*a44) - (a12*a43*a24) - (a42*a23*a14);
        float det_a32 = (a11*a23*a44) + (a21*a43*a14) + (a41*a13*a24) - (a21*a13*a44) - (a11*a43*a24) - (a41*a23*a14);
        float det_a33 = (a11*a22*a44) + (a21*a42*a14) + (a41*a12*a24) - (a21*a12*a44) - (a11*a42*a24) - (a41*a22*a14);
        float det_a34 = (a11*a22*a43) + (a21*a42*a13) + (a41*a12*a23) - (a21*a12*a43) - (a11*a42*a23) - (a41*a22*a13);

        float det_a41 = (a12*a23*a34) + (a22*a33*a14) + (a32*a13*a24) - (a22*a13*a34) - (a12*a33*a24) - (a32*a23*a14);
        float det_a42 = (a11*a23*a34) + (a21*a33*a14) + (a31*a13*a24) - (a21*a13*a34) - (a11*a33*a24) - (a31*a23*a14);
        float det_a43 = (a11*a22*a34) + (a21*a32*a14) + (a31*a12*a24) - (a21*a12*a34) - (a11*a32*a24) - (a31*a22*a14);
        float det_a44 = (a11*a22*a33) + (a21*a32*a13) + (a31*a12*a23) - (a21*a12*a33) - (a11*a32*a23) - (a31*a22*a13);

        /* Cambiando Signos*/
        float cambSiga12 = det_a12 * -1;
        float cambSiga14 = det_a14 * -1;
        float cambSiga21 = det_a21 * -1;
        float cambSiga23 = det_a23 * -1;
        float cambSiga32 = det_a32 * -1;
        float cambSiga34 = det_a34 * -1;
        float cambSiga41 = det_a41 * -1;
        float cambSiga43 = det_a43 * -1;

        String resultado = String.valueOf(resultadoFinal);
        resultadoDet.setText(resultado);
        resultadoInv.setText(resultado);

        String adjunta_a11 = String.valueOf(det_a11);
        String adjunta_a12 = String.valueOf(cambSiga12);
        String adjunta_a13 = String.valueOf(det_a13);
        String adjunta_a14 = String.valueOf(cambSiga14);

        String adjunta_a21 = String.valueOf(cambSiga21);
        String adjunta_a22 = String.valueOf(det_a22);
        String adjunta_a23 = String.valueOf(cambSiga23);
        String adjunta_a24 = String.valueOf(det_a24);

        String adjunta_a31 = String.valueOf(det_a31);
        String adjunta_a32 = String.valueOf(cambSiga32);
        String adjunta_a33 = String.valueOf(det_a33);
        String adjunta_a34 = String.valueOf(cambSiga34);

        String adjunta_a41 = String.valueOf(cambSiga41);
        String adjunta_a42 = String.valueOf(det_a42);
        String adjunta_a43 = String.valueOf(cambSiga43);
        String adjunta_a44 = String.valueOf(det_a44);

        texta11.setText(adjunta_a11);
        texta12.setText(adjunta_a12);
        texta13.setText(adjunta_a13);
        texta14.setText(adjunta_a14);

        texta21.setText(adjunta_a21);
        texta22.setText(adjunta_a22);
        texta23.setText(adjunta_a23);
        texta24.setText(adjunta_a24);

        texta31.setText(adjunta_a31);
        texta32.setText(adjunta_a32);
        texta33.setText(adjunta_a33);
        texta34.setText(adjunta_a34);

        texta41.setText(adjunta_a41);
        texta42.setText(adjunta_a42);
        texta43.setText(adjunta_a43);
        texta44.setText(adjunta_a44);

        textTransa11.setText(adjunta_a11);
        textTransa12.setText(adjunta_a21);
        textTransa13.setText(adjunta_a31);
        textTransa14.setText(adjunta_a41);
        textTransa21.setText(adjunta_a12);
        textTransa22.setText(adjunta_a22);
        textTransa23.setText(adjunta_a32);
        textTransa24.setText(adjunta_a42);
        textTransa31.setText(adjunta_a13);
        textTransa32.setText(adjunta_a23);
        textTransa33.setText(adjunta_a33);
        textTransa34.setText(adjunta_a43);
        textTransa41.setText(adjunta_a14);
        textTransa42.setText(adjunta_a24);
        textTransa43.setText(adjunta_a34);
        textTransa44.setText(adjunta_a44);

        textResIn11.setText(resultado);
        textResIn12.setText(resultado);
        textResIn13.setText(resultado);
        textResIn14.setText(resultado);
        textResIn21.setText(resultado);
        textResIn22.setText(resultado);
        textResIn23.setText(resultado);
        textResIn24.setText(resultado);
        textResIn31.setText(resultado);
        textResIn32.setText(resultado);
        textResIn33.setText(resultado);
        textResIn34.setText(resultado);
        textResIn41.setText(resultado);
        textResIn42.setText(resultado);
        textResIn43.setText(resultado);
        textResIn44.setText(resultado);

        textConst11.setText(adjunta_a11);
        textConst12.setText(adjunta_a21);
        textConst13.setText(adjunta_a31);
        textConst14.setText(adjunta_a41);
        textConst21.setText(adjunta_a12);
        textConst22.setText(adjunta_a22);
        textConst23.setText(adjunta_a32);
        textConst24.setText(adjunta_a42);
        textConst31.setText(adjunta_a13);
        textConst32.setText(adjunta_a23);
        textConst33.setText(adjunta_a33);
        textConst34.setText(adjunta_a43);
        textConst41.setText(adjunta_a14);
        textConst42.setText(adjunta_a24);
        textConst43.setText(adjunta_a34);
        textConst44.setText(adjunta_a44);

    }
}
