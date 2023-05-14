package com.maspam.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.maspam.projectuts.databinding.ActivityMenuActivityBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.etNama.setText(getIntent().getStringExtra("name"));
        binding.etEmail.setText(getIntent().getStringExtra("email"));
        binding.etPassword.setText(getIntent().getStringExtra("password"));
    }
}