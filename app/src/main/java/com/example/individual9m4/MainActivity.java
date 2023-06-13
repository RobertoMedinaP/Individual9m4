package com.example.individual9m4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.individual9m4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        binding.iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar(""+R.drawable.abeja,"Es ud una persona tenaz como la abeja");
            }
        });

        binding.iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar(""+R.drawable.chocolate,"Ud es dulce y amargo como el chocolate");
            }
        });

        binding.iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar(""+R.drawable.eventos, "Ud. está pensando en sus tareas pendientes");
            }
        });

        binding.iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar(""+R.drawable.rana,"Ud esta feliz cantando como la rana");
            }
        });

    }

    protected  void enviar(String image, String mensaje){

        Intent intento = new Intent(MainActivity.this, Activity2.class) ;
        intento.putExtra("imagen",image);
        intento.putExtra("mensaje", mensaje);
        startActivity(intento);
    }
}