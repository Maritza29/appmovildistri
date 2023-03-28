package com.example.distri.controller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.distri.R;
import com.example.distri.model.producto;

import java.util.ArrayList;
import java.util.List;

public class lister_produc_perfumes extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_perfumes);
        ListViewContacto = findViewById(R.id.ListViewContacto);
        adaptadorprodu adapter = new adaptadorprodu(this, GetData());
        ListViewContacto.setAdapter(adapter);
        ListViewContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                producto c = lst.get(i);
                Toast.makeText(getBaseContext(),c.nombre+c.Des,Toast.LENGTH_SHORT).show();
                Intent ve = new  Intent( Intent.ACTION_VIEW, Uri.parse(String.format("https://wa.me/593963874445?text=Me interesa su producto ")+c.nombre+" "+c.Des));
                startActivity(ve);

            }
        });
    }

    private List<producto> GetData() {
        lst = new ArrayList<>();
        lst.add(new producto(1, R.drawable.perfume1,"PERFUME y Gel de baño","Forever Emotions Precio: $5,00"));
        lst.add(new producto(2, R.drawable.perfume2,"PERFUME y Gel de baño ","V.V.Lovers Hombre Precio: $5,00"));
        lst.add(new producto(3, R.drawable.perfume3,"PERFUME y Gel de baño","Bravo Hombre Precio: $5,00"));
        lst.add(new producto(4, R.drawable.perfume4,"PERFUME y Gel de baño  ","Amazing rosa Mujer Precio: $5,00"));
        lst.add(new producto(5, R.drawable.perfume5,"Perfume 100 ml Caja  ","Forever Mujer Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume6,"Perfume 100 ml Caja  ","Gentle Days Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume7,"Perfume 100 ml Caja  ","Back in Black Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume8,"Perfume 100 ml Caja  ","Glentle Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume9,"Perfume 100 ml Caja  ","Romance Bak Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume10,"Perfume 100 ml Caja ","Noble & Valiant Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume11,"Perfume 100 ml Caja  ","Man Negro Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume12,"Perfume 100 ml Caja  ","Loyalty & Faith Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume13,"Perfume 100 ml Caja  ","Jack Paro Hombre Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume14,"Perfume 100 ml Caja ","Madam Dian Mujer Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume15,"Perfume 100 ml Caja ","Sexy Girls Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume16,"Perfume 100 ml Caja  ","Forever Emotions Rosa Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume17,"Perfume 100 ml Caja ","Angel Drean Mujer Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume18,"Perfume 100 ml Caja ","Blossom Paris Rosa Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume19,"Perfume 100 ml Caja  ","Amazing Pink Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.perfume20,"Perfume 100 ml Caja  ","Forever Emotions Morado Precio: $7,00 "));
        lst.add(new producto(1, R.drawable.perfume21,"Perfume 100 ml Caja ","La Bella Viva Mujer Precio: $7,00"));
        lst.add(new producto(2, R.drawable.perfumehombre,"Perfume 100 ml Caja ","Brave Man Hombre Precio: $7,00"));
        lst.add(new producto(3, R.drawable.splash1,"SPLASH DE 250ml ","Bellini Naranja Precio: $8,00"));
        lst.add(new producto(4, R.drawable.splash2,"SPLASH DE 250ml   ","Cabana Celeste Precio: $8,00 "));
        lst.add(new producto(5, R.drawable.splash3,"SPLASH DE 250ml  ","Clear & Nature Fucsia Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash4,"SPLASH DE 250ml  ","Heart Beat Rosa Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash5,"SPLASH DE 250ml  ","Constant Happiness Lila Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash6,"SPLASH DE 250ml  ","Sparkling Dream Dorado Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash7,"SPLASH DE 250ml  ","Fairytale verde Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash8,"SPLASH DE 250ml ","Fantasy Rose Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash9,"SPLASH DE 250ml  ","Golden Ocean Pearl Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash10,"SPLASH DE 250ml  '","Love Again Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash11,"SPLASH DE 250ml  ","Mad & Vivid Celeste Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash12,"SPLASH DE 250ml ","Love Rosa Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash13,"SPLASH DE 250ml  ","Pink Sunset Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash14,"SPLASH DE 250ml  ","Summer Rosa Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash15,"SPLASH DE 250ml  ","Surf on Waves Celeste Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash16,"SPLASH DE 250ml  ","Midnight Swim Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash17,"SPLASH DE 250ml  ","Velvet Night Rosado Precio: $8,00"));
        lst.add(new producto(5, R.drawable.splash18,"SPLASH DE 250ml ","Xoxo Morado Precio: $8,00"));

        return lst;
    }
}
