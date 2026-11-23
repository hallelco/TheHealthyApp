package com.example.thehealthyapp;

import android.content.SharedPreferences;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {

            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if (name.isEmpty()){
                Toast.makeText(this, "יש להכניס שם מלא", Toast.LENGTH_SHORT).show();
            }
            if (email.isEmpty()){
                Toast.makeText(this, "יש להכניס כתובת מייל", Toast.LENGTH_SHORT).show();
            }
            if (password.isEmpty()){
                Toast.makeText(this, "יש להכניס סיסמא", Toast.LENGTH_SHORT).show();
            }

            else {

                SharedPreferences sp = getSharedPreferences("UserDetails", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("name", name);
                editor.putString("email", email);
                editor.putString("password", password);
                editor.apply();

                Toast.makeText(this, "נכנסת בהצלחה!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}