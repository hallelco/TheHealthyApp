
package com.example.thehealthyapp;

import android.content.SharedPreferences;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {

            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            SharedPreferences sp =
                    getSharedPreferences("UserDetails", MODE_PRIVATE);

            String savedEmail = sp.getString("email", "");
            String savedPassword = sp.getString("password", "");

            if (email.isEmpty()){
                Toast.makeText(this, "יש להכניס כתובת מייל", Toast.LENGTH_SHORT).show();
            }
            if (password.isEmpty()){
                Toast.makeText(this, "יש להכניס סיסמא", Toast.LENGTH_SHORT).show();
            }
            else if (email.equals(savedEmail)
                    && password.equals(savedPassword)
                    && !savedEmail.isEmpty()) {

                Toast.makeText(this, "נכנסת בהצלחה!",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(
                        LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            } else {
                Toast.makeText(this, "כתובת מייל או סיסמא לא נכונים",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
