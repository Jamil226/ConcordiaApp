package com.app.concordia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText firstName, lastName;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        firstName = findViewById(R.id.etFirstName);
        lastName = findViewById(R.id.etLastName);
        btnLogin = findViewById(R.id.btnLogin);

        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);

        btnLogin.setOnClickListener(v -> {
            if(firstName.getText().toString().length()<3){
                firstName.setError("Enter Your First Name");
                firstName.requestFocus();
            } else if(lastName.getText().toString().length()<3){
                lastName.setError("Enter Your Last Name");
                lastName.requestFocus();
            } else {
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                myEdit.putString("first_name", firstName.getText().toString());
                myEdit.putString("last_name", lastName.getText().toString());
                myEdit.apply();

                Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();

            }
        });
    }
}