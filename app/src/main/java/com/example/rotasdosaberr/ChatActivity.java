package com.example.rotasdosaberr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
    public void home(View view){
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();
    }public void chat(View view){
        startActivity(new Intent(getApplicationContext(), ChatActivity.class));
        finish();
    }public void curso(View view){
        startActivity(new Intent(getApplicationContext(), CursosActivity.class));
        finish();
    }
}