package com.example.android.guiadocientistamirim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LicaoDoMal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licao_do_mal2);
    }

    public void cumprirLicao(View view){
        Intent it = new Intent(this, LicaoDoMal3.class);
        startActivity(it);
    }

    public void voltarInicio(View view){
        Intent it = new Intent(this, Index.class);
        startActivity(it);
    }
}
