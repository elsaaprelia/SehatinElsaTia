package com.example.sehatin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
    }

    public void handleBeranda(View view) {
        Intent intent = new Intent(this, BerandaActivity.class);
        startActivity(intent);
    }

    public void handleProfil(View view) {
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
    }

    public void handleChat(View view) {
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
    }

    public void handleLainnya(View view) {
        Intent intent = new Intent(this, LainnyaActivity.class);
        startActivity(intent);
    }
}