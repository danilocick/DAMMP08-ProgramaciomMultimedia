package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorgeneral = 0;
    int contadorprimero = 0;
    int contadorsegundo = 0;
    int contadortercero = 0;
    int contadorcuarto = 0;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //reset all
        binding.botonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorgeneral = 0;
                contadorprimero = 0;
                contadorsegundo = 0;
                contadortercero = 0;
                contadorcuarto = 0;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
                binding.primerasalida.setText(String.valueOf(contadorprimero));
                binding.segundasalida.setText(String.valueOf(contadorsegundo));
                binding.tercerasalida.setText(String.valueOf(contadortercero));
                binding.cuartasalida.setText(String.valueOf(contadorcuarto));
            }
        });

        //reset primera fila
        binding.primerbotonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorprimero = 0;
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
                binding.primerasalida.setText(String.valueOf(contadorprimero));

            }
        });

        //reset segunda fila
        binding.segundobotonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorsegundo = 0;
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
                binding.segundasalida.setText(String.valueOf(contadorsegundo));

            }
        });

        //reset tercera fila
        binding.tercerbotonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadortercero = 0;
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
                binding.tercerasalida.setText(String.valueOf(contadortercero));

            }
        });

        //reset cuarta fila
        binding.cuartobotonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorcuarto = 0;
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
                binding.cuartasalida.setText(String.valueOf(contadorcuarto));

            }
        });

        //+1 primera fila
        binding.primerbotona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorprimero++;
                binding.primerasalida.setText(String.valueOf(contadorprimero));
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
            }
        });

        //+1 segunda fila
        binding.segundobotona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorsegundo++;
                binding.segundasalida.setText(String.valueOf(contadorsegundo));
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
            }
        });

        //+1 tercera fila
        binding.tercerbotona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortercero++;
                binding.tercerasalida.setText(String.valueOf(contadortercero));
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
            }
        });

        //+1 cuarta fila
        binding.cuartobotona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorcuarto++;
                binding.cuartasalida.setText(String.valueOf(contadorcuarto));
                contadorgeneral = contadorprimero + contadorsegundo + contadortercero + contadorcuarto;
                binding.salidatotal.setText(String.valueOf(contadorgeneral));
            }
        });


    }
}