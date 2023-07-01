package com.example.semana5.Adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.semana5.Modelos.Usuario;
import com.example.semana5.R;

import java.util.ArrayList;

public class AdaptadorUsuario extends ArrayAdapter<Usuario> {
    public AdaptadorUsuario(Context context, ArrayList<Usuario> datos) {
        super(context, R.layout.lista_bonita, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lista_bonita, null);
        TextView lblNombre = (TextView)item.findViewById(R.id.lblNombre);lblNombre.setText(getItem(position).getNombres());
        TextView lblEmail= (TextView)item.findViewById(R.id.lblEmail);lblEmail.setText(getItem(position).getEmail());
        TextView lblWebsite= (TextView)item.findViewById(R.id.lblweb);lblWebsite.setText(getItem(position).getWebsite());
        ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlavatar())
                .into(imageView);
        return(item);
    }
}
