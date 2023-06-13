package com.example.individual9m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.individual9m4.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intento = getIntent();
        String imagen = intento.getStringExtra("imagen");
        binding.iv5.setImageResource(Integer.parseInt(imagen));

        binding.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver= new Intent(Activity2.this, MainActivity.class);
                startActivity(volver);
            }
        });

    }
}