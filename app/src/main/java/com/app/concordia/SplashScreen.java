package com.app.concordia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.app.concordia.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    ActivitySplashScreenBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        SharedPreferences sh = getSharedPreferences("login", MODE_PRIVATE);
        String s1 = sh.getString("first_name", "");
        String s2 = sh.getString("last_name", "");

        Toast.makeText(getApplicationContext(), s1 + s2, Toast.LENGTH_LONG).show();

        mBinding.btnHome.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), Login.class);
            startActivity(i);
        });



    }
}