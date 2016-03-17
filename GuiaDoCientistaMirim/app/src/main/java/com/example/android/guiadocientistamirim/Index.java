package com.example.android.guiadocientistamirim;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Index extends AppCompatActivity {

    private String[] curiosidades = getResources().getStringArray(R.array.curiosities);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        TextView txtStart = (TextView)findViewById(R.id.txt_start);
        String nome = "";

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null && bundle.containsKey("NOME")){
            nome = bundle.getString("NOME");
        }

        txtStart.setText("Bem vindo, Dr(a). "+nome);

    }

    public void irLicao1(View view){
        Intent it = new Intent(this, LicaoDoMal1.class);
        startActivity(it);
    }

    public void irLicao2(View view){
        Intent it = new Intent(this, LicaoDoMal2.class);
        startActivity(it);
    }

    public void irLicao3(View view){
        Intent it = new Intent(this, LicaoDoMal3.class);
        startActivity(it);
    }

    public void irLicao4(View view){
        Intent it = new Intent(this, LicaoDoMal4.class);
        startActivity(it);
    }

    public void irLicao5(View view){
        Intent it = new Intent(this, LicaoDoMal5.class);
        startActivity(it);
    }

    public void abrirEChat(View view){


    }

    public void mostrarCuriosidade(View view){

        AlertDialog.Builder curiosidade = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        TextView txt = (TextView)findViewById(R.id.curiosidade_dia);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        txt.setText(curiosidades[day-1]);
        curiosidade.setView(inflater.inflate(R.layout.curiosidade, null))
                .setNeutralButton("Ok", null);

        curiosidade.show();

    }


}
