package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void startGame(View view) {
        startActivity(new Intent(this, GameActivity.class));
    }
    public void viewProfile(View view) {startActivity(new Intent(this, ProfileActivity.class)); }
    public void gotoSettings(View view) { startActivity(new Intent(this, SettingsActivity.class)); }
    public void logout(View view) { FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();}
}