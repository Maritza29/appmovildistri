package com.example.distri.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.distri.R;
import com.example.distri.model.producto;


import java.util.List;

public class adaptadorprodu extends BaseAdapter {

    Context context;
    List<producto> lst;

    public adaptadorprodu(Context context, List<producto> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView ImageViewContacto;
        TextView TextViewNombre;
        TextView TextViewDes;

       producto c=lst.get(i);

        if (view==null)
            view= LayoutInflater.from(context).inflate(R.layout.listview_produc,null);

        ImageViewContacto=view.findViewById(R.id.imageViewContacto);
        TextViewNombre=view.findViewById(R.id.textViewNombre);
        TextViewDes=view.findViewById(R.id.textViewDes);

        ImageViewContacto.setImageResource(c.imagen);
        TextViewNombre.setText(c.nombre);
        TextViewDes.setText(c.Des);

        return view;
    }
}
