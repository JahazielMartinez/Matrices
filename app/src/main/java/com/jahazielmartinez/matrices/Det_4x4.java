package com.jahazielmartinez.matrices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Det_4x4 extends AppCompatActivity {

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
    TextView resultadoDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_4x4);
        getSupportActionBar().setTitle("Determinante 4 x 4");
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
        resultadoDet = (TextView) findViewById(R.id.textResultadoDet);

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

    public void resultadoDeterminante(View view) {

        String valoraUno    = valora11.getText().toString();
        String valoraDos    = valora12.getText().toString();
        String valoraTres   = valora13.getText().toString();
        String valoraCuatro = valora14.getText().toString();

        String valoraDosUno    = valora21.getText().toString();
        String valoraDosDos    = valora22.getText().toString();
        String valoraDosTres   = valora23.getText().toString();
        String valoraDosCuatro = valora24.getText().toString();

        String valorTresUno = valora31.getText().toString();
        String valorTresDos = valora32.getText().toString();
        String valorTresTres = valora33.getText().toString();
        String valoraTresCuatro = valora34.getText().toString();

        String valorCuatroUno = valora41.getText().toString();
        String valorCuatroDos = valora42.getText().toString();
        String valorCuatroTres = valora43.getText().toString();
        String valorCuatroCuatro = valora44.getText().toString();

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
        float a44 = Integer.parseInt(valorCuatroCuatro);

        float matrizUno = (a22 * a33 * a44) + (a32 * a43 * a24) + (a42 * a23 * a34)- (a32 * a23 * a44) - (a22 * a43 * a34) - (a42 * a33 * a24);
        float matrizDos = (a21 * a33 * a44) + (a31 * a43 * a24) + (a41 * a23 * a34)- (a31 * a23 * a44) - (a21 * a43 * a34) - (a41 * a33 * a24);
        float matrizTres = (a21 * a32 * a44) + (a31 * a42 * a24) + (a41 * a22 * a34)- (a31 * a22 * a44) - (a21 * a42 * a34) - (a41 * a32 * a24);
        float matrizCuatro = (a21 * a32 * a43) + (a31 * a42 * a23) + (a41 * a22 * a33)- (a31 * a22 * a43) - (a21 * a42 * a33) - (a41 * a32 * a23);



        float resultadoFinal = a11 * (matrizUno) - a12 * (matrizDos) + a13 * (matrizTres) -a14 * (matrizCuatro);

        String resultado = String.valueOf(resultadoFinal);
        resultadoDet.setText(resultado);

    }
}
