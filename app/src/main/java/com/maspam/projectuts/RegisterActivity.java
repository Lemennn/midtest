package com.maspam.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.maspam.projectuts.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;

    String name,password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(binding.etNama.getText())){
                    binding.etNama.setError("Nama harus diisi");
                }else if(TextUtils.isEmpty(binding.etEmail.getText())){
                    binding.etEmail.setError("Email harus diisi");
                }else if(TextUtils.isEmpty(binding.etPassword.getText())){
                    binding.etPassword.setError("Password harus diisi");
                }else{

                    name = binding.etNama.getText().toString().trim();
                    password = binding.etPassword.getText().toString().trim();
                    email = binding.etEmail.getText().toString().trim();

                    Intent i = new Intent(RegisterActivity.this, RegisterSuccessActivity.class);
                    i.putExtra("name", name);
                    i.putExtra("email", email);
                    i.putExtra("password", password);
                    startActivity(i);
                }
            }
        });

        binding.tvSudahPunyaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}