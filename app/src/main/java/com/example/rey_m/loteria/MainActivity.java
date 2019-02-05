package com.example.rey_m.loteria;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    ImageButton btn1;
    TextView mensaje;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        mensaje=findViewById(R.id.mensaje);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                contador++;
                btn1.setEnabled(false);
                break;
            case R.id.btn2:
                contador++;
                btn2.setEnabled(false);
                break;
            case R.id.btn3:
                contador++;
                btn3.setEnabled(false);
                break;
            case R.id.btn4:
                contador++;
                btn4.setEnabled(false);
                break;
            case R.id.btn5:
                contador++;
                btn5.setEnabled(false);
                break;
            case R.id.btn6:
                contador++;
                btn6.setEnabled(false);
                break;
            case R.id.btn7:
                contador++;
                btn7.setEnabled(false);
                break;
            case R.id.btn8:
                contador++;
                btn8.setEnabled(false);
                break;
            case R.id.btn9:
                contador++;
                btn9.setEnabled(false);
                break;
            case R.id.btn10:
                contador++;
                btn10.setEnabled(false);
                break;
            case R.id.btn11:
                contador++;
                btn11.setEnabled(false);
                break;
            case R.id.btn12:
                contador++;
                btn12.setEnabled(false);
                break;
            case R.id.btn13:
                contador++;
                btn13.setEnabled(false);
                break;
            case R.id.btn14:
                contador++;
                btn14.setEnabled(false);
                break;
            case R.id.btn15:
                contador++;
                btn15.setEnabled(false);
                break;
            case R.id.btn16:
                contador++;
                btn16.setEnabled(false);
                break;

        }
        ganar(contador);
    }

    public void ganar(int contador) {
        if (contador==16){
            mensaje.setText("GANASTE!!!");
        }
    }

    public void reiniciar(View view) {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        mensaje.setText("empieza!!");
        contador=0;
    }
}
