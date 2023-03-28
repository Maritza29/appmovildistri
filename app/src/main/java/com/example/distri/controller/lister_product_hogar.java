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


public class lister_product_hogar extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_hogar);
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
        lst.add(new producto(1, R.drawable.abrelata,"Abre Lata","Precio: $5,00"));
        lst.add(new producto(2, R.drawable.alfombrabano,"Set de alfombras de baño  ","Precio: $10,00"));
        lst.add(new producto(3, R.drawable.almohada,"Almohada para Pierna y Rodilla ","Precio: $10,00"));
        lst.add(new producto(4, R.drawable.azucarera,"Azucarera De Cristal   ","Precio: $5,00 "));
        lst.add(new producto(5, R.drawable.balanza_digital,"Balanza Digital para alimentos ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.bolsoexpandible,"Bolso expandible  ","Precio: $13,00 "));
        lst.add(new producto(5, R.drawable.cantina3litros,"Cantina cromada de 3 litros ","Precio: $11,00"));
        lst.add(new producto(5, R.drawable.cestarectangular,"Cesta rectangular  ","Precio: $5,00"));
        lst.add(new producto(5, R.drawable.correradeyoga,"Correa de yoga  ","Precio: $6,00"));
        lst.add(new producto(5, R.drawable.cortadorafrutas,"Cortadora de frutas y verduras ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.dispensadordefunda,"Dispensador de fundas ","Precio: $5,00"));
        lst.add(new producto(5, R.drawable.enchufewifi,"Enchufe Inteligente Wifi ","Precio: $12,00"));
        lst.add(new producto(5, R.drawable.focoled,"Foco led con Luces Psicodélico","Precio: $7,00"));
        lst.add(new producto(5, R.drawable.foreo,"Jimny choo ","Precio: $6,00"));
        lst.add(new producto(5, R.drawable.juegotasa,"Juego de 4 tazas y 1 jarra ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.lucesproyector,"Luces láser proyector Led grande ","Precio: $15,00"));
        lst.add(new producto(5, R.drawable.mause,"Mause Weibo Diseño Simple ","Precio: $7,00"));
        lst.add(new producto(5, R.drawable.moldededitos,"Moldes para hacer deditos de carne ","Precio: $6,00"));
        lst.add(new producto(5, R.drawable.organizadorbano,"Organizador de baño metálico ","Precio: $18,00"));
        lst.add(new producto(5, R.drawable.organizadorespecies,"Organizador De Especies 2 Pisos ","Precio: $15,00"));
        lst.add(new producto(1, R.drawable.organizadorzapatos,"Organizador de zapatos","Precio: $18,00"));
        lst.add(new producto(2, R.drawable.osodesinfectante,"Oso desinfectante para el inodoro ","Precio: $3,00"));
        lst.add(new producto(3, R.drawable.platera2pozo,"Platera Escurridor De 2 Pozos Grande  ","Precio: $26,00"));
        lst.add(new producto(4, R.drawable.platera3pozo,"Platera escurridora DELUXE 2 Piso  ","Precio: $20,00"));
        lst.add(new producto(5, R.drawable.plateradeluxe2,"Platera escurridora DELUXE 3 piso ","Precio: $23,00"));
        lst.add(new producto(5, R.drawable.repisabano,"Repisa Esquinero Para Baño ","Precio: $13,00"));
        lst.add(new producto(5, R.drawable.set3moldes,"Set de 3 Moldes de torta redondos ","Precio: $12,00"));
        lst.add(new producto(5, R.drawable.set4molde,"Set de 4 reposteros cuadrados ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.soportelaptop,"Soporte para Laptop ","Precio: $5,00"));
        lst.add(new producto(5, R.drawable.teteraelectrica,"Tetera electrica 2 litros ","Precio: $15,00"));
        lst.add(new producto(5, R.drawable.toallamano,"Toalla De Mano ","Precio: $5,00"));
        lst.add(new producto(5, R.drawable.tomatodo,"Tomatodo Navideño Dúo ","Precio: $12,00"));
        lst.add(new producto(5, R.drawable.tomatodo2,"Tomatodos Motivacional De 1 Litro  ","Precio: $8,00"));
        lst.add(new producto(5, R.drawable.trapeador,"Trapeador Con Balde ","Precio: $15,00"));
        lst.add(new producto(5, R.drawable.trapeadorgirar,"Trapeador Giratorio 360° ","Precio: $13,00"));
        lst.add(new producto(5, R.drawable.utensilio,"Utensilios de cocina de silicon ","Precio: $17,00"));
        lst.add(new producto(5, R.drawable.vasowhisky,"Set de 6 vasos de Whisky ","Precio: $10,00"));
        lst.add(new producto(5, R.drawable.zapatera27pares,"Zapatera 27 pares ","Precio: $15,00"));
        lst.add(new producto(5, R.drawable.ropero,"ropero 3 cuerpos ","Precio: $25,00"));
        lst.add(new producto(5, R.drawable.papelantiherente,"Papel Antiadherente Desechable para Freidora ","Precio: $5,00"));
        return lst;
    }
}
