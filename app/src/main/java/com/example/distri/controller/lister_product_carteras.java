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

public class lister_product_carteras extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_carteras);
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
        lst.add(new producto(1, R.drawable.cartera1,"Carteras Modelo 1 ","carteras color roja negra y blanca Precio: $8,00"));
        lst.add(new producto(2, R.drawable.cartera2piezas,"Cartera 2 piezas ","color azul oscuro Precio: $16,00"));
        lst.add(new producto(3, R.drawable.cartera2piezas2,"Cartera 2 piezas","color blanca Precio: $16,00"));
        lst.add(new producto(4, R.drawable.cartera2piezas3,"Cartera 2 piezas  ","color cafe Precio: $16,00"));
        lst.add(new producto(5, R.drawable.cartera2piezascafe,"Cartera 2 piezas ","color cafe oscuro Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cartera2piezascaqui,"Cartera 2 piezas ","color caqui Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cartera2piezasnegra,"Cartera 2 piezas  ","color negra Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cartera2piezasnegra2,"Cartera 2 piezas ","color negra Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cartera2piezasroja,"Cartera 2 piezas","Color roja Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cartera2piezasrosa,"Cartera 2 piezas ","color rosa Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.cartera2piezasrosada,"Cartera 2 piezas ","color rosada Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carterabandolera,"Carteras bandoleras giras ","color blanca, rosada,verde y negra Precio: $8,00"));
        lst.add(new producto(5, R.drawable.carteradobleazul,"Cartera Doble ","color azul Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteradobleceleste,"Cartera Doble   ","Color Celeste Precio: $18,00"));
        lst.add(new producto(5, R.drawable.carteradobledorada,"Cartera Doble  ","Color Dorada Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteradoblelila,"Cartera Doble  ","Color Lila Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteradoblemostaza,"Cartera Doble  ","Color Mostaza Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteradobleplateada,"Cartera Doble  ","Color Plateado Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteradoroja,"Cartera Doble  ","Color Roja Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteralazopuntitos,"Cartera lazo Puntitos  ","Precio: $10,00"));
        lst.add(new producto(1, R.drawable.carteramodelo2,"Cartera Modelo 2","Cartera con Variedades de colores Precio: $18,00"));
        lst.add(new producto(2, R.drawable.carteramodelo3,"Cartera Modelo 3","Cartera con Variedades de colores  Precio: $18,00"));
        lst.add(new producto(3, R.drawable.carteramodelo4,"Cartera Modelo 4","Cartera con Variedades de colores Precio: $18,00"));
        lst.add(new producto(4, R.drawable.carteramodelo5,"CCartera Modelo 5  ","Cartera con Variedades de colores Precio: $18,00"));
        lst.add(new producto(5, R.drawable.carteramodelo6,"Cartera Modelo 6","Cartera con Variedades de colores Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteramodelo7,"Cartera Modelo 7 ","Cartera con Variedades de colores Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteramodelo9,"Cartera Modelo 8 ","Cartera con Variedades de colores Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carteranegra1,"Cartera Grande ","Color Negra Precio: $18,00 "));
        lst.add(new producto(5, R.drawable.carterasfashion,"Carteras Fashion ","Cartera con Variedades de colores Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carteraskiuamarilla,"Carteras Kiut Transparentes ","Color Amarilla Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carteraskiublanca,"Carteras Kiut Transparentes  ","Color Blanca Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carteraskiulila,"Carteras Kiut Transparentes ","Color Lila Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carteraskiurosada,"Carteras Kiut Transparentes ","Color Rosada Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carterastransparentes,"Carteras Transparente  ","Variedades de Colores Precio: $4,00"));
        lst.add(new producto(5, R.drawable.carterasblack,"Carteras Black and White ","Color Negra y Blanco Precio: $13,00 "));
        lst.add(new producto(5, R.drawable.carteraclasica,"Cartera Clasica ","colores disponoble verde, amarillo y negro Precio: $18,00"));
        lst.add(new producto(5, R.drawable.carteraosonegro,"Cartera de Oso","Color Negro Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carteraosoblanca,"Carteras de Oso ","Color Blanco Precio: $15,00"));
        lst.add(new producto(5, R.drawable.carterabrochetriangulo,"Cartera broche de triángulo ","Colores verde, amarillo y negro Precio: $15,00 "));
        lst.add(new producto(5, R.drawable.carterarayo1,"Cartera rayo ","Colores disponible negro y cafe Precio: $14,00"));

        return lst;
    }
}