package com.jahazielmartinez.matrices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Det_3x3 extends AppCompatActivity {

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
    TextView resultadoDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_3x3);
        getSupportActionBar().setTitle("Determinante 3 x 3");
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
        resultadoDet = (TextView) findViewById(R.id.textResultadoDet);

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

    public void resultadoDet(View view) {
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


        String resultado = String.valueOf(diagonalUno);
        resultadoDet.setText(resultado);

    }
}
