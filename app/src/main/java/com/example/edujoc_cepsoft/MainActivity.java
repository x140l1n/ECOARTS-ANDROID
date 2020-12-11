package com.example.edujoc_cepsoft;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends MiActivityPersonalizado
{
    @Override
    @SuppressWarnings("deprecation") //Eliminar la advertencia de usar métodos en desuso.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, IdiomaActivity.class));
                finish();
            }
        }, 2000);
    }
}