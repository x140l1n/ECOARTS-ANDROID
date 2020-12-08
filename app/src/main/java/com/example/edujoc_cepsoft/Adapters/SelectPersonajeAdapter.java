package com.example.edujoc_cepsoft.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.edujoc_cepsoft.Data.Personaje;
import com.example.edujoc_cepsoft.R;

import java.io.File;
import java.util.List;

public class SelectPersonajeAdapter extends ArrayAdapter<Personaje>
{
    public SelectPersonajeAdapter(@NonNull Context context, List<Personaje> personajes)
    {
        super(context, 0, personajes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.plantilla_grid_personajes, parent, false);

        ImageView imagenPersonaje = view.findViewById(R.id.imagenPersonaje);
        TextView txtViewNombrePersonaje = view.findViewById(R.id.txtViewNombrePersonaje);

        //Obtener la ruta de la imagen del objeto personaje, replazamos el ./ por la ruta files de la app y convertimos todo en minúsculas.
        String rutaAbsolutaPersonaje = getItem(position).getRutaImagen().replace("./", getContext().getFilesDir() + File.separator).toLowerCase();

        //Obtener la imagen de la ruta y crear una imagen Bitmap.
        Bitmap bitmapPersonaje = BitmapFactory.decodeFile(rutaAbsolutaPersonaje);

        //Insertar la imagen.
        imagenPersonaje.setImageBitmap(bitmapPersonaje);

        txtViewNombrePersonaje.setText(getItem(position).getNombre());

        return view;
    }
}
