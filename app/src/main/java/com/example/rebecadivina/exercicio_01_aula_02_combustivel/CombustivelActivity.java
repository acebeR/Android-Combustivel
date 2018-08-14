package com.example.rebecadivina.exercicio_01_aula_02_combustivel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CombustivelActivity extends Activity implements View.OnClickListener{

    TextView labelAlcool;
    TextView labelGasolina;
    TextView labelResultado;
    Button btnCalcularGasolina;
    Button btnVoltar;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustivel);

        btnCalcularGasolina = findViewById(R.id.btnCalcularGasolina);
        btnCalcularGasolina.setOnClickListener(this);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

        labelResultado = (TextView) findViewById(R.id.labelResultado);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnVoltar:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case  R.id.btnCalcularGasolina:

                labelAlcool = findViewById(R.id.labelAlcool);
                String alcool = labelAlcool.getText().toString();
                Float alcoolFloat = Float.parseFloat(alcool);

                labelGasolina = findViewById(R.id.labelGasolina);
                String gasolina = labelGasolina.getText().toString();
                Float gasolinaFloat = Float.parseFloat(gasolina);

                if((gasolinaFloat/alcoolFloat)>= 0.7){
                    labelResultado.setText("Melhor opção é a Gasolina");
                }else {
                    labelResultado.setText("Melhor opção é o Alcool");
                }


                break;

        }

    }
}
