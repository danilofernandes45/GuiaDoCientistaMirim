package com.example.android.guiadocientistamirim;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class LicaoDoMal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licao_do_mal3);
    }

    public void cumprirLicao(View view){

        AlertDialog.Builder exp = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view_exp = inflater.inflate(R.layout.explicacao, null);
        TextView txt = (TextView)view_exp.findViewById(R.id.txt_exp);
        txt.setText(R.string.exp3);

        exp.setView(view_exp)
                .setPositiveButton(R.string.next_lesson, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent it = new Intent(getApplicationContext(), LicaoDoMal4.class);
                        startActivity(it);
                        finish();
                    }
                })
                .setNegativeButton(R.string.back, null);
        exp.show();
    }

    public void voltarInicio(View view){
        finish();
    }

}
