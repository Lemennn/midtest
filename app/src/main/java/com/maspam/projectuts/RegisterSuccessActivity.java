package com.maspam.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.maspam.projectuts.databinding.ActivityRegisterSuccessBinding;

public class RegisterSuccessActivity extends AppCompatActivity {

    private ActivityRegisterSuccessBinding binding;

    String name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = getIntent().getStringExtra("name");
                email = getIntent().getStringExtra("email");
                password = getIntent().getStringExtra("password");

                Intent i = new Intent(RegisterSuccessActivity.this, LoginActivity.class);
                i.putExtra("name", name);
                i.putExtra("email", email);
                i.putExtra("password", password);
                startActivity(i);
                finish();

            }
        });

    }
}