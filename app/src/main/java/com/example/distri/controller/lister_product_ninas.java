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

public class lister_product_ninas extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_ninas);
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
        lst.add(new producto(1, R.drawable.abrigoluces,"Abrigo con luces led ","Rosada unicornio y Verde Dinosaurio Precio: $15,00"));
        lst.add(new producto(2, R.drawable.alfombrabebe,"Alfombra Grande Para Bebes ","Alfombra 90x120cm Precio: $15,00"));
        lst.add(new producto(3, R.drawable.alidabano,"Salida De Baño Mickey","Talla 100 para niños hasta 2 años Precio: $11,00"));
        lst.add(new producto(4, R.drawable.bebelloron,"Bebe llorón ","Cry Babys Precio: $18,00"));
        lst.add(new producto(5, R.drawable.boligrafo3d,"Bolígrafos mágicos 3D ","bolígrafo de segunda generación agrega una pantalla LED Precio: $16,00"));
        lst.add(new producto(5, R.drawable.bolsocruzado,"Bolso infantil diseño cruzado ","Bolso de Popotrol Precio: $7,00"));
        lst.add(new producto(5, R.drawable.bolsodino,"Bolso infantil diseño Dino ","Bolso de varios colores Precio: $7,00"));
        lst.add(new producto(5, R.drawable.bolsoosito,"Bolso osito ","Bolso para niñas Precio: $8,00"));
        lst.add(new producto(5, R.drawable.carpainfantil,"Carpa Infantil Grande ","Carpas de color rosada y celeste Precio: $18,00"));
        lst.add(new producto(5, R.drawable.cuerdacontadora,"Cuerda contadora de pasos ","colores al azar Precio: $3,50"));
        lst.add(new producto(5, R.drawable.gorrainfantil,"Gorras infantiles  conejito ","Varios colores Precio: $7,00"));
        lst.add(new producto(5, R.drawable.happy,"Happy Nappers ","varios modelos Precio: $14,00"));
        lst.add(new producto(5, R.drawable.juegodidacti,"Juego didáctico ","Juegos tres en uno grande Precio: $15,00"));
        lst.add(new producto(5, R.drawable.kitartistico,"Kit artístico 180 colores ","Maletín De Madera Precio: $18,00"));
        lst.add(new producto(5, R.drawable.lamparasacapunta,"Lámpara Sacapunta","Porta celular o porta lápices Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mantacartera,"Manta/Cartera 2 En 1 ","varios Dibujitos Precio: $14,00"));
        lst.add(new producto(5, R.drawable.mascarasonic,"Máscara Sonic Y Sus Amigos ","color Azul y Rojo Precio: $10,00"));
        lst.add(new producto(5, R.drawable.minilaptop,"Mini laptop didáctica ","Tiene Sonido Aprende en Ingles Rosado y Celeste Precio: $10,00"));
        lst.add(new producto(5, R.drawable.mochilaairoman,"Mochila Afelpada Ironman ","Ironman Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilacapitan,"Mochila Afelpada Capitan America ","Capitan Americs Precio: $7,00"));
        lst.add(new producto(1, R.drawable.mochilahello,"Mochila Afelpada Hello Kitty","Hello Kitty Precio: $7,00"));
        lst.add(new producto(2, R.drawable.mochilamelody,"Mochila Afelpada Melody ","Melody Precio: $7,00"));
        lst.add(new producto(3, R.drawable.mochilamicke,"Mochila Afelpada Micke","Micke Precio: $7,00"));
        lst.add(new producto(4, R.drawable.mochilamini,"Mochila Afelpada Minie ","Minie Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilaoso,"Mochila Afelpada Oso","Oso Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilapood,"Mochila Afelpada Pooh","Pooh Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilasonic,"Mochila Afelpada Sonic","Sonic Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilaspiderman,"Mochila Afelpada Spiderman","Spiderman Precio: $7,00"));
        lst.add(new producto(5, R.drawable.mochilasuperman,"Mochila Afelpada Superman","Superman Precio: $7,00"));
        lst.add(new producto(5, R.drawable.montesorri," Montesorri","Rompecabezas 6 en 1 Verde Precio: $14,00"));
        lst.add(new producto(5, R.drawable.mosquiterobebe,"Mosquitero Para Bebés","Celeste y Rosado Precio: $10,00"));
        lst.add(new producto(5, R.drawable.ochilapicachu,"Mochila Pikachu","Pikachu Precio: $9,00"));
        lst.add(new producto(5, R.drawable.peluchecerdi,"peluche Cerdito Kawaii","Cerdito Kawaii Precio: $13,00"));
        lst.add(new producto(5, R.drawable.pelucheelefant,"Peluche Elefante","Peluche con manta Precio: $20,00"));
        lst.add(new producto(5, R.drawable.pistatren,"Pista De Tren","Juguete Precio: $9,00"));
        lst.add(new producto(5, R.drawable.popit,"Pop It","Varios Modelos Precio: $5,00"));
        lst.add(new producto(5, R.drawable.relojdigi,"Reloj Digital Para Niños","Diseños Exclusivos Precio: $5,00"));
        lst.add(new producto(5, R.drawable.rompecabeza,"Rompecabeza 3D","Varias Formas Precio: $5,00"));
        lst.add(new producto(5, R.drawable.monopatin,"Scooters","celeste Y Rosado Precio: $15,00"));
        lst.add(new producto(5, R.drawable.vinchas,"Pack de 2 vinchas","Colores Pasteles Precio: $2, 00"));

        return lst;
    }
}
