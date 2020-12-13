package com.example.sehatin;

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

    public void handleBeranda(View view) {
        Intent intent = new Intent(this, BerandaActivity.class);
        startActivity(intent);
    }

    public void handleRiwayat(View view) {
        Intent intent = new Intent(this, RiwayatActivity.class);
        startActivity(intent);
    }

    public void handleProfil(View view) {
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
    }

    public void handleLainnya(View view) {
        Intent intent = new Intent(this, LainnyaActivity.class);
        startActivity(intent);
    }
}