package com.example.rebecadivina.exercicio_01_aula_02_combustivel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AutonomiaActivity extends Activity implements View.OnClickListener {

    Button btnVoltar;
    Button btnCalcularAutonomia;
    TextView labelKm;
    TextView labelLitros;
    TextView labelResultado;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomia);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

        btnCalcularAutonomia = findViewById(R.id.btnCalcularAutonomia);
        btnCalcularAutonomia.setOnClickListener(this);

        labelResultado = (TextView) findViewById(R.id.labelResultado);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btnVoltar:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCalcularAutonomia:

                labelKm = findViewById(R.id.labelKm);
                String km = labelKm.getText().toString();
                Float kmFloat = Float.parseFloat(km);

                labelLitros = findViewById(R.id.labelLitros);
                String litros = labelLitros.getText().toString();
                Float litrosFloat = Float.parseFloat(litros);

                Float resultado = kmFloat/litrosFloat;
                String resultadoString = resultado+"km/L";

                labelResultado.setText(resultadoString);
                break;

        }

    }
}
