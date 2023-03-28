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

public class lister_product_maquillaje extends AppCompatActivity {
    ListView ListViewContacto;
    List<producto> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_product_maquillaje);

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
        lst.add(new producto(1, R.drawable.aguarosa,"Agua de rosas","maria jose 500ml Precio: $5,00"));
        lst.add(new producto(2, R.drawable.balsamoiman,"Bálsamos Iman","Noble frutilla Precio: $1,00"));
        lst.add(new producto(3, R.drawable.cajamascarilla,"Caja de 10 Mascarillas","puntos negros Aloe Vera Precio: $5,00"));
        lst.add(new producto(4, R.drawable.comboboquita,"Combo boquita hermosa ","Incluye Exfoliante Para Labios Precio: $6,00"));
        lst.add(new producto(5, R.drawable.combopestanas,"Combo Pestañas","pestañas y goma de pestañas Precio: $3,00"));
        lst.add(new producto(5, R.drawable.corrector,"Corrector","Bh Cosmetics Precio: $4,00"));
        lst.add(new producto(5, R.drawable.cremaaclarante,"Crema aclaradora","vitamina C 50g Precio: $4,00"));
        lst.add(new producto(5, R.drawable.cremacorporal,"Crema corporal de leche ","Crema para todo tipo de piel 260ml Precio: $5,00"));
        lst.add(new producto(5, R.drawable.dermacol,"Dermacol Make-Up Cover ","Proporciona Cobertura  Precio: $3,00"));
        lst.add(new producto(5, R.drawable.exfoliantemilk,"Exfoliante Milk","Reduce la formación de acné Precio: $4,00"));
        lst.add(new producto(5, R.drawable.foreo,"Foreo exfoliante","masajeador facial  Precio: $4,00"));
        lst.add(new producto(5, R.drawable.gelceja,"Gel de cejas","dúo Miss Royal Precio: $5,00"));
        lst.add(new producto(5, R.drawable.jabonfacial,"Jabón Facial","Brinda una limpieza profunda  Precio: $4,00"));
        lst.add(new producto(5, R.drawable.jelly,"Jelly Spa Milk","Gelatina para relajar tus pies Precio: $3,00 "));
        lst.add(new producto(5, R.drawable.labialesbarra,"Labiales En Barra","Magnéticos 5 tonos Precio: $5,00"));
        lst.add(new producto(5, R.drawable.lipgloss,"LipGloss Ushas Popular","labiales líquidos Precio: $2,00"));
        lst.add(new producto(5, R.drawable.mascarillacaffeine,"Mascarilla peel off Caffeine","Limpia los poros 70g Precio: $4,00"));
        lst.add(new producto(5, R.drawable.mascarillacurcuma,"Mascarilla facial de cúrcuma","Purifica los poros,elimina las células muertas Precio: $4,00"));
        lst.add(new producto(5, R.drawable.ollacera,"Combo olla de cera","cutís de bebé Precio: $17, 00 $"));
        lst.add(new producto(5, R.drawable.paletasombra,"Paleta Give Back ","Paletas de 12 tonos satinados y mate de alta pigmentación Precio: $5,00"));
        lst.add(new producto(1, R.drawable.paletasombra2,"Paleta de sombra You’re Money","Excelente pigmentación Precio: $10,00"));
        lst.add(new producto(2, R.drawable.paleta3,"Paleta Ibiza ","Excelente pigmentacion Precio: $8,00"));
        lst.add(new producto(3, R.drawable.polvocompacto,"Polvo compacto","Tiene filtro UV  Precio: $5,00"));
        lst.add(new producto(4, R.drawable.polvocompacto2,"Polvo Compacto Violet  ","Espejo Y Esponja Tono 1 Precio: $3,00"));
        lst.add(new producto(5, R.drawable.polvocompacto3,"Polvo Compacto Violet ","Espejo Y Esponja Tono 2 Precio: $3,00"));
        lst.add(new producto(5, R.drawable.primersellador,"Set Primer y Sellador  ","Sellar el Maquillaje Precio: $5,00"));
        lst.add(new producto(5, R.drawable.rubor1,"Rubor My Life Four","Rubor Tono 1 Precio: $4,00"));
        lst.add(new producto(5, R.drawable.rubor2,"Rubor My Life Four","Rubor Tono 2 Precio: $4,00"));
        lst.add(new producto(5, R.drawable.rubor3,"Rubor My Life Four","Rubor Tono 3 Precio: $4,00"));
        lst.add(new producto(5, R.drawable.sombra,"Sombra 35G BRONZE","paleta grande Precio: $8,00"));
        lst.add(new producto(5, R.drawable.sombra1,"Sombras Viva México","Sombra Modelo 1 Precio: $5,00"));
        lst.add(new producto(5, R.drawable.sombra2,"Sombras Viva México","Sombra Modelo 2 Precio: $5,00"));
        lst.add(new producto(5, R.drawable.sombra3,"Sombras Viva México","Sombra Modelo 3 Precio: $5,00"));
        lst.add(new producto(5, R.drawable.sombraliquida,"Sombras líquidas","Glitter Ushas super brillante Precio: $3,00"));
        lst.add(new producto(5, R.drawable.sombraplanet,"Sombra Sweet Planet","Sombra Grande variedades de colores Precio: $10,00"));
        lst.add(new producto(5, R.drawable.serumbarba,"Sérum","Para el crecimiento De La Barba Para Hombre Precio: $4,00"));
        lst.add(new producto(5, R.drawable.shampoo,"Shampoo Profesional","Shampoo Antiperdida Y Crecimiento Capilar 200ml Precio: $6,00"));
        lst.add(new producto(5, R.drawable.slimpatch,"Slim Patch","Los parches bloquean eficazmente la absorción de grasa Precio: $5,00"));
        lst.add(new producto(5, R.drawable.splacabello,"Splash Para Cabello","Aromas Ricos Precio: $5,00"));
        lst.add(new producto(5,R.drawable.toallitasdesmaquillantes,"\n" +
                "Toallitas Desmaquillantes","Toallas Desmaquillantes En Hermoso Envase  Precio: $1,00"));




        return lst;
    }
}