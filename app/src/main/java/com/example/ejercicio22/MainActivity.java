package com.example.ejercicio22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtValor1;
    private EditText txtValor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operar(View view) {

        TextView lblResultado = findViewById(R.id.textResultado);

        txtValor1 = findViewById(R.id.txtValor1);
        txtValor2 = findViewById(R.id.txtValor2);

        int resultado=0;

        switch(view.getId()) {
            case R.id.buttonSumar:
                resultado = Integer.parseInt(txtValor1.getText().toString()) + Integer.parseInt(txtValor2.getText().toString());
                lblResultado.setText(lblResultado.getText() + " " + resultado);
                break;
            case R.id.buttonRestar:
                resultado = Integer.parseInt(txtValor1.getText().toString()) - Integer.parseInt(txtValor2.getText().toString());
                lblResultado.setText(lblResultado.getText() + " " + resultado);
                break;
            case R.id.buttonMultiplicar:
                resultado = Integer.parseInt(txtValor1.getText().toString()) * Integer.parseInt(txtValor2.getText().toString());
                lblResultado.setText(lblResultado.getText() + " " + resultado);
                break;
            case R.id.buttonDividir:
                resultado = Integer.parseInt(txtValor1.getText().toString()) / Integer.parseInt(txtValor2.getText().toString());
                lblResultado.setText(lblResultado.getText() + " " + resultado);
                break;
            default:
                // code block
        }

    }
}
