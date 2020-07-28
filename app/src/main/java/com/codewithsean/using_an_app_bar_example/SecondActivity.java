package com.codewithsean.using_an_app_bar_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codewithsean.using_an_app_bar_example.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.app2ndToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}