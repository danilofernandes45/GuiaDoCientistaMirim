package com.example.android.guiadocientistamirim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Index extends AppCompatActivity {

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

        txtStart.setText("Bem vindo, Dr. "+nome);

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

}
