package com.example.shootingstars.appquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView resultado;
    private Spinner spinnerRespostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerRespostas = findViewById(R.id.spinnerItens);
        resultado = findViewById(R.id.resultado);
    }

    public void clicarResultado(View view){

        if (view == findViewById(R.id.botaoEscolher)){

            String respostas = spinnerRespostas.getSelectedItem().toString();

            if (respostas.equals("Curitiba")){

                resultado.setText("Resposta Certa");
            }

            else{

                resultado.setText("Resposta Errada");
            }
        }
    }
}
