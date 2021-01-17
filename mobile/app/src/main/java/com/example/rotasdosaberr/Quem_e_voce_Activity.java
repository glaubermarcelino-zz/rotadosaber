package com.example.rotasdosaberr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Quem_e_voce_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quem_e_voce_);
    }

    public void recrutador(View view){
        startActivity(new Intent(getApplicationContext(), CadastroActivity.class));
        finish();
    }public void aluno(View view){
        startActivity(new Intent(getApplicationContext(), CadastroActivity.class));
        finish();
    }
}