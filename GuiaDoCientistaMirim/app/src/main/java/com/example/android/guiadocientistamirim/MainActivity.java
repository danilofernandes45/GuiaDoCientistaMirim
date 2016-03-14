package com.example.android.guiadocientistamirim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText)findViewById(R.id.nome);

    }

    public void dominarMundo(View view){
        Intent it = new Intent(this, Index.class);
        it.putExtra("NOME", nome.getText().toString());
        startActivity(it);
    }

}
