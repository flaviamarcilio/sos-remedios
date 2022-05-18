package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TipoRemedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_remedio);
        setTitle("Tipos de Remédios");
    }

    public void pressaoAlta(View view) {
        Intent pressaoAlta = new Intent(this, PressaoAlta.class);
        startActivity(pressaoAlta);
    }

    public void diabetes(View view) {
        Intent diabetes = new Intent(this, Diabetes.class);
        startActivity(diabetes);
    }

    public void analgesico(View view) {
        Intent analgesicos = new Intent(this, Analgesicos.class);
        startActivity(analgesicos);
    }

    public void vitaminas(View view) {
        Intent vitaminas = new Intent(this, Vitaminas.class);
        startActivity(vitaminas);
    }

    public void primeirosSocorros(View view) {
        Intent primeirosSocorros = new Intent(this, PrimeirosSocorros.class);
        startActivity(primeirosSocorros);
    }

    public void telaInicial(View view) {
        finish();
    }


}