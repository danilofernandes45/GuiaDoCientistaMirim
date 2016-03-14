package com.example.android.guiadocientistamirim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LicaoDoMal4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licao_do_mal4);
    }

    public void cumprirLicao(View view){
        Intent it = new Intent(this, LicaoDoMal5.class);
        startActivity(it);
    }
}
