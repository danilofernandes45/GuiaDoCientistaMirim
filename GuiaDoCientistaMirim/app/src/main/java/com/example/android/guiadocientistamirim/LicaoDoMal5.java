package com.example.android.guiadocientistamirim;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class LicaoDoMal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licao_do_mal5);
    }

    public void cumprirLicao(View view){
        AlertDialog.Builder exp = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        exp.setView(inflater.inflate(R.layout.explicacao_2, null))
                .setPositiveButton(R.string.next_lesson, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent it = new Intent(getApplicationContext(), LicaoDoMal1.class);
                        startActivity(it);
                    }
                })
                .setNegativeButton(R.string.back, null);
    }

    public void voltarInicio(View view){
        Intent it = new Intent(this, Index.class);
        startActivity(it);
    }
}
