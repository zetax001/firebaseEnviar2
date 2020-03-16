package com.example.z.firebaseenviar;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView precioPapaUnicaArequipa, precioCebollaRojaArequipa, precioTomateKatiaArequipa;
    private TextView precioPapaUnicaLima, precioCebollaRojaLima, precioTomateKatiaLima;
    private TextView fechaArequipa1,fechaArequipa2,fechaArequipa3;
    private TextView fechaLima1,fechaLima2,fechaLima3;


    DatabaseReference miDataBase = FirebaseDatabase.getInstance().getReference();

    //probando bitbucket

    //*******************
    // Arequipa
    //*******************

    DatabaseReference papaUnicaArequipa = miDataBase.child("Papa Unica Arequipa");
    DatabaseReference cebollaRojaArequipa = miDataBase.child("Cebolla Roja Arequipa");
    DatabaseReference tomateKatiaArequipa = miDataBase.child("Tomate Katia Arequipa");
    DatabaseReference fechaAqp=miDataBase.child("Fecha Arequipa");

    //*******************
    // Lima
    //*******************

    DatabaseReference papaUnicaLima = miDataBase.child("Papa Unica Lima");
    DatabaseReference cebollaRojaLima = miDataBase.child("Cebolla Roja Lima");
    DatabaseReference tomateKatiaLima = miDataBase.child("Tomate Katia Lima");
    DatabaseReference fechaLim=miDataBase.child("Fecha Lima");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conectar con xhtml
        //Arequipa

        precioPapaUnicaArequipa = (TextView) findViewById(R.id.txtPrecioPapaUnicaArequipa);
        precioCebollaRojaArequipa = (TextView) findViewById(R.id.txtPrecioCebollaRojaArequipa);
        precioTomateKatiaArequipa = (TextView) findViewById(R.id.txtPrecioTomateKatiaArequipa);

        fechaArequipa1=(TextView)findViewById(R.id.txtfechaArequipa1);
        fechaArequipa2=(TextView)findViewById(R.id.txtfechaArequipa2);
        fechaArequipa3=(TextView)findViewById(R.id.txtfechaArequipa3);

        //Lima

        precioPapaUnicaLima = (TextView) findViewById(R.id.txtPrecioPapaUnicaLima);
        precioCebollaRojaLima = (TextView) findViewById(R.id.txtPrecioCebollaRojaLima);
        precioTomateKatiaLima = (TextView) findViewById(R.id.txtPrecioTomateKatiaLima);

        fechaLima1=(TextView)findViewById(R.id.txtfechaLima1);
        fechaLima2=(TextView)findViewById(R.id.txtfechaLima2);
        fechaLima3=(TextView)findViewById(R.id.txtfechaLima3);


    }

    @Override
    protected void onStart() {
        super.onStart();
        //*******************
        //  Arequipa
        //*******************

        //****Fecha

        fechaAqp.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                fechaArequipa1.setText(texto);
                fechaArequipa2.setText(texto);
                fechaArequipa3.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //papa Unica
        papaUnicaArequipa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioPapaUnicaArequipa.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //cebolla roja

        cebollaRojaArequipa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioCebollaRojaArequipa.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //Tomate katia Arequipa

        tomateKatiaArequipa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioTomateKatiaArequipa.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        //*******************
        // Lima
        //*******************

        fechaLim.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                fechaLima1.setText(texto);
                fechaLima2.setText(texto);
                fechaLima3.setText(texto);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //papa unica lima

        papaUnicaLima.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioPapaUnicaLima.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //cebolla roja lima
        cebollaRojaLima.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioCebollaRojaLima.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //tomate katia lima

        tomateKatiaLima.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String texto = dataSnapshot.getValue().toString();
                precioTomateKatiaLima.setText(texto);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
