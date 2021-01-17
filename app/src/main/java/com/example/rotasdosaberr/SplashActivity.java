package com.example.rotasdosaberr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
    }

    public void irparahome(View view){
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();
    }
}