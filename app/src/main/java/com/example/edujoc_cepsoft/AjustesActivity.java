package com.example.edujoc_cepsoft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.edujoc_cepsoft.Helpers.GifHelper;

public class AjustesActivity extends MiActivityPersonalizado
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        GifHelper.loadGif(this, R.drawable.fondo_principal_animado, (ImageView) findViewById(R.id.fondoGif));

        //Cargar el número de la versión de la app.
        final TextView txtViewVersion = findViewById(R.id.txtViewVersion);
        txtViewVersion.append(BuildConfig.VERSION_NAME);

        final Button btnCambiarIdioma = findViewById(R.id.btnCambiarIdioma);
        final Button btnContactar = findViewById(R.id.btnContactar);
        final Button btnCreditos = findViewById(R.id.btnCreditos);
        final ImageButton btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        btnCambiarIdioma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AjustesActivity.this, IdiomaActivity.class));
            }
        });

        btnContactar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_APP_EMAIL);
                startActivity(intent);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AjustesActivity.this, CreditosActivity.class));
            }
        });
    }
}