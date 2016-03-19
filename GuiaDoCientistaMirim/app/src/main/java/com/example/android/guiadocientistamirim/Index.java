package com.example.android.guiadocientistamirim;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Index extends AppCompatActivity {

    private String[] curiosidades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        curiosidades = getResources().getStringArray(R.array.curiosities);

        TextView txtStart = (TextView)findViewById(R.id.txt_start);
        String nome="";

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null && bundle.containsKey("NOME")){
            nome = bundle.getString("NOME");
        }

        txtStart.setText(getResources().getString(R.string.welcome) +" "+ nome);

    }
    //Redirecionamento aos experimentos
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

        final AlertDialog.Builder echat = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.echat, null);
        //Ouvintes do evento de clique dos RadioButton's
        dialogView.findViewById(R.id.op1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responderStatus(dialogView, R.string.res_echat_op1);
            }
        });
        dialogView.findViewById(R.id.op2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responderStatus(dialogView, R.string.res_echat_op2);
            }
        });
        dialogView.findViewById(R.id.op3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responderStatus(dialogView, R.string.res_echat_op3);
            }
        });
        dialogView.findViewById(R.id.op4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responderStatus(dialogView, R.string.res_echat_op4);
            }
        });
        dialogView.findViewById(R.id.op5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responderStatus(dialogView, R.string.res_echat_op5);
            }
        });
        echat.setView(dialogView).setNeutralButton(R.string.back, null);
        echat.show();


    }

    public void mostrarCuriosidade(View view){

        AlertDialog.Builder curiosidade = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_curiosidade, null);

        curiosidade.setView(dialogView)
                .setNeutralButton(R.string.back, null);
        TextView txt = (TextView) dialogView.findViewById(R.id.curiosidade_dia);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        txt.setText(curiosidades[day - 1]);

        curiosidade.show();

    }

    public void responderStatus(View dialogView, int menssage){
        ((LinearLayout)dialogView.findViewById(R.id.linear_dialog)).removeView(dialogView.findViewById(R.id.opcoes));
        ((TextView)dialogView.findViewById(R.id.dialog_eugenio)).setText(menssage);
    }

}
