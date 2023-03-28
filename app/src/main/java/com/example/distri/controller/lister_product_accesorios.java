package com.example.distri.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.distri.R;
import com.example.distri.model.producto;

import java.util.ArrayList;
import java.util.List;

public class lister_product_accesorios extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_accesorios);
        ListViewContacto=findViewById(R.id.ListViewContacto);
        adaptadorprodu adapter=new adaptadorprodu(this,GetData());
        ListViewContacto.setAdapter(adapter);
        ListViewContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                producto c=lst.get(i);
                Toast.makeText(getBaseContext(),c.nombre+c.Des,Toast.LENGTH_SHORT).show();
                Intent ve = new  Intent( Intent.ACTION_VIEW, Uri.parse(String.format("https://wa.me/593963874445?text=Me interesa su producto ")+c.nombre+" "+c.Des));
                startActivity(ve);

            }
        });
    }

    private List<producto> GetData() {
        lst=new ArrayList<>();
        lst.add(new producto(1, R.drawable.anillo1,"Anillo y Cadena giratorio ","Precio: $10,00"));
        lst.add(new producto(2, R.drawable.anillo2,"Set de anillos  ","Precio: $8,00 "));
        lst.add(new producto(3, R.drawable.aretes1,"Aretes goldfield corazón verde","Precio: $5,00 "));
        lst.add(new producto(4, R.drawable.aretes2,"Aretes de goldfield lunas  ","Precio: $5,00 "));
        lst.add(new producto(5, R.drawable.aretes3,"Aretes de goldfield mariposas ","Precio: $5, 00"));
        lst.add(new producto(5, R.drawable.aretes4,"Aretes de goldfield perlas ","Precio: $5, 00"));
        lst.add(new producto(5, R.drawable.aretes5,"Aretes de goldfield  ","Precio: $5,00"));
        lst.add(new producto(5, R.drawable.argollas1,"Argollas de acero ","Precio: $7,00 "));
        lst.add(new producto(5, R.drawable.cadena1,"Cadena de acero quirúrgico ","Precio: $10,00$"));
        lst.add(new producto(5, R.drawable.cadena2,"Cadena de Best Friends ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.cadena3,"Cadena de goldfield Corazon ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.cadena4,"Cadena de Perlas ","Precio: $7,00"));
        lst.add(new producto(5, R.drawable.cadena5,"Cadena doble acero ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.cadena6,"Cadena doble de iman  ","Precio: $8,00 "));
        lst.add(new producto(5, R.drawable.cadena7,"Cadena Doble de Trebol ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.cadena8,"Cadena triple acero ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.cadena9,"Cadena y dije de estetoscopio ","Precio: $8,00 "));
        lst.add(new producto(5, R.drawable.cadenas10,"Cadenas de acero quirúrgico ","Precio: $8,00 "));
        lst.add(new producto(5, R.drawable.cadenas11,"Cadenas triples de mano  ","Precio: $$10,00 "));
        lst.add(new producto(5, R.drawable.cadenas12,"Cadenas triples de Cruz  ","Precio: $$10,00"));
        lst.add(new producto(1, R.drawable.cadenas13,"Cadenas triples de Corazon","Precio: $10,00"));
        lst.add(new producto(2, R.drawable.cadenas14,"Cadenas triples de cristal ","Precio: $10,00"));
        lst.add(new producto(3, R.drawable.cadenas15,"Cadenas triples de corazoncito","Precio: $10,00"));
        lst.add(new producto(4, R.drawable.cadenas16,"Cadenas triples de corazon  ","Precio: $10,00 "));
        lst.add(new producto(5, R.drawable.conjunto1,"Conjunto Cadena y anillo rosa ","Precio: $11,00 "));
        lst.add(new producto(5, R.drawable.conjunto2,"Conjunto Cadena y anillo Serpiente","Precio: $11,00 "));
        lst.add(new producto(5, R.drawable.conjunto3,"Conjunto Cadena y anillo trebol ","Precio: $11,00 "));
        lst.add(new producto(5, R.drawable.conjuntos3,"conjuntos de goldfield Llave ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.juegos1,"Juegos de acero quirúrgico ángelito ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.juegos2,"Juegos de acero quirúrgico árbol ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.juegos3,"Juegos de acero quirúrgico Corona ","Precio: $8, 00"));
        lst.add(new producto(5, R.drawable.juegos4,"Juegos de acero quirúrgico Cruz","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.juegos5,"Juegos de acero quirúrgico Mariposa ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.juegos6,"Juegos de acero quirúrgico Minie ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.pulseras,"Pulseras ","Precio: $4,00 "));
        lst.add(new producto(5, R.drawable.pulseras1,"Pulseras de acero quirúrgico  ","Precio: $10,00 "));
        lst.add(new producto(5, R.drawable.pulseras2,"Pulsera de acero ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.pulseras3,"Pulseras de pareja ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.relojes,"Relojes de pareja ","Precio: $14,00"));
        lst.add(new producto(5, R.drawable.relicario1,"Relicario de mariposa de goldfield ","Precio: $11,00"));

        return lst;
    }
}