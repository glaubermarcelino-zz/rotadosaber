package com.example.rotasdosaberr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginEntrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logar(View view){
        startActivity(new Intent(getApplicationContext(), SplashActivity.class));
        finish();
    }

    public void cadastrar(View view){
        startActivity(new Intent(getApplicationContext(), CadastroActivity.class));
        finish();
    }
}