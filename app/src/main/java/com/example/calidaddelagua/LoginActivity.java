package com.example.calidaddelagua;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
          this.setTitle("BIENVENIDOS");
          getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}