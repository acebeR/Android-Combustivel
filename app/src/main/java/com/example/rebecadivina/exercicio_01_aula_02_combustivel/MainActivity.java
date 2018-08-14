package com.example.rebecadivina.exercicio_01_aula_02_combustivel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnAutonomia;
    Button btnConbustivel;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConbustivel = findViewById(R.id.btnCombustivel);
        btnConbustivel.setOnClickListener(this);

        btnAutonomia = findViewById(R.id.btnAutonomia);
        btnAutonomia.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnCombustivel:
                intent = new Intent(this, CombustivelActivity.class);
                startActivity(intent);
                break;
            case  R.id.btnAutonomia:
                intent = new Intent(this, AutonomiaActivity.class);
                startActivity(intent);
                break;

        }

    }
}
